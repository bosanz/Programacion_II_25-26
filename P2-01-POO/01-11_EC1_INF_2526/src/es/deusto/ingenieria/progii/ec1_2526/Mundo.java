package es.deusto.ingenieria.progii.ec1_2526;

import java.util.ArrayList;
import java.util.List;

public class Mundo {
	
	private List<Entidad> entidades = new ArrayList<Entidad>();
	
	public Mundo() {
		
	}
	
	
	
	public List<Objeto> obtenerObjetosLegendarios(String nombre) {
		for(Entidad e: entidades) {
			if (e instanceof Jugador) {
				if (e.getNombre().equals(nombre)) {
					return ((Jugador) e).getInventario().devolverObjetosPorTipo(Rareza.LEGENDARIA);
				}
			}
		}
		return null;	
	}
	
	public int contadorMobsHostiles() {
		int contador = 0;
		for(Entidad e: entidades) {
			if(e instanceof Mob) {
				if(((Mob) e).isHostil()) {
					contador++;
				}
			}
		}
		
		return contador;
	}
	
	public Entidad posicionExacta(int x, int y) {
		for(Entidad e: entidades) {
			if(e.getX() == x && e.getY()==y) {
				return e;
			}
		}
		
		return null;
	}
	
	public void añadirEntidad(Entidad e) {
		if (e != null)
			entidades.add(e);
	}



	public List<Entidad> getEntidades() {
		return entidades;
	}

}
