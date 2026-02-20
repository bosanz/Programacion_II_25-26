package es.ingenieria.progii.estudiantes;

public class Asignatura {
	// Propiedades
	private String nombre = "";
	private String codigo = "";
	private int curso = 0;
	private int creditos = 0;
	
	
	// Constructores
	
	public Asignatura() {
		
	}


	public Asignatura(String nombre, String codigo, int curso, int creditos) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.curso = curso;
		this.creditos = creditos;
	}
	
	public Asignatura(Asignatura a) {
		this.nombre = a.getNombre();
		this.codigo = a.getCodigo();
		this.curso = a.getCurso();
		this.creditos = a.getCreditos();
	}


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
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}


	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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


	/**
	 * @return the creditos
	 */
	public int getCreditos() {
		return creditos;
	}


	/**
	 * @param creditos the creditos to set
	 */
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public String toString() {
		return this.nombre+";"+this.creditos+";"+this.curso
	}
	
	

}
