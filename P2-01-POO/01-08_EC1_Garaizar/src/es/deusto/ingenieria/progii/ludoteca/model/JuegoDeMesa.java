package es.deusto.ingenieria.progii.ludoteca.model;

public class JuegoDeMesa extends Recurso implements Comparable<JuegoDeMesa>{
	
	private int duracion = 0;
	private int edad = -1;
	public JuegoDeMesa(int duracion, int edad) {
		super();
		this.duracion = duracion;
		this.edad = edad;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "JuegoDeMesa [duracion=" + duracion + ", edad=" + edad + "]";
	}
	@Override
	public boolean esFamiliar() {
		if(this.edad < 10) {
			return true;
		}
		return false;
	}
	@Override
	public int compareTo(JuegoDeMesa otro) {
		
		// return Integer.compare(edad, otro.getEdad());
		if (this.edad == otro.getEdad()) {
			return 0;
		} else {
			if(this.edad > otro.getEdad()) {
				return 1;
			} else {
				return -1;
			}
		}
	}
	
	

}
