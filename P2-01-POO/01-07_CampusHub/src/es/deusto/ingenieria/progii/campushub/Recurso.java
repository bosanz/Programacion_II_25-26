package es.deusto.ingenieria.progii.campushub;

public abstract class Recurso implements Reservable {
	private static int contador = 1;

	private final int codigo;
	private String nombre;
	private double costeReposicion;
	private boolean disponible;

	// Para que "cancelar tenga sentido", guardamos quién lo reservó
	private Estudiante reservadoPor;

	public Recurso() {
		this.codigo = contador++;
		this.disponible = true;
	}

	public Recurso(String nombre, double costeReposicion) {
		this.codigo = contador++;
		this.nombre = nombre;
		this.costeReposicion = costeReposicion;
		this.disponible = true;
	}

	public int getCodigo() {
		return codigo;
	} // sin setter

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCosteReposicion() {
		return costeReposicion;
	}

	public void setCosteReposicion(double costeReposicion) {
		this.costeReposicion = costeReposicion;
	}

	public boolean isDisponible() {
		return disponible;
	}

	protected void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public Estudiante getReservadoPor() {
		return reservadoPor;
	}

	protected void setReservadoPor(Estudiante reservadoPor) {
		this.reservadoPor = reservadoPor;
	}

	@Override
	public boolean reservar(Estudiante e) {
		if (e == null)
			return false;
		if (!disponible)
			return false;

		disponible = false;
		reservadoPor = e;
		return true;
	}

	@Override
	public boolean cancelar(Estudiante e) {
		if (e == null)
			return false;
		if (disponible)
			return false; // no tiene sentido cancelar si ya está disponible
		if (reservadoPor == null)
			return false;
		if (!reservadoPor.equals(e))
			return false; // solo puede cancelar quien reservó

		disponible = true;
		reservadoPor = null;
		return true;
	}

	@Override
	public String toString() {
		return "Recurso{" + "codigo=" + codigo + ", nombre='" + nombre + '\'' + ", costeReposicion=" + costeReposicion
				+ ", disponible=" + disponible + ", reservadoPor="
				+ (reservadoPor == null ? "null" : reservadoPor.getDni()) + '}';
	}
}