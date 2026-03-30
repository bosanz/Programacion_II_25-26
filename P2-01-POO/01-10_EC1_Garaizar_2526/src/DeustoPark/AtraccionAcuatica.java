package DeustoPark;

public class AtraccionAcuatica extends Atraccion {
	
	private double volumenAgua;
	private int asientosBarca;


	public AtraccionAcuatica(String nombre, int capacidad, int intensidad, double volumenAgua, int asientosBarca) {
		super(nombre, capacidad, intensidad);
		this.volumenAgua = volumenAgua;
		this.asientosBarca = asientosBarca;
	}


	public double getVolumenAgua() {
		return volumenAgua;
	}


	public void setVolumenAgua(double volumenAgua) {
		this.volumenAgua = volumenAgua;
	}


	public int getAsientosBarca() {
		return asientosBarca;
	}


	public void setAsientosBarca(int asientosBarca) {
		this.asientosBarca = asientosBarca;
	}


	@Override
	public String toString() {
		return "AtraccionAcuatica [volumenAgua=" + volumenAgua + ", asientosBarca=" + asientosBarca + "]";
	}
	
	@Override
	public boolean esApta(int edad) {
		return true;
	}
	

}
