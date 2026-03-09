package es.deusto.ingenieria.progii.campushub;

import java.util.Objects;

public class Estudiante implements Comparable<Estudiante> {
	private String dni;
	private String nombre;
	private String telefono;
	private int edad;
	private String grado;
	private double saldoMonedero;

	public Estudiante() {
	}

	public Estudiante(String dni, String nombre, String telefono, int edad, String grado, double saldoMonedero) {
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
		this.edad = edad;
		this.grado = grado;
		this.saldoMonedero = saldoMonedero;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public double getSaldoMonedero() {
		return saldoMonedero;
	}

	public void setSaldoMonedero(double saldoMonedero) {
		this.saldoMonedero = saldoMonedero;
	}

	@Override
	public int compareTo(Estudiante other) {
		if (other == null)
			return 1;
		int cmp = Integer.compare(this.edad, other.edad);
		if (cmp != 0)
			return cmp;
		// Desempate estable por DNI (si hay nulos, evita NPE)
		String a = (this.dni == null) ? "" : this.dni;
		String b = (other.dni == null) ? "" : other.dni;
		return a.compareTo(b);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Estudiante))
			return false;
		Estudiante that = (Estudiante) o;
		return Objects.equals(dni, that.dni);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public String toString() {
		return "Estudiante{" + "dni='" + dni + '\'' + ", nombre='" + nombre + '\'' + ", telefono='" + telefono + '\''
				+ ", edad=" + edad + ", grado='" + grado + '\'' + ", saldoMonedero=" + saldoMonedero + '}';
	}
}