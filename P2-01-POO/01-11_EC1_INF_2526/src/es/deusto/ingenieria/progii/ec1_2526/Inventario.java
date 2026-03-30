package es.deusto.ingenieria.progii.ec1_2526;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
	
	private ArrayList<Objeto> inventario = new ArrayList<Objeto>();

	public Inventario(ArrayList<Objeto> inventario) {
		super();
		this.inventario = inventario;
	}
	
	public Inventario() {
		
	}
	
	public void añadirObjeto(Objeto o) {
		this.inventario.add(o);
	}
	
	public void eliminarObjeto(Objeto o) {
		if (inventario.contains(o)) {
			this.inventario.remove(o);
		}
	}
	
	public List<Objeto> devolverObjetosPorTipo(Rareza r){
		ArrayList<Objeto> resultado = new ArrayList<Objeto>();
		
		for(Objeto o: inventario) {
			if(o.getRareza()== r) {
				resultado.add(o);
			}
		}
		
		return resultado;
	}

	@Override
	public String toString() {
		return "Inventario [inventario=" + inventario + "]";
	}

}
