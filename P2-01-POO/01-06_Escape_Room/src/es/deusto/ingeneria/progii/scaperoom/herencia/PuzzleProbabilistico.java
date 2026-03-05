package es.deusto.ingeneria.progii.scaperoom.herencia;

import java.util.Random;

public class PuzzleProbabilistico extends Puzzle {
	private final int probExitoPorIntento; // 0..100

	public PuzzleProbabilistico(String id, String enunciado, boolean obligatorio, int probExitoPorIntento) {
		super(id, enunciado, obligatorio);
		this.probExitoPorIntento = clamp(probExitoPorIntento, 0, 100);
	}

	@Override
	protected boolean resolver(String solucion, Random rnd) {
		int roll = rnd.nextInt(100) + 1; // 1..100
		return roll <= probExitoPorIntento;
	}

	@Override
	public String getTipo() {
		return "PROB";
	}
}