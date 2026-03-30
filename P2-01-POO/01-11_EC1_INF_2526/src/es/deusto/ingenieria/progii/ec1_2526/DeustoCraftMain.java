package es.deusto.ingenieria.progii.ec1_2526;

import java.util.ArrayList;
import java.util.Collections;

public class DeustoCraftMain {

	public static void main(String[] args) {
		
		Objeto o1 = new Objeto("Objeto1", Rareza.COMUN);
		Objeto o2 = new Objeto("Objeto2", Rareza.LEGENDARIA);
		Objeto o3 = new Objeto("Objeto3", Rareza.RARA);
		
		Objeto o4 = new Objeto("Objeto4", Rareza.LEGENDARIA);
		Objeto o5 = new Objeto("Objeto5", Rareza.LEGENDARIA);
		Objeto o6 = new Objeto("Objeto6", Rareza.RARA);
		
		Inventario i1 = new Inventario();
		i1.añadirObjeto(o1);
		i1.añadirObjeto(o2);
		i1.añadirObjeto(o3);
		
		
		Inventario i2 = new Inventario();
		i2.añadirObjeto(o4);
		i2.añadirObjeto(o5);
		i2.añadirObjeto(o6);
		
		
		Jugador j1 = new Jugador("j1",1,1,100, i1);
		
		Jugador j2 = new Jugador("j2",2,2,200, i2);
		
		Mob m1 = new Mob("m1", 0, 0, true, 100);
		Mob m2 = new Mob("m2", 3, 3, true, 200);
		Mob m3 = new Mob("m3", 4, 4, false,300);
		
		Mundo m = new Mundo();
		
		m.añadirEntidad(j1);
		m.añadirEntidad(j2);
		m.añadirEntidad(m1);
		m.añadirEntidad(m2);
		m.añadirEntidad(m3);
		
		// Hacer que un jugador se mueva
		
		System.out.println("=====MOVIMIENTO J1=====");
		System.out.println(j1);
		j1.arriba();
		j1.derecha();
		System.out.println(j1);
		
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		
		for(Entidad e: m.getEntidades()) {
			if(e instanceof Jugador) {
				jugadores.add((Jugador) e);
			}
		}
		
		System.out.println("=====ORDENAR JUGADORES=====");
		
		System.out.println(jugadores);
		Collections.sort(jugadores);
		System.out.println(jugadores);
	}

}
