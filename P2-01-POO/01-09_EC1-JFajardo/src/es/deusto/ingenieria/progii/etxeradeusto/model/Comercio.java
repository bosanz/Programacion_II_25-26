package es.deusto.ingenieria.progii.etxeradeusto.model;

public class Comercio extends Vivienda {
	
	private boolean tieneAlmacen;
	
	public Comercio() {
		tieneAlmacen = false;
	}
	
	
	
	@Override
	public void reservar() {
		if (this.isDisponible())
			this.setDisponible(true);	

	}

	@Override
	public void cancelar() {
		if (!this.isDisponible())
			this.setDisponible(false);	

	}

	

	public Comercio(boolean tieneAlmacen) {
		super();
		this.tieneAlmacen = tieneAlmacen;
	}



	public Comercio(int metrosCuadrados, String direccion, String nombreDueno, double precio, boolean disponible, boolean tieneAlmacen) {
		super(metrosCuadrados, direccion, nombreDueno, precio, disponible);
		this.tieneAlmacen = tieneAlmacen;
	}



	public boolean isTieneAlmacen() {
		return tieneAlmacen;
	}



	public void setTieneAlmacen(boolean tieneAlmacen) {
		this.tieneAlmacen = tieneAlmacen;
	}
	
	

}
