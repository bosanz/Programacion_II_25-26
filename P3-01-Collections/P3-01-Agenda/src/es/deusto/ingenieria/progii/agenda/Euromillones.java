package es.deusto.ingenieria.progii.agenda;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Euromillones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> euromillones = new HashSet<Integer>();
		Random rand = new Random();
		
		
		while(euromillones.size() < 6) {
			euromillones.add(rand.nextInt(50) + 1);
		}
		
		System.out.println(euromillones);

	}

}
