package es.deusto.ingenieria.progii.campushub;

public interface Reservable {
	boolean reservar(Estudiante e);

	boolean cancelar(Estudiante e);
}