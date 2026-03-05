package es.deusto.ingenieria.progii.scaperoom;

import java.util.Random;

public class Puzzle {
	private final String id;
	private final String enunciado;
	private final boolean obligatorio;

	private boolean resuelto;
	private int intentos;

	// Para puzzles tipo CLAVE
	private final String solucionEsperada;

	// Para puzzles tipo PROB
	private final int probExitoPorIntento; // 0..100

	// "CLAVE" o "PROB"
	private final String tipo;

	// Puzzle de clave fija
	public Puzzle(String id, String enunciado, boolean obligatorio, String solucionEsperada) {
		this.id = id;
		this.enunciado = enunciado;
		this.obligatorio = obligatorio;
		this.solucionEsperada = solucionEsperada;
		this.tipo = "CLAVE";
		this.probExitoPorIntento = 0;

		this.resuelto = false;
		this.intentos = 0;
	}

	// Puzzle probabilístico
	public Puzzle(String id, String enunciado, boolean obligatorio, int probExitoPorIntento) {
		this.id = id;
		this.enunciado = enunciado;
		this.obligatorio = obligatorio;
		this.solucionEsperada = null;
		this.tipo = "PROB";
		this.probExitoPorIntento = clamp(probExitoPorIntento, 0, 100);

		this.resuelto = false;
		this.intentos = 0;
	}

	public String getId() {
		return id;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public boolean isObligatorio() {
		return obligatorio;
	}

	public boolean isResuelto() {
		return resuelto;
	}

	public int getIntentos() {
		return intentos;
	}

	public String getTipo() {
		return tipo;
	}

	// Punto de extensión: aquí puedes sustituir/expandir la validación de solución
	// “real”
	public boolean intentarResolver(String solucion, Random rnd) {
		if (resuelto)
			return true;
		intentos++;

		if ("CLAVE".equals(tipo)) {
			if (solucion == null)
				return false;
			resuelto = solucionEsperada != null && solucionEsperada.equals(solucion);
			return resuelto;
		} else {
			// PROB
			int roll = rnd.nextInt(100) + 1; // 1..100
			resuelto = roll <= probExitoPorIntento;
			return resuelto;
		}
	}

	/**
	 * Limita (acota) un valor entero a un rango cerrado [lo, hi].
	 * <ul>
	 * <li>Si {@code v < lo}, devuelve {@code lo}.</li>
	 * <li>Si {@code v > hi}, devuelve {@code hi}.</li>
	 * <li>En caso contrario, devuelve {@code v}.</li>
	 * </ul>
	 *
	 * @param v  valor a acotar
	 * @param lo límite inferior (incluido)
	 * @param hi límite superior (incluido)
	 * @return {@code v} acotado al rango [{@code lo}, {@code hi}]
	 */
	private static int clamp(int v, int lo, int hi) {
		return Math.max(lo, Math.min(hi, v));
	}
}