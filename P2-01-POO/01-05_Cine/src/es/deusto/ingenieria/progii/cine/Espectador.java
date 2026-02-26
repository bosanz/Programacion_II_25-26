package es.deusto.ingenieria.progii.cine;

public class Espectador {
	
	private String nombre;
	private int edad;
	private double dinero;
	
	
	// Constructores
	
	public Espectador() {
		this.nombre = "";
		this.dinero = -1.0;
		this.edad = -1;		
	}
	
	public Espectador(String nombre, int edad, double dinero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}
	
	public Espectador(Espectador e) {
		this.nombre = e.getNombre();
		this.dinero = e.getDinero();
		this.edad = e.getEdad();		
	}

	
	// Getters y Setters
	
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

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	
	// Métodos
	
	public boolean pagar(double precio) {			
		if (this.dinero > precio){
			this.dinero = this.dinero - precio;
			return true;
		} else 
			return false;
	}

}
