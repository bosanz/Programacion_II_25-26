package es.deusto.ingenieria.progii.etxeradeusto.model;

public class Arrendatario extends Usuario {
	
	private int tiempoArrendamientoMeses;

	public Arrendatario(String nombre, String dni, String telefono, int edad, int tiempoArrendamientoMeses) {
		super(nombre, dni, telefono, edad);
		this.tiempoArrendamientoMeses = tiempoArrendamientoMeses;
	}

	public int getTiempoArrendamientoMeses() {
		return tiempoArrendamientoMeses;
	}

	public void setTiempoArrendamientoMeses(int tiempoArrendamientoMeses) {
		this.tiempoArrendamientoMeses = tiempoArrendamientoMeses;
	}

	@Override
	public String toString() {
		return this.getNombre() + "; "+this.getDni();
	}


	
	

}
