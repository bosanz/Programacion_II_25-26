package es.deusto.ingeneria.progii.scaperoom.herencia;

public class EscapeRoomApp {

	public static void main(String[] args) {
		EscapeRoom room = construirEscapeRoomDemo();
		Grupo grupo = construirGrupoDemo();

		Partida partida = new Partida(room, grupo, 25, 12345L);
		partida.iniciar();
	}

	private static EscapeRoom construirEscapeRoomDemo() {
		EscapeRoom room = new EscapeRoom("La Cámara de las Tres Puertas");

		Sala s1 = new Sala("Vestíbulo", 1);
		// Convención simple: para puzzles CLAVE, la solución esperada es "CORRECTA"
		s1.addPuzzle(new PuzzleClave("P1", "Encuentra el código del candado.", true, "CORRECTA"));
		s1.addPuzzle(new PuzzleProbabilistico("P2", "Alinea símbolos para activar el mecanismo.", false, 40));
		room.addSala(s1);

		Sala s2 = new Sala("Galería", 2);
		s2.addPuzzle(new PuzzleClave("P3", "Resuelve el panel numérico.", true, "CORRECTA"));
		s2.addPuzzle(new PuzzleProbabilistico("P4", "Reconstruye el mosaico.", true, 45));
		s2.addPuzzle(new PuzzleProbabilistico("P5", "Abre el compartimento oculto.", false, 35));
		room.addSala(s2);

		Sala s3 = new Sala("Cámara Final", 2);
		s3.addPuzzle(new PuzzleProbabilistico("P6", "Activa los interruptores en orden.", true, 50));
		s3.addPuzzle(new PuzzleClave("P7", "Introduce la clave de salida.", true, "CORRECTA"));
		room.addSala(s3);

		return room;
	}

	private static Grupo construirGrupoDemo() {
		Grupo grupo = new Grupo("Equipo Alfa");
		grupo.addJugador(new Jugador("Lucía", 21, 8, 5));
		grupo.addJugador(new Jugador("Diego", 20, 6, 7));
		grupo.addJugador(new Jugador("Marta", 22, 7, 6));
		return grupo;
	}
}