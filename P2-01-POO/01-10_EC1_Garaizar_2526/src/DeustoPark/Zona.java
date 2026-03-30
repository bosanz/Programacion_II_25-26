package DeustoPark;

import java.awt.Color;
import java.util.ArrayList;

public class Zona {
	
	private String nombre;
	private Color color;
	private int aforoMax;
	private ArrayList<Atraccion> aAtraccion = new ArrayList<Atraccion>();
	private ArrayList<Restaurante> aRestaruantes = new ArrayList<Restaurante>();
	
	
	public Zona(String nombre, Color color, int aforoMax) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.aforoMax = aforoMax;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public int getAforoMax() {
		return aforoMax;
	}
	public void setAforoMax(int aforoMax) {
		this.aforoMax = aforoMax;
	}
	@Override
	public String toString() {
		return "Zona [nombre=" + nombre + ", color=" + color + ", aforoMax=" + aforoMax + "]";
	}

	public ArrayList<Atraccion> getaAtraccion() {
		return aAtraccion;
	}

	public void setaAtraccion(ArrayList<Atraccion> aAtraccion) {
		this.aAtraccion = aAtraccion;
	}

	public ArrayList<Restaurante> getaRestaruantes() {
		return aRestaruantes;
	}

	public void setaRestaruantes(ArrayList<Restaurante> aRestaruantes) {
		this.aRestaruantes = aRestaruantes;
	}
	
	public void añadirRestaruante(Restaurante r) {
		this.aRestaruantes.add(r);
	}
	
	public void añadirAtraccion(Atraccion a) {
		this.aAtraccion.add(a);
	}



	public Zona(String nombre, Color color, int aforoMax, ArrayList<Atraccion> aAtraccion,
			ArrayList<Restaurante> aRestaruantes) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.aforoMax = aforoMax;
		this.aAtraccion = aAtraccion;
		this.aRestaruantes = aRestaruantes;
	}
	
	public Zona() { 
		nombre = "";
		color = Color.WHITE;
		aforoMax = 0;
	}
	

}
