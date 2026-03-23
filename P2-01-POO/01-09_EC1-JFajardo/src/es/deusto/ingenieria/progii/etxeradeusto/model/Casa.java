package es.deusto.ingenieria.progii.etxeradeusto.model;

public class Casa extends Vivienda {

	private String categoria;
	
	public Casa() {
		this.categoria = "";
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



	public Casa(int metrosCuadrados, String direccion, String nombreDueno, double precio, boolean disponible, String categoria) {
		super(metrosCuadrados, direccion, nombreDueno, precio, disponible);
		this.categoria = categoria;
	}



	public String getCategoria() {
		return categoria;
	}



	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	

}
