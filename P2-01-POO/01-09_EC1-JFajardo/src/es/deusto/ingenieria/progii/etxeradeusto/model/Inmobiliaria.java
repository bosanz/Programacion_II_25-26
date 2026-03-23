package es.deusto.ingenieria.progii.etxeradeusto.model;

import java.util.ArrayList;

public class Inmobiliaria {

	private ArrayList<Vivienda> viviendas;
	private ArrayList<Usuario> usuarios;
	private ArrayList<Transaccion> transacciones;
	private int contadorViviendas;
	
	public Inmobiliaria() {
		this.viviendas = new ArrayList<Vivienda>();
		this.usuarios = new ArrayList<Usuario>();
		this.transacciones = new ArrayList<Transaccion>();
		this.contadorViviendas = 0;
	}
	
	public Inmobiliaria(ArrayList<Vivienda> viviendas, ArrayList<Usuario> usuarios,
			ArrayList<Transaccion> transacciones, int contadorViviendas) {
		super();
		this.viviendas = viviendas;
		this.usuarios = usuarios;
		this.transacciones = transacciones;
		this.contadorViviendas = contadorViviendas;
	}
	public ArrayList<Vivienda> getViviendas() {
		return viviendas;
	}
	public void setViviendas(ArrayList<Vivienda> viviendas) {
		this.viviendas = viviendas;
	}
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public ArrayList<Transaccion> getTransacciones() {
		return transacciones;
	}
	public void setTransacciones(ArrayList<Transaccion> transacciones) {
		this.transacciones = transacciones;
	}
	public int getContadorViviendas() {
		return contadorViviendas;
	}
	public void setContadorViviendas(int contadorViviendas) {
		this.contadorViviendas = contadorViviendas;
	}
	@Override
	public String toString() {
		return "Inmobiliaria [viviendas=" + viviendas + ", usuarios=" + usuarios + ", transacciones=" + transacciones
				+ ", contadorViviendas=" + contadorViviendas + "]";
	}
	
	
	public int contarViviendasReservadas() {
		int contadorViviendasReservadas = 0;
		
		for(Vivienda v : viviendas) {
			if(!v.isDisponible()) { 
				contadorViviendasReservadas++;
			}
		}
		
		return contadorViviendasReservadas;
	}
	
	public Usuario usuarioConMasViviendasEnOferta() {
		
		Usuario usuarioConMasViviendas = null;
		int contadorMasViviendas = 0;
		
		for(Usuario u : usuarios) {
			int contadorUsuario = 0;
			
			for(Transaccion t: transacciones) {
				if(t.getDniUsuario().equalsIgnoreCase(u.getDni())) {
					contadorUsuario++;
				}
			}
			
			if (contadorUsuario > contadorMasViviendas) {
				contadorMasViviendas = contadorUsuario;
				usuarioConMasViviendas = u;
			}
			
		}
		
		return usuarioConMasViviendas;
	}
	
	
	
	public ArrayList<Casa> obtenerViviendasRuralesDisponibles(){
		
		ArrayList<Casa> resultado = new ArrayList<Casa>();
		
		// Recorremos la lista de viviendas
		for(Vivienda v: viviendas) {
			if (v instanceof Casa && //Comprobamos si es una casa
					((Casa) v).getCategoria().equalsIgnoreCase("RURAL") && // Comprobamos si es Rural					
					v.isDisponible()) { // Comprobamos si esta libre

				// Si se cumple todo, lo añadimos al resultado
				resultado.add((Casa) v);
			}
			
		}
		
		return resultado;
		
		
	}
	
	
	
}
