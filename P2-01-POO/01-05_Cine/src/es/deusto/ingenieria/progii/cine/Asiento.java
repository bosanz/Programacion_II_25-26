package es.deusto.ingenieria.progii.cine;

public class Asiento {
	
	private int fila;
	private char columna;
	private boolean ocupado;
	
	public Asiento() {
		this.fila = -1;
		this.columna = 'Z';
		this.ocupado = false;
	}
	
	public Asiento(int fila, char columna, boolean ocupado) {
		super();
		this.fila = fila;
		this.columna = columna;
		this.ocupado = ocupado;
	}
	
	public Asiento(Asiento a) {
		this.fila = a.getFila();
		this.columna = a.getColumna();
		this.ocupado = a.isOcupado();
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public char getColumna() {
		return columna;
	}

	public void setColumna(char columna) {
		this.columna = columna;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	@Override
	public String toString() {
		
		// if this.ocupado{
		//		tmp = "[X]";
		// else
		//		tmp = "[ ]";
		String tmp = this.ocupado ? "[X]" : "[ ]";
		return "Asiento "+fila + ":" + columna + "; ocupado=" + tmp + "]";
	}
	
	
	
	

}
