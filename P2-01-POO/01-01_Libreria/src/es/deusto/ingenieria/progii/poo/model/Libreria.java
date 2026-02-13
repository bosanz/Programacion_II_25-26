package es.deusto.ingenieria.progii.poo.model;



public class Libreria {
	
	// Propiedades
	
	private String nombre;
	private String calle = "";
	private String localidad = "";
	private String cp = "";
	private int precio = 0;
	private Libro[] aLibro = new Libro[10];
	
	// Constructores
	
	public Libreria(){
		nombre = "";
	}
	
	public Libreria(String nombre) {
		this.nombre = nombre;
	}
	
	public Libreria(String nombre, String calle, String localidad, String cp) {
		this.nombre = nombre;
		this.calle = calle;
		this.localidad = localidad;
		this.cp = cp;
	}
	
	public Libreria(Libreria l) {
		this.nombre = l.nombre;
		this.localidad = l.localidad;
		this.calle = l.calle;
		this.cp = l.cp;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getCalle() {
		return this.calle;
	}
	
	public String getLocalidad() {
		return this.localidad;
	}
	
	public String getCp() {
		return this.cp;
	}
	
	/**
	 * @param calle the calle to set
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}

	/**
	 * @param localidad the localidad to set
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	/**
	 * @param cp the cp to set
	 */
	public void setCp(String cp) {
		this.cp = cp;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Libreria [nombre=" + nombre + ", calle=" + calle + ", localidad=" + localidad + ", cp=" + cp + "]";
	}
	
	public void setPrecio(int precio) {
		if (precio > 0) {
			this.precio = precio;
		}
	}
	
	public void añadirLibro(String titulo, String autor, int anyo, String isbn) {
		Libro l = new Libro(titulo, autor, anyo, isbn);
		this.añadirLibro(l);
	}
	
	public void añadirLibro(Libro l) {
		// Recorremos el array de libros
//		for(int i = 0; i < this.aLibro.length; i++) {
//			// Si la posición del array está vacía
//			if (aLibro[i] == null) {
//				aLibro[i] = l; // Le asignamos el libro
//				break;
//			}			
//		}
		boolean libroAlmacenado = false;
		int i = 0;
		while(i < aLibro.length && !libroAlmacenado) {
			// Si la posición del array está vacía
			if (aLibro[i] == null) {
				aLibro[i] = l; // Le asignamos el libro
				libroAlmacenado = true;
			}
			i++;
		}
		
		if (i == aLibro.length) {
			System.out.println("La librería está completa");
		} else {
			System.out.println("Libro "+ l.getTitulo() +" añadido correctamente");
		}
	}
	
	public void borrarLibro(String isbn) {
		for(int i = 0; i < this.aLibro.length; i++) {
			if (aLibro[i].getIsbn() == isbn) {
				aLibro[i] = null;
				System.out.println("Libro con ISBN " + isbn + " elminado.");
				return;
			}
		}
		
		System.out.println("Libro no encontrado.");
	}
	
	public void mostrarLibreria() {
		for(int i = 0; i < this.aLibro.length; i++) {
			System.out.println(aLibro[i]);
		}
	}
	

}
