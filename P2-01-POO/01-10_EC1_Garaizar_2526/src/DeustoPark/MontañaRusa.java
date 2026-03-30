package DeustoPark;

import java.util.ArrayList;

public class MontañaRusa extends Atraccion implements Reservable{
	
	private double velocidadMaxima;
	private double alturaMinima;
	private ArrayList<Visitante> reservas = new ArrayList<Visitante>();
	

	@Override
	public boolean esApta(int edad) {
		// TODO Auto-generated method stub
		return false;
	}





	public MontañaRusa(String nombre, int capacidad, int intensidad, double velocidadMaxima, double alturaMinima) {
		super(nombre, capacidad, intensidad);
		this.velocidadMaxima = velocidadMaxima;
		this.alturaMinima = alturaMinima;
	}





	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}





	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}





	public double getAlturaMinima() {
		return alturaMinima;
	}





	public void setAlturaMinima(double alturaMinima) {
		this.alturaMinima = alturaMinima;
	}





	@Override
	public String toString() {
		return "MontañaRusa [velocidadMaxima=" + velocidadMaxima + ", alturaMinima=" + alturaMinima + ", reservas="
				+ reservas + "]";
	}





	@Override
	public boolean reservar(Visitante v) {
		
		if(v != null & !reservas.contains(v)) {
			reservas.add(v);
			return true;
		} else 
			return false;
	}


	@Override
	public boolean cancelar(Visitante v) {
		if(v != null & reservas.contains(v)) {
			reservas.remove(v);
			return true;
		} else 
			return false;
	}
	
	

}
