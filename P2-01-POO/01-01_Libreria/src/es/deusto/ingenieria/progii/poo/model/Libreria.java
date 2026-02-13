package es.deusto.ingenieria.progii.poo.model;

public class Libreria {
	
	// Propiedades
	
	private String nombre;
	private String calle = "";
	private String localidad = "";
	private String cp = "";
	private int precio = 0;
	
	// Constructores
	
	public Libreria(){
		nombre = "";
	}
	
	public Libreria(String nombre) {
		this.nombre = nombre;
	}
	
	public Libreria(String nombre, String calle, String localidad, String cp) {
		this.nombre = nombre;
		this.calle = calle;
		this.localidad = localidad;
		this.cp = cp;
	}
	
	public Libreria(Libreria l) {
		this.nombre = l.nombre;
		this.localidad = l.localidad;
		this.calle = l.calle;
		this.cp = l.cp;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getCalle() {
		return this.calle;
	}
	
	public String getLocalidad() {
		return this.localidad;
	}
	
	public String getCp() {
		return this.cp;
	}
	
	/**
	 * @param calle the calle to set
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}

	/**
	 * @param localidad the localidad to set
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	/**
	 * @param cp the cp to set
	 */
	public void setCp(String cp) {
		this.cp = cp;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Libreria [nombre=" + nombre + ", calle=" + calle + ", localidad=" + localidad + ", cp=" + cp + "]";
	}
	
	public void setPrecio(int precio) {
		if (precio > 0) {
			this.precio = precio;
		}
	}
	

}
