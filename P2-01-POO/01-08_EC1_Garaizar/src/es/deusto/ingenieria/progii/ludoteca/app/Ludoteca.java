package es.deusto.ingenieria.progii.ludoteca.app;

import java.util.ArrayList;

import es.deusto.ingenieria.progii.ludoteca.model.Actividad;
import es.deusto.ingenieria.progii.ludoteca.model.Recurso;
import es.deusto.ingenieria.progii.ludoteca.model.Libro;

public class Ludoteca {
	
	public static Actividad actividadMasPopular(ArrayList<Actividad> aActividades) {
		
		Actividad masPopular = aActividades.get(0);
		
		for (Actividad a: aActividades) {
			if(a != null) {
				if(a.getAsistentes().size() > masPopular.getAsistentes().size()) {
					masPopular = a;
				}
			}
		}
		
		return masPopular;
	}
	
	public static ArrayList<Recurso> recursosReservables(ArrayList<Recurso> aRecursos){
		
		ArrayList<Recurso> resultado = new ArrayList<Recurso>();
		
		for(Recurso r : aRecursos) {
			if(r != null && 
					r instanceof Libro && 
					((Libro)r).getReservadoPor() == null) {
				resultado.add(r);
			}
		}
		
		return resultado;
	}

}
