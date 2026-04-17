package es.deusto.ingenieria.progii.peliculas;

import java.util.Iterator;
import java.util.List;

public class IteradorPeliculas implements Iterator<Pelicula>{

	private List<Pelicula> lista;
    private int posicion = 0;
	
    public IteradorPeliculas(List<Pelicula> lista) {
        this.lista = lista;
    }
    
	@Override
	public boolean hasNext() {
		// TODO: Devuelve true si aún quedan elementos por recorrer
        return posicion < lista.size();
	}

	@Override
	public Pelicula next() {
		// TODO: Devuelve el siguiente elemento y avanza la posición
        return lista.get(posicion++);
	}

}
