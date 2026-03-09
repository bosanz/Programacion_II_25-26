package es.deusto.ingenieria.progii.campushub;

import java.time.LocalDate;
import java.util.ArrayList;

public class Evento implements Reservable {
	private static int contador = 1;

	private final int id;
	private String nombre;
	private LocalDate fecha;
	private double coste;
	private TipoEvento tipo;

	private ArrayList<Estudiante> asistentes = new ArrayList<>();

	public Evento() {
		this.id = contador++;
	}

	public Evento(String nombre, LocalDate fecha, double coste, TipoEvento tipo) {
		this.id = contador++;
		this.nombre = nombre;
		this.fecha = fecha;
		this.coste = coste;
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	} // sin setter

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public double getCoste() {
		return coste;
	}

	public void setCoste(double coste) {
		this.coste = coste;
	}

	public TipoEvento getTipo() {
		return tipo;
	}

	public void setTipo(TipoEvento tipo) {
		this.tipo = tipo;
	}

	public ArrayList<Estudiante> getAsistentes() {
		return asistentes;
	}

	@Override
	public boolean reservar(Estudiante e) {
		if (e == null)
			return false;
		if (asistentes.contains(e))
			return false;
		asistentes.add(e);
		return true;
	}

	@Override
	public boolean cancelar(Estudiante e) {
		if (e == null)
			return false;
		return asistentes.remove(e);
	}

	public void financiar(double cantidad) {
		if (cantidad <= 0)
			return;

		double descuento = 0.0;
		if (tipo == TipoEvento.ENTRADA)
			descuento = 0.10 * cantidad;
		else if (tipo == TipoEvento.INTERNO)
			descuento = 0.30 * cantidad;
		// PATROCINADO: descuento = 0

		coste -= descuento;
		if (coste < 0)
			coste = 0.0;
	}

	@Override
	public String toString() {
		return "Evento{" + "id=" + id + ", nombre='" + nombre + '\'' + ", fecha=" + fecha + ", coste=" + coste
				+ ", tipo=" + tipo + ", asistentes=" + asistentes.size() + '}';
	}
}