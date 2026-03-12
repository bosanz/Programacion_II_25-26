package es.deusto.ingenieria.progii.ludoteca.model;

public abstract class Persona {
	
	private String nombre;
	private int edad;
	
	public Persona() {
		this.nombre = "";
		this.edad = -1;
	}

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	

}
