package DeustoPark;

public class AtraccionInfantil extends Atraccion {
	
	private int edadMinima;
	
	private int edadMaxima;

	public AtraccionInfantil(String nombre, int capacidad, int intensidad, int edadMinima, int edadMaxima) {
		super(nombre, capacidad, intensidad);
		this.edadMinima = edadMinima;
		this.edadMaxima = edadMaxima;
	}



	public int getEdadMinima() {
		return edadMinima;
	}



	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}



	public int getEdadMaxima() {
		return edadMaxima;
	}



	public void setEdadMaxima(int edadMaxima) {
		this.edadMaxima = edadMaxima;
	}



	@Override
	public String toString() {
		return "AtraccionInfantil [edadMinima=" + edadMinima + ", edadMaxima=" + edadMaxima + "]";
	}
	
	@Override
	public boolean esApta(int edad) {
		if(edad >= this.edadMinima & edad <= this.edadMaxima)
			return true;
		else
			return false;
	}

	

}
