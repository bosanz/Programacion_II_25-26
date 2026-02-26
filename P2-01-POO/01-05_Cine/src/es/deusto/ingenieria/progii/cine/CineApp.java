package es.deusto.ingenieria.progii.cine;

import java.util.Random;

public class CineApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sala s = new Sala();
		s.sentar();
		s.sentar();
		s.sentar();
		s.sentar();
		s.sentar();
		s.sentar();
		s.sentar();
		if (s.sentar() == null);
		
		Random r = new Random();
		String[] nombres = {"Bruce", "Gordon", "Peter", "Mike"};
		
		s.mostrarOcupacionSala();
		
		

	}

}
