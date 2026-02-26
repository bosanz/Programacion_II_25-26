package es.deusto.ingenieria.progii.cine;

public class Sesion {
	
	private FechaYHora fecha;
	private Sala sala;
	

	
	public Sesion(FechaYHora fecha, Sala sala) {
		super();
		this.fecha = fecha;
		this.sala = sala;
	}


	public Sesion(FechaYHora fecha) {
		super();
		this.fecha = fecha;
		this.sala = new Sala();
	}
	
	
	

}
