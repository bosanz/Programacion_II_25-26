package es.deusto.ingenieria.progii.etxeradeusto.model;

public abstract class Vivienda implements Reservable{

	private static int contadorId = 1;
	private int id = 0;
	private 	int metrosCuadrados;
	private String direccion;
	private String nombreDueno;
	private double precio;
	protected boolean disponible;
	
	
	public Vivienda() {
		this.id = contadorId++;
		this.metrosCuadrados = 0;
		this.direccion = "";
		this.nombreDueno = "";
		this.precio = 0.0;
		this.disponible = true;
	}


	public Vivienda(int metrosCuadrados, String direccion, String nombreDueno, double precio,
			boolean disponible) {
		super();
		this.id = contadorId++;
		this.metrosCuadrados = metrosCuadrados;
		this.direccion = direccion;
		this.nombreDueno = nombreDueno;
		this.precio = precio;
		this.disponible = disponible;
	}


	public static int getContadorId() {
		return contadorId;
	}


	public static void setContadorId(int contadorId) {
		Vivienda.contadorId = contadorId;
	}


	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}


	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getNombreDueno() {
		return nombreDueno;
	}


	public void setNombreDueno(String nombreDueno) {
		this.nombreDueno = nombreDueno;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public boolean isDisponible() {
		return disponible;
	}


	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}


	public int getId() {
		return id;
	}


	@Override
	public String toString() {
		return "Vivienda [id=" + id + ", metrosCuadrados=" + metrosCuadrados + ", direccion=" + direccion
				+ ", nombreDueno=" + nombreDueno + ", precio=" + precio + ", disponible=" + disponible + "]";
	}
	
	
	
	
	
}
