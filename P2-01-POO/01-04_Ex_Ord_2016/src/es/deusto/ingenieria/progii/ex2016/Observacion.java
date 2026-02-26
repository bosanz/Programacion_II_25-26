package es.deusto.ingenieria.progii.ex2016;

import java.util.Scanner;
import javax.swing.JOptionPane;

class Observacion {
	private String planeta;
	private String rutaOrigen;
	private String rutaDestino;
	private String descripcionObservacion;
	private int fechaObservacion; // aaaammdd

	// Valores por defecto (válidos)
	private static final String DEF_STR = "DESCONOCIDO";
	private static final int DEF_FECHA = 20000101;

	public Observacion() {
		this.planeta = DEF_STR;
		this.rutaOrigen = DEF_STR;
		this.rutaDestino = DEF_STR;
		this.descripcionObservacion = DEF_STR;
		this.fechaObservacion = DEF_FECHA;
	}

	public Observacion(String planeta, 
			String rutaOrigen, 
			String rutaDestino,
			String descripcionObservacion, 
			int fechaObservacion) {
		this(); // arranca con defaults
		// set* ya valida; si algo no es válido, conserva el valor anterior (default)
		setPlaneta(planeta);
		setRutaOrigen(rutaOrigen);
		setRutaDestino(rutaDestino);
		setDescripcionObservacion(descripcionObservacion);
		setFechaObservacion(fechaObservacion);
	}

	// Getters
	public String getPlaneta() { return planeta; }
	public String getRutaOrigen() { return rutaOrigen; }
	public String getRutaDestino() { return rutaDestino; }
	public String getDescripcionObservacion() { return descripcionObservacion; }
	public int getFechaObservacion() { return fechaObservacion; }

	// Setters (validan; si no es válido, NO cambian el valor)
	public void setPlaneta(String planeta) {
		if (isValidString(planeta)) {
			this.planeta = planeta.trim();
		}
	}

	public void setRutaOrigen(String rutaOrigen) {
		if (isValidString(rutaOrigen)) {
			this.rutaOrigen = rutaOrigen.trim();
		}
	}

	public void setRutaDestino(String rutaDestino) {
		if (isValidString(rutaDestino)) {
			this.rutaDestino = rutaDestino.trim();
		}
	}

	public void setDescripcionObservacion(String descripcionObservacion) {
		if (isValidString(descripcionObservacion)) {
			this.descripcionObservacion = descripcionObservacion.trim();
		}
	}

	public void setFechaObservacion(int fechaObservacion) {
		if (isValidFechaAAAAMMDD(fechaObservacion)) {
			this.fechaObservacion = fechaObservacion;
		}
	}

	// leer: pide hasta que sea correcto (para cada campo)
	public void leer() {
		while (true) {
			String v = JOptionPane.showInputDialog("Planeta: ");
			if (isValidString(v)) { this.planeta = v.trim(); break; }
		}

		while (true) {
			String v = JOptionPane.showInputDialog("Ruta origen: ");
			if (isValidString(v)) { this.rutaOrigen = v.trim(); break; }
		}

		while (true) {
			String v = JOptionPane.showInputDialog("Ruta destino: ");
			if (isValidString(v)) { this.rutaDestino = v.trim(); break; }
		}

		while (true) {
			String v = JOptionPane.showInputDialog("Descripción observación: ");
			if (isValidString(v)) { this.descripcionObservacion = v.trim(); break; }
		}

		while (true) {
			String line = JOptionPane.showInputDialog("Fecha observación (aaaammdd): ");
			int f = Integer.parseInt(line.trim());
			if (isValidFechaAAAAMMDD(f)) { 
				this.fechaObservacion = f; break;             
			}
		}
	}

	public void mostrar() {
		System.out.println("Planeta: " + planeta);
		System.out.println("Ruta: " + rutaOrigen + " -> " + rutaDestino);
		System.out.println("Descripción: " + descripcionObservacion);
		System.out.println("Fecha (aaaammdd): " + fechaObservacion);
	}

	// Helpers de validación
	private static boolean isValidString(String s) {
		return s != null && !s.trim().isEmpty();
	}

	private static boolean isValidFechaAAAAMMDD(int f) {
		if (f < 10000101 || f > 99991231) return false;
		int yyyy = f / 10000;
		int mm = (f / 100) % 100;
		int dd = f % 100;
		if (mm < 1 || mm > 12) return false;
		if (dd < 1) return false;

		int maxDay;
		switch (mm) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: maxDay = 31; break;
		case 4: case 6: case 9: case 11: maxDay = 30; break;
		default: // feb
			boolean leap = (yyyy % 400 == 0) || (yyyy % 4 == 0 && yyyy % 100 != 0);
			maxDay = leap ? 29 : 28;
		}
		return dd <= maxDay;
	}
}
