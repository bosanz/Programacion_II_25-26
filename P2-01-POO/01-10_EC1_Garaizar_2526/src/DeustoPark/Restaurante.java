package DeustoPark;

import java.util.ArrayList;

public class Restaurante implements Reservable{
	
	private String nombre;
	private int aforo;
	private TipoComida tipo;
	private ArrayList<Visitante> reservas = new ArrayList<Visitante>();
	
	
	public Restaurante(String nombre, int aforo, TipoComida tipo) {
		super();
		this.nombre = nombre;
		this.aforo = aforo;
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAforo() {
		return aforo;
	}
	public void setAforo(int aforo) {
		this.aforo = aforo;
	}
	public TipoComida getTipo() {
		return tipo;
	}
	public void setTipo(TipoComida tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Restaurante [nombre=" + nombre + ", aforo=" + aforo + ", tipo=" + tipo + "]";
	}
	@Override
	public boolean reservar(Visitante v) {
		
		if (v !=null & reservas.contains(v)) {
			reservas.add(v);
			return true;
		}else
			return false;
	}
	@Override
	public boolean cancelar(Visitante v) {
		if(v != null & !reservas.contains(v)) {
			reservas.remove(v);
			return true;
		}
		return false;
	}
	
	

}
