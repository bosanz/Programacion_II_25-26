package es.deusto.ingeneria.progii.scaperoom.herencia;

import java.util.Random;

public class Partida {
	private final EscapeRoom escapeRoom;
	private final Grupo grupo;

	private Sala salaActual;

	private final int tiempoTotalMin;
	private int tiempoRestanteMin;

	private int intentosTotales;
	private int puzzlesResueltos;
	private int salasSuperadas;

	private final Random rnd;

	public Partida(EscapeRoom escapeRoom, Grupo grupo, int tiempoTotalMin, long seed) {
		this.escapeRoom = escapeRoom;
		this.grupo = grupo;
		this.tiempoTotalMin = Math.max(1, tiempoTotalMin);
		this.tiempoRestanteMin = this.tiempoTotalMin;
		this.rnd = new Random(seed);

		this.intentosTotales = 0;
		this.puzzlesResueltos = 0;
		this.salasSuperadas = 0;

		this.salaActual = (escapeRoom != null) ? escapeRoom.getSalaInicial() : null;
	}

	public void iniciar() {
		if (escapeRoom == null || grupo == null || salaActual == null || grupo.numeroJugadores() == 0) {
			System.out.println("No se puede iniciar la partida: faltan datos (escape room, sala inicial o jugadores).");
			return;
		}

		System.out.println("=== PARTIDA INICIADA ===");
		System.out.println("Escape Room: " + escapeRoom.getNombre());
		System.out.println("Grupo: " + grupo.getNombre() + " (" + grupo.numeroJugadores() + " jugadores)");
		System.out.println("Tiempo total: " + tiempoTotalMin + " min");
		System.out.println("Sala inicial: " + salaActual.getNombre());
		System.out.println();

		while (!haTerminado()) {
			turno();
		}

		System.out.println();
		System.out.println("=== PARTIDA FINALIZADA ===");
		System.out.println(haGanado() ? "Resultado: VICTORIA" : "Resultado: DERROTA");
		System.out.println("Tiempo consumido: " + (tiempoTotalMin - tiempoRestanteMin) + " min");
		System.out.println("Intentos totales: " + intentosTotales);
		System.out.println("Puzzles resueltos: " + puzzlesResueltos);
		System.out.println("Salas superadas: " + salasSuperadas + " / " + escapeRoom.numeroSalas());
	}

	private void turno() {
		if (salaActual == null)
			return;

		if (salaActual.estaSuperada()) {
			if (intentarAvanzarSala())
				return;
		}

		Jugador jugador = grupo.getJugadorAleatorio(rnd);
		Puzzle puzzle = salaActual.getPuzzlePendienteAleatorio(rnd);

		if (jugador == null || puzzle == null) {
			consumirTiempo(1);
			System.out.println("[SIN ACCIÓN] Tiempo restante: " + tiempoRestanteMin + " min");
			return;
		}

		int coste = 1 + rnd.nextInt(3); // 1..3
		consumirTiempo(coste);

		boolean estabaResuelto = puzzle.isResuelto();
		String propuesta = jugador.proponerSolucion(puzzle, rnd);
		boolean exito = puzzle.intentarResolver(propuesta, rnd);

		intentosTotales++;
		if (!estabaResuelto && puzzle.isResuelto())
			puzzlesResueltos++;

		System.out.println("Sala: " + salaActual.getNombre() + " | Jugador: " + jugador.getNombre() + " | Puzzle: "
				+ puzzle.getId() + (puzzle.isObligatorio() ? " (OBL)" : " (OPT)") + " | Intento #"
				+ puzzle.getIntentos() + " | " + (exito ? "ÉXITO" : "FALLO") + " | Tiempo restante: "
				+ tiempoRestanteMin + " min");
	}

	private boolean intentarAvanzarSala() {
		Sala siguiente = escapeRoom.getSiguienteSala(salaActual);
		if (siguiente == null) {
			salasSuperadas = escapeRoom.numeroSalas();
			salaActual = null; // completado
			return true;
		}
		salasSuperadas++;
		System.out.println(">>> Sala superada: " + salaActual.getNombre() + ". Avanzando a: " + siguiente.getNombre());
		salaActual = siguiente;
		return true;
	}

	private void consumirTiempo(int minutos) {
		tiempoRestanteMin -= Math.max(0, minutos);
		if (tiempoRestanteMin < 0)
			tiempoRestanteMin = 0;
	}

	public boolean haTerminado() {
		if (escapeRoom == null)
			return true;
		if (salaActual == null)
			return true; // victoria
		return tiempoRestanteMin <= 0; // derrota por tiempo
	}

	public boolean haGanado() {
		return salaActual == null;
	}
}