package es.deusto.ingenieria.progii.agenda;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Agenda {
	
	private LinkedList<Contacto> agenda = new LinkedList<Contacto>();

	public Agenda() {
		super();
	}
	
	
	public void agregarContacto(Contacto c) {
		this.agenda.add(c);
	}
	
	public void eliminarContacto(Contacto c) {
		this.agenda.remove(c);
	}
	
	public void modificarContacto(Contacto antiguo, Contacto nuevo) {
		if (this.agenda.contains(antiguo)){
			this.agenda.remove(antiguo);
			this.agenda.add(nuevo);
		}
		
	}


	@Override
	public String toString() {
		return "Agenda [agenda=" + agenda + "]";
	}


	public List<Contacto> getAgenda() {
		return agenda;
	}


	public void setAgenda(List<Contacto> agenda) {
		this.agenda = (LinkedList)agenda;
	}
	
	
	

}
