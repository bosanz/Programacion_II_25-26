package es.deusto.ingenieria.progii.ludoteca.model;

public class Libro extends Recurso implements Reservable{

	private String titulo = "";
	private String autoria = "";
	private String genero = "";
	private Usuaria reservadoPor = null;

	public Libro(String titulo, String autoria, String genero, Usuaria reservadoPor) {
		super();
		this.titulo = titulo;
		this.autoria = autoria;
		this.genero = genero;
		this.reservadoPor = reservadoPor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutoria() {
		return autoria;
	}

	public void setAutoria(String autoria) {
		this.autoria = autoria;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Usuaria getReservadoPor() {
		return reservadoPor;
	}

	public void setReservadoPor(Usuaria reservadoPor) {
		this.reservadoPor = reservadoPor;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autoria=" + autoria + ", genero=" + genero + ", reservadoPor="
				+ reservadoPor + "]";
	}

	@Override
	public boolean esFamiliar() {
		if (this.genero.equalsIgnoreCase("humor")) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean reservar(Usuaria u) {
		if(u != null) {
			this.reservadoPor = u;
			return true;
		}
		return false;
	}

	@Override
	public boolean anular(Usuaria u) {
		if(u!= null && 
				this.reservadoPor != null &&
				this.reservadoPor.equals(u)) {
			this.reservadoPor = null;
			return true;
		}
		return false;
	}

}
