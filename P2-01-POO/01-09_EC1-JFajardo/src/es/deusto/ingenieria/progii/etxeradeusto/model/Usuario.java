package es.deusto.ingenieria.progii.etxeradeusto.model;

public class Usuario implements Comparable{
	
	private String nombre;
	private String dni;
	private String telefono;
	private int edad;
	
	public Usuario() {
		String nombre = "";
		String dni = "";
		String telefono = "";
		int edad = -1;

	}
	
	public Usuario(String dni, String nombre, String telefono, int edad) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public int compareTo(Object o) {
		
		if(o instanceof Usuario) {
			if(this.getEdad() > ((Usuario)o).getEdad() ) {
				return 1;
			} else if (this.getEdad() < ((Usuario)o).getEdad()){
				return -1;
			} 
			return 0;

		}
		return -100;
		
	}
	
	
	
	

}
