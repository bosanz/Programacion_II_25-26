package es.ingenieria.progii.estudiantes;

import java.util.ArrayList;

public class Grado {
	
	// Propiedades
	private String nombre;
	private ArrayList<Estudiante> aEstudiantes;
	
	
	// Constructores
	
	public Grado() {
		this.nombre = "";
		this.aEstudiantes = new ArrayList<Estudiante>();
	}
	
	public Grado(String nombre) {
		this.nombre = nombre;
		this.aEstudiantes = new ArrayList<Estudiante>();
	}
	
	public Grado(Grado g) {
		this.nombre = g.getNombre();
		this.aEstudiantes = g.getEstudiantes();  
				
	}

	
	// Getters y Setters
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the aEstudiantes
	 */
	public ArrayList<Estudiante> getEstudiantes() {
		return aEstudiantes;
	}
	
	
	// Métodos
	
	
	/**
	 * Método para añadir un nuevo estudiante. Se verifica que el estudainte no exista.
	 * @param e
	 */
	public void añadirEstudiante(Estudiante estudiante) {
		boolean estaEnLaLista = false;
		// Recorremos la lista estdiantes
		for (Estudiante e: this.aEstudiantes) {
			// Si el DNI es igual
			if(e.getDni() == estudiante.getDni()) {
			// El estudiante ya está en la lista
				estaEnLaLista = true;
				System.out.println("Se ha encontrado un estudiante con DNI "+e.getDni()+" ya matriculado");
				break;
			}			
		}
		
		if (!estaEnLaLista) {
			// Si recorremos la lista y no esta, lo añadimos
			this.aEstudiantes.add(estudiante);
		}
	}
	
	public void eliminarEstudiante(Estudiante e) {
		this.aEstudiantes.remove(e);
	}
	
	
	

}


