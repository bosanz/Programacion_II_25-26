package es.deusto.ingenieria.progii.peliculas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SagaPeliculas {
	private String nombreSaga;
	private ArrayList<Pelicula> listaPelis = new ArrayList<>();
	public SagaPeliculas(String nombreSaga, ArrayList<Pelicula> listaPelis) {
		super();
		this.nombreSaga = nombreSaga;
		this.listaPelis = listaPelis;
	}
	public SagaPeliculas() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNombreSaga() {
		return nombreSaga;
	}
	public void setNombreSaga(String nombreSaga) {
		this.nombreSaga = nombreSaga;
	}
	public ArrayList<Pelicula> getListaPelis() {
		return listaPelis;
	}
	public void setListaPelis(ArrayList<Pelicula> listaPelis) {
		this.listaPelis = listaPelis;
	}
	@Override
	public String toString() {
		return "SagaPeliculas [nombreSaga=" + nombreSaga + ", listaPelis=" + listaPelis + "]";
	}
	
	public Map<String, ArrayList<String>> mapaPeliculasCategoria (){
		Map<String, ArrayList<String>> mapa = new HashMap<String, ArrayList<String>>();
		for(Pelicula pelicula : listaPelis) {
			if(!mapa.containsKey(pelicula.getCategoria())) {
				mapa.put(pelicula.getCategoria(), new ArrayList<String>());
			}
			mapa.get(pelicula.getCategoria()).add(pelicula.getNombre());
		}
		
		return mapa;
	}
}
