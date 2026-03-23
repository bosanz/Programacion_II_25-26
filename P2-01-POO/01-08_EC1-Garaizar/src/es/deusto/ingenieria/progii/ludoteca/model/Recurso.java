package es.deusto.ingenieria.progii.ludoteca.model;

public abstract class Recurso {
	
	protected static int contador = 1;
	private int codigo;
	
	private String titulo="";
	
	
	public Recurso() {
		codigo = contador;
		contador++;
	}
	
	public abstract boolean esFamiliar();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
