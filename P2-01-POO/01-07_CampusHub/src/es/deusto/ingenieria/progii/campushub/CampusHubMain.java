package es.deusto.ingenieria.progii.campushub;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class CampusHubMain {
	public static void main(String[] args) {
		GestionCampusHub g = new GestionCampusHub();

		// Estudiantes
		Estudiante a = new Estudiante("111A", "Lucía", "600111222", 20, "Ing. Informática", 12.50);
		Estudiante b = new Estudiante("222B", "Mario", "600333444", 22, "Ing. Telecom", 3.00);
		Estudiante c = new Estudiante("333C", "Nerea", "600555666", 19, "Ing. Industrial", 7.25);
		Estudiante d = new Estudiante("444D", "Hugo", "600777888", 21, "Ing. Informática", 0.00);
		Estudiante e = new Estudiante("555E", "Sofía", "600999000", 20, "Ing. Biomédica", 18.10);

		g.addEstudiante(a);
		g.addEstudiante(b);
		g.addEstudiante(c);
		g.addEstudiante(d);
		g.addEstudiante(e);

		// Recursos
		Sala s1 = new Sala("Sala A-101", 8000, 30, TipoSala.GRUPO);
		Sala s2 = new Sala("Sala Gaming", 15000, 12, TipoSala.GAMING);
		Equipo eq1 = new Equipo("Kit Podcast", 1200, "Rode", "PodMic", TipoEquipo.MICROFONO);
		Equipo eq2 = new Equipo("Visor VR", 900, "Meta", "Quest", TipoEquipo.VR);

		g.addRecurso(s1);
		g.addRecurso(s2);
		g.addRecurso(eq1);
		g.addRecurso(eq2);

		// Eventos
		Evento ev1 = new Evento("Torneo FIFA", LocalDate.now().plusDays(10), 500, TipoEvento.ENTRADA);
		Evento ev2 = new Evento("Taller CV Tech", LocalDate.now().plusDays(5), 300, TipoEvento.INTERNO);
		Evento ev3 = new Evento("Concierto Campus", LocalDate.now().plusDays(20), 2000, TipoEvento.PATROCINADO);

		g.addEvento(ev1);
		g.addEvento(ev2);
		g.addEvento(ev3);

		// Pruebas de reservas/cancelaciones (recursos)
		System.out.println("=== Reservas de recursos ===");
		System.out.println("Reservar sala gaming por Lucía: " + s2.reservar(a));
		System.out.println("Reservar sala gaming por Mario (debe fallar): " + s2.reservar(b));
		System.out.println("Cancelar sala gaming por Mario (debe fallar): " + s2.cancelar(b));
		System.out.println("Cancelar sala gaming por Lucía: " + s2.cancelar(a));
		System.out.println("Estado sala gaming: " + s2);

		// Pruebas de reservas/cancelaciones (eventos)
		System.out.println("\n=== Inscripciones a eventos ===");
		System.out.println("Lucía se apunta a Torneo FIFA: " + ev1.reservar(a));
		System.out.println("Lucía se apunta otra vez (debe fallar): " + ev1.reservar(a));
		System.out.println("Mario se apunta a Torneo FIFA: " + ev1.reservar(b));
		System.out.println("Hugo se apunta a Taller CV Tech: " + ev2.reservar(d));
		System.out.println("Nerea se apunta a Taller CV Tech: " + ev2.reservar(c));
		System.out.println("Baja de Mario en Torneo FIFA: " + ev1.cancelar(b));
		System.out.println("Evento FIFA: " + ev1);
		System.out.println("Evento CV Tech: " + ev2);

		// Consultas de gestión
		System.out.println("\n=== Consultas ===");
		// reservamos un equipo para que haya no disponibles
		eq2.reservar(e);

		System.out.println("Recursos NO disponibles: " + g.contarRecursosNoDisponibles());

		ArrayList<Sala> gamingDisp = g.salasGamingDisponibles();
		System.out.println("Salas GAMING disponibles: " + gamingDisp);

		Evento top = g.eventoConMasAsistentes();
		System.out.println("Evento con más asistentes: " + top);

		// Ordenación de estudiantes por edad
		System.out.println("\n=== Estudiantes ordenados por edad ===");
		Collections.sort(g.getEstudiantes());
		for (Estudiante est : g.getEstudiantes()) {
			System.out.println(est);
		}

		// Financiación (antes/después)
		System.out.println("\n=== Financiación de eventos ===");
		System.out.println("Antes (ENTRADA): " + ev1);
		ev1.financiar(200.0); // descuenta 10% de 200 = 20
		System.out.println("Después (ENTRADA): " + ev1);

		System.out.println("Antes (INTERNO): " + ev2);
		ev2.financiar(200.0); // descuenta 30% de 200 = 60
		System.out.println("Después (INTERNO): " + ev2);

		System.out.println("Antes (PATROCINADO): " + ev3);
		ev3.financiar(200.0); // descuento 0
		System.out.println("Después (PATROCINADO): " + ev3);
	}
}