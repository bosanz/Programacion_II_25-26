package es.deusto.ingenieria.progii.ludoteca.model;

public class Trabajadora extends Persona {
	
	private String dni;
	
	public Trabajadora() {
		super();
		this.dni = "";
	}

	public Trabajadora(String dni) {
		super();
		this.dni = dni;
	}
	
	

	public Trabajadora(String nombre, int edad, String dni) {
		super(nombre, edad);

		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Trabajadora [nombre= "+ getNombre() +"; dni=" + dni + "]";
	}
	
	
	
	
}
