package es.deusto.ingenieria.progii.ec1_2526;

public class Entidad implements Movible{

	private int id;
	
	private static int nextId = 0;
	
	private String nombre;
	private int x;
	private int y;
	
	
	public Entidad(String nombre, int x, int y) {
		super();
		this.id = nextId;
		nextId++;
		this.nombre = nombre;
		this.x = x;
		this.y = y;
	}
	
	

	@Override
	public String toString() {
		return "Entidad [id=" + id + ", nombre=" + nombre + ", x=" + x + ", y=" + y + "]";
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}



	public int getId() {
		return id;
	}



	@Override
	public void arriba() {
		this.y++;
		
	}



	@Override
	public void abajo() {
		this.y--;
	}



	@Override
	public void izquierda() {
		this.x--;
		
	}



	@Override
	public void derecha() {
		this.x++;
		
	}
	
	
	
	
	
}
