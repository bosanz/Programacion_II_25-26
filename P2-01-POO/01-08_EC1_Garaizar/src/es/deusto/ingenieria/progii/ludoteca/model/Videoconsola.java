package es.deusto.ingenieria.progii.ludoteca.model;

public class Videoconsola extends Recurso {
	
	private String marca = "";
	private String modelo = "";
	public Videoconsola(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public String toString() {
		return "Videoconsola [marca=" + marca + ", modelo=" + modelo + "]";
	}
	@Override
	public boolean esFamiliar() {
		if(this.marca.equalsIgnoreCase("Nintendo")) {
			return true;
		}
		return false;
	}
	
	

}
