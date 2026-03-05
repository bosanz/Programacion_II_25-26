package es.deusto.ingeneria.progii.scaperoom.herencia;

import java.util.Random;

public abstract class Puzzle {
	private final String id;
	private final String enunciado;
	private final boolean obligatorio;

	private boolean resuelto;
	private int intentos;

	protected Puzzle(String id, String enunciado, boolean obligatorio) {
		this.id = id;
		this.enunciado = enunciado;
		this.obligatorio = obligatorio;
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

	// Método común (plantilla): gestiona intentos y estado resuelto.
	public final boolean intentarResolver(String solucion, Random rnd) {
		if (resuelto)
			return true;
		intentos++;

		boolean exito = resolver(solucion, rnd); // <-- POLIMORFISMO
		if (exito)
			resuelto = true;
		return exito;
	}

	// Cada tipo de puzzle define su propia forma de resolver.
	protected abstract boolean resolver(String solucion, Random rnd);

	public abstract String getTipo();

	protected static int clamp(int v, int lo, int hi) {
		return Math.max(lo, Math.min(hi, v));
	}
}