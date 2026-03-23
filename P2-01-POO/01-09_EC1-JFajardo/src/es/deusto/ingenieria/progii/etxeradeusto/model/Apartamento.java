package es.deusto.ingenieria.progii.etxeradeusto.model;

public class Apartamento extends Vivienda{

	
	
	@Override
	public void reservar() {
		if (this.isDisponible())
			this.setDisponible(true);		
	}

	@Override
	public void cancelar() {
		if (this.isDisponible())
			this.setDisponible(false);
		
	}

	public Apartamento(int metrosCuadrados, String direccion, String nombreDueno, double precio, boolean disponible) {
		super(metrosCuadrados, direccion, nombreDueno, precio, disponible);
	}
	
	

}
