package es.deusto.ingenieria.progii.ludoteca.model;

public interface Reservable {
	public boolean reservar(Usuaria u);
	public boolean anular(Usuaria u);
}
