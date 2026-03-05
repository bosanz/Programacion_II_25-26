package es.deusto.ingeneria.progii.scaperoom.herencia;

import java.util.Random;

public class PuzzleClave extends Puzzle {
	private final String solucionEsperada;

	public PuzzleClave(String id, String enunciado, boolean obligatorio, String solucionEsperada) {
		super(id, enunciado, obligatorio);
		this.solucionEsperada = solucionEsperada;
	}

	@Override
	protected boolean resolver(String solucion, Random rnd) {
		if (solucion == null)
			return false;
		return solucionEsperada != null && solucionEsperada.equals(solucion);
	}

	@Override
	public String getTipo() {
		return "CLAVE";
	}
}