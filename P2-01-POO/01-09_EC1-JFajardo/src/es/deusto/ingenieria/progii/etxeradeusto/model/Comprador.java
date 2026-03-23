package es.deusto.ingenieria.progii.etxeradeusto.model;

public class Comprador extends Usuario {
	
	private double cantidadPagada;

	public Comprador() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Comprador(String nombre, String dni, String telefono, int edad, double cantidadPagada) {
		super(nombre, dni, telefono, edad);
		this.cantidadPagada = cantidadPagada;
	}


	public double getCantidadPagada() {
		return cantidadPagada;
	}


	public void setCantidadPagada(double cantidadPagada) {
		this.cantidadPagada = cantidadPagada;
	}


	@Override
	public String toString() {
		return "Comprador [cantidadPagada=" + cantidadPagada + "]";
	}
	
	

}
