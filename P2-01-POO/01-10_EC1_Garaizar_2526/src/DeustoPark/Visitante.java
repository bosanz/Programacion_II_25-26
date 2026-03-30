package DeustoPark;

public class Visitante{
	
	private String nombre;
	private String apellido;
	private String dni;
	private double saldo;
	public Visitante(String nombre, String apellido, String dni, double saldo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.saldo = saldo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Visitante [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", saldo=" + saldo + "]";
	}
	@Override
	public boolean equals(Object o) {
		Visitante v = ((Visitante)o);
		return this.dni.equalsIgnoreCase(v.getDni());
	}

}
