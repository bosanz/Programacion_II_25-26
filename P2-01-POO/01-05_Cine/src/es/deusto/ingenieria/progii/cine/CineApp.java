package es.deusto.ingenieria.progii.cine;

import java.util.Random;

public class CineApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pelicula p = new Pelicula("Matrix", 130, "Wachowski", 16, 7.5);
		
		
		
        Sala sala = new Sala(p);
        Sesion sesion = new Sesion(new FechaYHora(26, 2, 2026, 21, 0, 0), sala);

        String[] nombres = {"Ana","Luis","Pedro","Lucia","Marta","Juan","Carlos","Elena"};

        Random r = new Random();

        // Generamos muchos espectadores aleatorios
        for(int i=0;i<100;i++){

            String nombre = nombres[r.nextInt(nombres.length)];
            int edad = r.nextInt(60) + 5;
            double dinero = r.nextDouble() * 15;

            Espectador e = new Espectador(nombre, edad, dinero);
            sala.sentarEspectador(e);
        }

        sala.mostrarSala();	
		

	}

}
