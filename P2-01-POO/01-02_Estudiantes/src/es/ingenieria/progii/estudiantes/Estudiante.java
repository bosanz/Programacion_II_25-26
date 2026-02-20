package es.ingenieria.progii.estudiantes;

import java.util.ArrayList;

public class Estudiante {
	
	// Propiedades
	private String nombre = "";
	private String dni = "";
	private int curso = 0;
	//TODO: Verificar qué hacer con la matrícula
	private ArrayList<Asignatura> aMatricula = new ArrayList<Asignatura>();
	
	
	// Constructores
	public Estudiante() { }
	
	public Estudiante(String nombre, String dni, int curso) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.curso = curso;
	}
	
	public Estudiante(Estudiante e) {
		this.nombre = e.getNombre();
		this.dni = e.getDni();
		this.curso = e.getCurso();
	}

	
	//Getters y Setters
	
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
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the curso
	 */
	public int getCurso() {
		return curso;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setCurso(int curso) {
		this.curso = curso;
	}
	
	
	// Métodos
	public void añadirAsignatura(Asignatura a) {
		this.aMatricula.add(a);
		
	}

}
