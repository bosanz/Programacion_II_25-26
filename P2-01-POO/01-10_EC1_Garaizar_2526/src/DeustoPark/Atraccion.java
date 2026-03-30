package DeustoPark;

public abstract class Atraccion {
	
	private String nombre;
	private int capacidad;
	private int intensidad;
	
	public Atraccion(String nombre, int capacidad, int intensidad) {
		super();
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.intensidad = intensidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getIntensidad() {
		return intensidad;
	}

	public void setIntensidad(int intensidad) {
		this.intensidad = intensidad;
	}

	@Override
	public String toString() {
		return "Atraccion [nombre=" + nombre + ", capacidad=" + capacidad + ", intensidad=" + intensidad + "]";
	}
	
	public abstract boolean esApta(int edad);

}
