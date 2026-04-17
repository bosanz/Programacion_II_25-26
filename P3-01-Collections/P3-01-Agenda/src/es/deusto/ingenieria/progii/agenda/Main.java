package es.deusto.ingenieria.progii.agenda;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Agenda a = new Agenda();
		
		Contacto c1 = new Contacto("B. Wayne", "11111","a@a.com");
		Contacto c2 = new Contacto("C. Wayne", "22222","b@a.com");
		Contacto c3 = new Contacto("D. Wayne", "33333","c@a.com");
		Contacto c4 = new Contacto("E. Wayne", "44444","d@a.com");
		Contacto c5 = new Contacto("F. Wayne", "55555","e@a.com");
		
		a.getAgenda().add(c1);
		
		a.agregarContacto(c1);
		a.agregarContacto(c2);
		a.agregarContacto(c3);
		a.agregarContacto(c4);
		
		System.out.println("\n\n========PREVIA===========");
		System.out.println(a);
		
		System.out.println("\n\n========ELIMINAMOS===========");
		a.eliminarContacto(c1);
		System.out.println(a);
		
		System.out.println("\n\n========MODIFICAMOS===========");
		a.modificarContacto(c4, c5);

		System.out.println(a);
	}

}
