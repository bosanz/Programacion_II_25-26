package es.deusto.ingeneria.progii.scaperoom.herencia;

import java.util.Random;

public class Jugador {
	private final String nombre;
	private final int edad;
	private final int habilidadLogica; // 0..10
	private final int habilidadDestreza; // 0..10

	public Jugador(String nombre, int edad, int habilidadLogica, int habilidadDestreza) {
		this.nombre = nombre;
		this.edad = edad;
		this.habilidadLogica = clamp(habilidadLogica, 0, 10);
		this.habilidadDestreza = clamp(habilidadDestreza, 0, 10);
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	// Genera una “propuesta” simple. Para CLAVE: a veces acierta devolviendo
	// "CORRECTA".
	public String proponerSolucion(Puzzle puzzle, Random rnd) {
		if ("CLAVE".equals(puzzle.getTipo())) {
			int base = 20 + 5 * habilidadLogica + 3 * habilidadDestreza; // aprox 20..100
			int roll = rnd.nextInt(100) + 1;
			if (roll <= Math.min(95, base))
				return "CORRECTA";
			return String.valueOf(rnd.nextInt(9000) + 1000);
		}
		return "";
	}

	private static int clamp(int v, int lo, int hi) {
		return Math.max(lo, Math.min(hi, v));
	}
}