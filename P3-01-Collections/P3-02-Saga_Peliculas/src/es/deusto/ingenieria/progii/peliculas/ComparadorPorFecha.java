package es.deusto.ingenieria.progii.peliculas;

import java.util.Comparator;

public class ComparadorPorFecha implements Comparator<Pelicula>{

	@Override
	public int compare(Pelicula p1, Pelicula p2) {
		// TODO Auto-generated method stub
		return p1.getFecha().compareTo(p2.getFecha());
	}

}
