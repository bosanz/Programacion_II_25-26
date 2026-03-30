package es.deusto.ingenieria.progii.ec1_2526;

public class Jugador extends Entidad implements Comparable<Jugador>{
	
	
	private int experiencia;
	private Inventario inventario;
	
	public Jugador(String nombre, int x, int y, int experiencia, Inventario inventario) {
		super(nombre, x, y);
		this.experiencia = experiencia;
		this.inventario = inventario;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public Inventario getInventario() {
		return inventario;
	}

	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}

	@Override
	public String toString() {
		return "Jugador [nombre = "+this.getNombre()+"; experiencia=" + experiencia + ", posicion: ["+this.getX()+","+this.getY()+"], Inventario: "+this.getInventario();
	}

	@Override
	public int compareTo(Jugador o) {
		// TODO Auto-generated method stub
		return Integer.compare(o.getExperiencia(), this.experiencia);
	}
	
	

}
