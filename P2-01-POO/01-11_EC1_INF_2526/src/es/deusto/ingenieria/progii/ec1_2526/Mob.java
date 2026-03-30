package es.deusto.ingenieria.progii.ec1_2526;

public class Mob extends Entidad{

	private boolean hostil;
	private double salud;
	
	public Mob(String nombre, int x, int y) {
		super(nombre, x, y);
	}

	public Mob(String nombre, int x, int y, boolean hostil, double salud) {
		super(nombre, x, y);
		this.hostil = hostil;
		this.salud = salud;
	}

	public boolean isHostil() {
		return hostil;
	}

	public void setHostil(boolean hostil) {
		this.hostil = hostil;
	}

	public double getSalud() {
		return salud;
	}

	public void setSalud(double salud) {
		this.salud = salud;
	}

	@Override
	public String toString() {
		return "Mob [hostil=" + hostil + ", salud=" + salud + "]";
	}
	
	
}
