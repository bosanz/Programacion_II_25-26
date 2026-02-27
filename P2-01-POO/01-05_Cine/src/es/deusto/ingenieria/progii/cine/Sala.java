package es.deusto.ingenieria.progii.cine;

import java.util.ArrayList;
import java.util.Random;

public class Sala {
	
	private final int NUMERO_FILAS = 13;
	private final int NUMERO_COLUMNAS = 8;
	
	private int capacidadSala = NUMERO_FILAS * NUMERO_COLUMNAS;
	private int asientosOcupados = 0;
	
	private Pelicula pelicula;
	
	// Asiento[][] aAsiento = new Asiento[][]();
	private ArrayList<ArrayList<Asiento>> aAsientos = new ArrayList<ArrayList<Asiento>>(NUMERO_FILAS);
	
	private void inicializarSala() {
		for(int i=1; i < NUMERO_FILAS + 1; i++) {
			ArrayList<Asiento> fila = new ArrayList<Asiento>(NUMERO_COLUMNAS);
			for(int j=0; j < NUMERO_COLUMNAS; j++) {
				char columna = (char)('A' + j);
				Asiento a = new Asiento(i, columna, false);
				fila.add(a); // fila[j] = a;
				System.out.println("Asiento " +i+ ":"+columna + " creado.");
			}
			aAsientos.add(fila);
		}
		System.out.println("Filas: " + aAsientos.size() + "; Columnas: " + aAsientos.get(0).size());
	}
	
	public Sala() {
		inicializarSala();
		pelicula = null;
	}
	
	public Sala(Pelicula p) {
		this.pelicula = p;
	}
	public boolean hayAsientosLibres() {
		if (capacidadSala == asientosOcupados){
			return false;
		} else {
			return true;
		}
	}
	
	public Asiento sentarEspectador(Espectador e) {
		Random r = new Random();
		
		// Ver si hay capacidad en el cine.
		if (!hayAsientosLibres()){
			return null;
		}
		
		// Verificamos si el espectador tiene dinero y edad mínima
		if (e.getEdad() < pelicula.getEdadMinima()) return null;
        if (e.getDinero() < pelicula.getPrecio()) return null;
		
		int filaAleatoria = r.nextInt(NUMERO_FILAS);
		int columnaAleatoria = r.nextInt(NUMERO_COLUMNAS);
		
		System.out.println(filaAleatoria+";"+columnaAleatoria);
		
		while (aAsientos.get(filaAleatoria).get(columnaAleatoria).isOcupado()){
			filaAleatoria = r.nextInt(NUMERO_FILAS);
			columnaAleatoria = r.nextInt(NUMERO_COLUMNAS);
			System.out.println("Asiento Ocupado. Nuevo:" + filaAleatoria+";"+columnaAleatoria);
		}
		
		aAsientos.get(filaAleatoria).get(columnaAleatoria).setOcupado(true);
		
		// Actualizamos el contador de asientos ocupados
		this.asientosOcupados++;
		
		return aAsientos.get(filaAleatoria).get(columnaAleatoria);
	}
	
	public void mostrarOcupacionSala() {
		System.out.println("Ocupación de la sala: " + this.asientosOcupados/this.capacidadSala);
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	
	public void mostrarSala() {
		for (ArrayList<Asiento> fila : this.aAsientos) {
			for (Asiento a : fila) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}

}
