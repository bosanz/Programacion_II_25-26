package es.deusto.ingenieria.progii.campushub;

public class Equipo extends Recurso {
	private String marca;
	private String modelo;
	private TipoEquipo tipoEquipo;

	public Equipo() {
		super();
	}

	public Equipo(String nombre, double costeReposicion, String marca, String modelo, TipoEquipo tipoEquipo) {
		super(nombre, costeReposicion);
		this.marca = marca;
		this.modelo = modelo;
		this.tipoEquipo = tipoEquipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public TipoEquipo getTipoEquipo() {
		return tipoEquipo;
	}

	public void setTipoEquipo(TipoEquipo tipoEquipo) {
		this.tipoEquipo = tipoEquipo;
	}

	@Override
	public String toString() {
		return "Equipo{" + "codigo=" + getCodigo() + ", nombre='" + getNombre() + '\'' + ", costeReposicion="
				+ getCosteReposicion() + ", disponible=" + isDisponible() + ", marca='" + marca + '\'' + ", modelo='"
				+ modelo + '\'' + ", tipoEquipo=" + tipoEquipo + ", reservadoPor="
				+ (getReservadoPor() == null ? "null" : getReservadoPor().getDni()) + '}';
	}
}