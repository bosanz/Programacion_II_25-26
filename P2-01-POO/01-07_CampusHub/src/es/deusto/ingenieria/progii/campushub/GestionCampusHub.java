package es.deusto.ingenieria.progii.campushub;

import java.util.ArrayList;

public class GestionCampusHub {
	private ArrayList<Estudiante> estudiantes = new ArrayList<>();
	private ArrayList<Recurso> recursos = new ArrayList<>();
	private ArrayList<Evento> eventos = new ArrayList<>();

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public ArrayList<Recurso> getRecursos() {
		return recursos;
	}

	public ArrayList<Evento> getEventos() {
		return eventos;
	}

	public void addEstudiante(Estudiante e) {
		if (e != null)
			estudiantes.add(e);
	}

	public void addRecurso(Recurso r) {
		if (r != null)
			recursos.add(r);
	}

	public void addEvento(Evento ev) {
		if (ev != null)
			eventos.add(ev);
	}

	public int contarRecursosNoDisponibles() {
		int cont = 0;
		for (Recurso r : recursos) {
			if (r != null && !r.isDisponible())
				cont++;
		}
		return cont;
	}

	public ArrayList<Sala> salasGamingDisponibles() {
		ArrayList<Sala> res = new ArrayList<>();
		for (Recurso r : recursos) {
			if (r instanceof Sala) {
				Sala s = (Sala) r;
				if (s.isDisponible() && s.getTipoSala() == TipoSala.GAMING) {
					res.add(s);
				}
			}
		}
		return res;
	}

	public Evento eventoConMasAsistentes() {
		if (eventos.isEmpty())
			return null;

		Evento mejor = eventos.get(0);
		for (Evento e : eventos) {
			if (e != null && e.getAsistentes().size() > mejor.getAsistentes().size()) {
				mejor = e;
			}
		}
		return mejor;
	}
}