package es.deusto.ingenieria.progii.poo.app;

import es.deusto.ingenieria.progii.poo.model.Libreria;

public class LibreariaApp {
	
	
	public static void main(String[] args) {
		Libreria l1 = new Libreria();
		
		l1.setNombre("Casa del Libro");
		System.out.println(l1);
		
		l1.añadirLibro("a", "a", 206, "dasdasf");
		l1.añadirLibro("b", "b", 206, "dasdasf");
		l1.añadirLibro("c", "c", 206, "dasdasf");
		
		l1.mostrarLibreria();
		
		l1.borrarLibro("dasdasf");
		
		l1.mostrarLibreria();
	
	
		l1.añadirLibro("d", "d", 206, "dasdasf");
		
		l1.mostrarLibreria();
	}

}
