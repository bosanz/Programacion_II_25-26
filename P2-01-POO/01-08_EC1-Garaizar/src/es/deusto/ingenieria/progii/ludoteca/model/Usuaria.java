package es.deusto.ingenieria.progii.ludoteca.model;

import java.util.ArrayList;

public class Usuaria extends Persona {
	
	private ArrayList<Prestamo> aPrestamos = new ArrayList<Prestamo>();

	
	public Usuaria() {
		super();
	}

	
	
	public Usuaria(String nombre, int edad, ArrayList<Prestamo> aPrestamos) {
		super(nombre, edad);
		this.aPrestamos = aPrestamos;
	}



	public Usuaria(ArrayList<Prestamo> aPrestamos) {
		super();
		this.aPrestamos = aPrestamos;
	}


	public ArrayList<Prestamo> getaPrestamos() {
		return aPrestamos;
	}


	public boolean añadirPrestamo(Prestamo p) {
		if (p!= null) {
			this.aPrestamos.add(p);
			return true;
		}
		
		return false;
	}
	
	public boolean eliminarPrestamo(Prestamo p) {
		if (p != null && this.aPrestamos.contains(p)) {
			this.aPrestamos.remove(p);
			return true;
		} else {
			return false;
		}		
	}


	@Override
	public String toString() {
		return "Usuaria [aPrestamos=" + aPrestamos + "]";
	}
	
	
}
