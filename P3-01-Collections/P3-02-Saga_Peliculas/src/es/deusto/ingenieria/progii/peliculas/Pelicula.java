package es.deusto.ingenieria.progii.peliculas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pelicula implements Comparable<Pelicula>{
	
	private String nombre;
	private LocalDate fecha;
	private String categoria;
	public Pelicula(String nombre, LocalDate fecha, String categoria) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.categoria = categoria;
	}
	public Pelicula() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern( "dd/MM/yy" );
	
	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", fecha=" + fecha + ", categoria=" + categoria + "]";
	}
	@Override
	public int compareTo(Pelicula o) {
		// TODO Auto-generated method stub
		return this.nombre.compareToIgnoreCase(o.nombre);
	}

	
}
