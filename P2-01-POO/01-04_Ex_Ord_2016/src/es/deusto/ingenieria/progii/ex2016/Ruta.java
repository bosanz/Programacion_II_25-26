package es.deusto.ingenieria.progii.ex2016;

public class Ruta {
	private String origen;
	private String destino;
	private boolean controladaPrimeraOrden;

	public Ruta(String origen, String destino, boolean controladaPrimeraOrden) {
		this.origen = origen;
		this.destino = destino;
		this.controladaPrimeraOrden = controladaPrimeraOrden;
	}

	public Ruta() {
		this.origen = "";
		this.destino = "";
		this.controladaPrimeraOrden = false;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public boolean isControladaPrimeraOrden() {
		return controladaPrimeraOrden;
	}

	public void setControladaPrimeraOrden(boolean controladaPrimeraOrden) {
		this.controladaPrimeraOrden = controladaPrimeraOrden;
	}
}