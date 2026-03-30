package es.deusto.ingenieria.progii.ec1_2526;

public class Objeto {
	private String nombre;
	private Rareza rareza;
	public Objeto(String nombre, Rareza rareza) {
		super();
		this.nombre = nombre;
		this.rareza = rareza;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Rareza getRareza() {
		return rareza;
	}
	public void setRareza(Rareza rareza) {
		this.rareza = rareza;
	}
	@Override
	public String toString() {
		return "Objeto [nombre=" + nombre + ", rareza=" + rareza + "]";
	}
	
	
	
	
}
