package es.deusto.ingenieria.progii.cine;

public class Pelicula {
	
	private String titulo;
	private int duracion;
	private String director;
	private int edadMinima;
	private double precio;
	
	public Pelicula() {
		this.titulo = "";
		this.duracion = -1;
		this.director = "";
		this.edadMinima = -1;
	}
	
	
	public Pelicula(String titulo, int duracion, String director, int edadMinima, double precio) {
		super();
		this.titulo = titulo;
		this.duracion = duracion;
		this.director = director;
		this.edadMinima = edadMinima;
		this.precio = precio;
	}
	
	public Pelicula(Pelicula p) {
		super();
		this.titulo = p.getTitulo();
		this.duracion = p.getDuracion();
		this.director = p.getDirector();
		this.edadMinima = p.getEdadMinima();
		this.precio = p.getPrecio();
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getEdadMinima() {
		return edadMinima;
	}
	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}

	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	@Override
	public String toString() {
		return "Titulo=" + titulo + ", duracion=" + duracion + ", director=" + director + ", edadMinima="
				+ edadMinima;
	}



	
}
