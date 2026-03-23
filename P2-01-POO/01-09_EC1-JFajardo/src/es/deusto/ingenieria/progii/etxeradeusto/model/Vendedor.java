package es.deusto.ingenieria.progii.etxeradeusto.model;

public class Vendedor extends Usuario {
	
	private boolean inversionista;

	public Vendedor(String nombre, String dni, String telefono, int edad, boolean inversionista) {
		super(nombre, dni, telefono, edad);
		this.inversionista = inversionista;
	}

	public boolean isInversionista() {
		return inversionista;
	}

	public void setInversionista(boolean inversionista) {
		this.inversionista = inversionista;
	}

	@Override
	public String toString() {
		return "Vendedor [inversionista=" + inversionista + "]";
	}
	
	

}
