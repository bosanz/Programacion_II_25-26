package es.deusto.ingenieria.progii.campushub;

public class Sala extends Recurso {
	private int capacidad;
	private TipoSala tipoSala;

	public Sala() {
		super();
	}

	public Sala(String nombre, double costeReposicion, int capacidad, TipoSala tipoSala) {
		super(nombre, costeReposicion);
		this.capacidad = capacidad;
		this.tipoSala = tipoSala;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public TipoSala getTipoSala() {
		return tipoSala;
	}

	public void setTipoSala(TipoSala tipoSala) {
		this.tipoSala = tipoSala;
	}

	@Override
	public String toString() {
		return "Sala{" + "codigo=" + getCodigo() + ", nombre='" + getNombre() + '\'' + ", costeReposicion="
				+ getCosteReposicion() + ", disponible=" + isDisponible() + ", capacidad=" + capacidad + ", tipoSala="
				+ tipoSala + ", reservadoPor=" + (getReservadoPor() == null ? "null" : getReservadoPor().getDni())
				+ '}';
	}
}