package es.deusto.ingenieria.progii.agenda;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenarString {

	public static void main(String[] args) {
		ArrayList<String> prueba = new ArrayList<String>();
		prueba.add("Perro");
		prueba.add("aloha");
		prueba.add("Salto");
		prueba.add("burbuja");
		prueba.add("abeja");
		
		System.out.println(prueba);
		Collections.sort(prueba);
		System.out.println(prueba);
		prueba.sort(String.CASE_INSENSITIVE_ORDER);
		System.out.println(prueba);
	}
}
