package es.deusto.ingenieria.progii.ludoteca.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Actividad implements Reservable {
	
	private String descripcion ="";
	private TipoActividad tipo;
	private LocalDate fecha;
	private ArrayList<Usuaria> asistentes = new ArrayList<Usuaria>();
	private Trabajadora responsable=null;

	public Actividad(String descripcion, TipoActividad tipo, LocalDate fecha, ArrayList<Usuaria> asistentes, Trabajadora t) {
		super();
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.fecha = fecha;
		this.asistentes = asistentes;
		this.responsable=t;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public TipoActividad getTipo() {
		return tipo;
	}

	public void setTipo(TipoActividad tipo) {
		this.tipo = tipo;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public ArrayList<Usuaria> getAsistentes() {
		return asistentes;
	}

	public void setAsistentes(ArrayList<Usuaria> asistentes) {
		this.asistentes = asistentes;
	}



	@Override
	public boolean reservar(Usuaria u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean anular(Usuaria u) {
		// TODO Auto-generated method stub
		return false;
	}

	
	@Override
	public String toString() {
		return "Actividad [descripcion=" + descripcion + ", tipo=" + tipo + ", fecha=" + fecha + ", asistentes="
				+ asistentes + "]";
	}
}
