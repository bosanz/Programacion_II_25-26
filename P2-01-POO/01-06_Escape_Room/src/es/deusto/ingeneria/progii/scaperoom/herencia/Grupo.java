package es.deusto.ingeneria.progii.scaperoom.herencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Grupo {
	private final String nombre;
	private final List<Jugador> jugadores;

	public Grupo(String nombre) {
		this.nombre = nombre;
		this.jugadores = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void addJugador(Jugador j) {
		if (j != null)
			jugadores.add(j);
	}

	public int numeroJugadores() {
		return jugadores.size();
	}

	public Jugador getJugadorAleatorio(Random rnd) {
		if (jugadores.isEmpty())
			return null;
		return jugadores.get(rnd.nextInt(jugadores.size()));
	}
}