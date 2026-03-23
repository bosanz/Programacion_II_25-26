package es.deusto.ingenieria.progii.ludoteca.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import es.deusto.ingenieria.progii.ludoteca.model.*;

public class LudotecaApp {	
	
	 public static void main(String[] args) {

	        // Trabajadoras
	        Trabajadora t1 = new Trabajadora("Ane", 35, "12345678A");
	        Trabajadora t2 = new Trabajadora("Miren", 42, "87654321B");

	        // Usuarias
	        Usuaria u1 = new Usuaria("Leire", 12, new ArrayList<>());
	        Usuaria u2 = new Usuaria("June", 9, new ArrayList<>());
	        Usuaria u3 = new Usuaria("Nahia", 15, new ArrayList<>());

	        // Recursos
	        Libro l1 = new Libro("Mortadelo y Filemón", "Ibáñez", "humor", null);
	        Libro l2 = new Libro("Drácula", "Bram Stoker", "terror", null);
	        Videoconsola v1 = new Videoconsola("Nintendo", "OLED");
	        Videoconsola v2 = new Videoconsola("Sony", "Slim");
	        JuegoDeMesa j1 = new JuegoDeMesa(15, 6);
	        JuegoDeMesa j2 = new JuegoDeMesa(60, 10);

	        // Comprobar esFamiliar()
	        System.out.println("=== PRUEBA esFamiliar() ===");
	        System.out.println(l1.getTitulo() + " familiar: " + l1.esFamiliar());
	        System.out.println(l2.getTitulo() + " familiar: " + l2.esFamiliar());
	        System.out.println(v1.getTitulo() + " familiar: " + v1.esFamiliar());
	        System.out.println(v2.getTitulo() + " familiar: " + v2.esFamiliar());
	        System.out.println(j1.getTitulo() + " familiar: " + j1.esFamiliar());
	        System.out.println(j2.getTitulo() + " familiar: " + j2.esFamiliar());

	        // Probar Comparable en JuegoDeMesa
	        System.out.println("\n=== PRUEBA compareTo() ===");
	        if (j1.compareTo(j2) < 0) {
	            System.out.println(j1.getTitulo() + " está recomendado para menor edad que " + j2.getTitulo());
	        } else if (j1.compareTo(j2) > 0) {
	            System.out.println(j2.getTitulo() + " está recomendado para menor edad que " + j1.getTitulo());
	        } else {
	            System.out.println("Ambos juegos tienen la misma edad recomendada");
	        }

	        // Reservas de libros
	        System.out.println("\n=== PRUEBA reservar/anular LIBRO ===");
	        System.out.println("Reservar l1 para u1: " + l1.reservar(u1));
	        System.out.println("Intentar reservar l1 para u2: " + l1.reservar(u2));
	        System.out.println("Anular l1 por u2: " + l1.anular(u2));
	        System.out.println("Anular l1 por u1: " + l1.anular(u1));

	        // Actividades
	        Actividad a1 = new Actividad("Taller de robótica", TipoActividad.TALLER,
	                LocalDate.of(2026, 3, 20), new ArrayList<>(), t1);

	        Actividad a2 = new Actividad("Proyección de película", TipoActividad.PELICULA,
	                LocalDate.of(2026, 3, 22), new ArrayList<>(), t2);

	        // Reservas en actividades
	        System.out.println("\n=== PRUEBA reservar/anular ACTIVIDAD ===");
	        System.out.println("Reservar u1 en a1: " + a1.reservar(u1));
	        System.out.println("Reservar u2 en a1: " + a1.reservar(u2));
	        System.out.println("Reservar u3 en a1: " + a1.reservar(u3));
	        System.out.println("Reservar u1 otra vez en a1: " + a1.reservar(u1));

	        System.out.println("Reservar u1 en a2: " + a2.reservar(u1));
	        System.out.println("Reservar u2 en a2: " + a2.reservar(u2));

	        System.out.println("Anular u2 en a2: " + a2.anular(u2));

	        // Lista de actividades
	        ArrayList<Actividad> actividades = new ArrayList<>();
	        actividades.add(a1);
	        actividades.add(a2);

	        // Probar actividadMasPopular
	        System.out.println("\n=== PRUEBA actividadMasPopular() ===");
	        Actividad popular = Ludoteca.actividadMasPopular(actividades);
	        if (popular != null) {
	            System.out.println("Actividad más popular: " + popular.getDescripcion());
	            System.out.println("Número de asistentes: " + popular.getAsistentes().size());
	        }

	        // Lista de recursos
	        ArrayList<Recurso> recursos = new ArrayList<>();
	        recursos.add(l1);
	        recursos.add(l2);
	        recursos.add(v1);
	        recursos.add(v2);
	        recursos.add(j1);
	        recursos.add(j2);

	        // Reservar l2 para que deje de estar disponible
	        l2.reservar(u3);

	        // Probar recursosReservables
	        System.out.println("\n=== PRUEBA recursosReservables() ===");
	        ArrayList<Recurso> reservables = Ludoteca.recursosReservables(recursos);
	        for (Recurso r : reservables) {
	            System.out.println(r.getTitulo() + " está disponible para reservar");
	        }

	        // Préstamos de ejemplo
	        Prestamo p1 = new Prestamo(u1, j1, LocalDate.now());
	        Prestamo p2 = new Prestamo(u2, v1, LocalDate.now());

	        u1.getaPrestamos().add(p1);
	        u2.getaPrestamos().add(p2);

	        System.out.println("\n=== PRUEBA préstamos ===");
	        System.out.println(u1.getNombre() + " tiene " + u1.getaPrestamos().size() + " préstamo(s)");
	        System.out.println(u2.getNombre() + " tiene " + u2.getaPrestamos().size() + " préstamo(s)");
	    }

}
