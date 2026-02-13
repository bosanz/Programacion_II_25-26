package es.deusto.ingenieria.progii.poo.model;

public class Libro {
	
	
	// Propiedades
	
	private String titulo = "";
	private String autor = "";
	private int anyo = 0;
	private String isbn = "";
	
	// Constructores
	
	public Libro() { }
	
	public Libro(String titulo, String autor, int anyo, String isbn) {
		this.titulo = titulo;
		this.autor = autor;
		this.anyo = anyo;
		this.isbn = isbn;
	}
	
	public Libro(Libro l) {
		this.autor = l.getAutor();
		this.titulo = l.getTitulo();
		this.anyo = l.getAnyo();
		this.isbn = l.getIsbn();
	}

	
	// Métodos
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String toString() {
		return "Título: " + this.titulo + "; Autor: " + this.autor + "; Año: " + this.anyo;
	}
	
	
	
	
	

}
