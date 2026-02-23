package es.deusto.ingenieria.progii.ex2016;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Gestion {
	public static void main(String[] args){
		String [] aPlanetas = {"Tatooine","Dagobah","Jakku","Naboo"};
		int[][] aContObservaciones = {
				{0, 0, 0, 0},
				{0, 0, 0, 0},
				{0, 0, 0, 0},
				{0, 0, 0, 0},
		};
		Ruta [] aRutas = {
				new Ruta("Tatooine", "Dagobah", false),
				new Ruta("Tatooine", "Jakku", true),
				new Ruta("Tatooine", "Naboo", false),
				new Ruta("Dagobah", "Tatooine", false),
				new Ruta("Dagobah", "Jakku", true),
				new Ruta("Dagobah", "Naboo", false),
				new Ruta("Jakku", "Tatooine", true),
				new Ruta("Jakku", "Dagobah", false),
				new Ruta("Jakku", "Naboo", true),
				new Ruta("Naboo", "Tatooine", false),
				new Ruta("Naboo", "Dagobah", true),
				new Ruta("Naboo", "Jakku", true),
		};
		Observacion[] aObservaciones = new Observacion[1000];
		cargarObservaciones(aObservaciones);
		float [][] aProbabilidades =
				obtenerProbabilidadesLuke(aObservaciones, aContObservaciones, aRutas, aPlanetas);
		ordenarPosibilidades(aObservaciones, aProbabilidades,aRutas, aPlanetas);
	}

	/**
	 * Método auxiliar para poder encontrar el índice del planta Sin 
	 * @param aPlanetas
	 * @param nombre
	 * @return
	 */
	private static int indexOfIgnoreCase(String[] aPlanetas, String nombre) {
		if (nombre == null) return -1;
		for (int i = 0; i < aPlanetas.length; i++) {
			if (aPlanetas[i] != null && aPlanetas[i].equalsIgnoreCase(nombre.trim())) return i;
		}
		return -1;
	}

	/**
	 * Método auxiliar que calcula las probabilidades de observacion.
	 * @param o
	 * @param aProb
	 * @param aPlanetas
	 * @param aRutas
	 * @return
	 */
	private static float probDeObservacion(Observacion o, float[][] aProb, String[] aPlanetas, Ruta[] aRutas) {
        int i = indexOfIgnoreCase(aPlanetas, o.getRutaOrigen());
        int j = indexOfIgnoreCase(aPlanetas, o.getRutaDestino());
        if (i < 0 || j < 0) return 0f;
        if (rutaControlada(aRutas, o.getRutaOrigen(), o.getRutaDestino())) return 0f;
        return aProb[i][j];
    }

	
	private static boolean rutaControlada(Ruta[] aRutas, String origen, String destino) {
        for (Ruta r : aRutas) {
            if (r == null) continue;
            if (r.getOrigen().equalsIgnoreCase(origen.trim()) && r.getDestino().equalsIgnoreCase(destino.trim())) {
                return r.isControladaPrimeraOrden();
            }
        }
        return false; // si no existe, la tratamos como no controlada
    }

	private static void ordenarPosibilidades(Observacion[] aObservaciones, float[][] aProbabilidades,
			Ruta[] aRutas, String[] aPlanetas) {
		ArrayList<Observacion> lista = new ArrayList<>();
		for (Observacion o : aObservaciones) {
			if (o == null) break;
			lista.add(o);
		}

		lista.sort((o1, o2) -> {
			float p1 = probDeObservacion(o1, aProbabilidades, aPlanetas, aRutas);
			float p2 = probDeObservacion(o2, aProbabilidades, aPlanetas, aRutas);

			int cmpP = Float.compare(p2, p1); // desc
			if (cmpP != 0) return cmpP;

			// empate de prob: fecha desc
			return Integer.compare(o2.getFechaObservacion(), o1.getFechaObservacion());
		});

		System.out.println("\n=== OBSERVACIONES ORDENADAS POR PROBABILIDAD (desc) Y FECHA (desc) ===");
		for (Observacion o : lista) {
			float p = probDeObservacion(o, aProbabilidades, aPlanetas, aRutas);
			boolean ctrl = rutaControlada(aRutas, o.getRutaOrigen(), o.getRutaDestino());
			System.out.println("----------------------------------------------");
			o.mostrar();
			System.out.printf("Probabilidad (ruta): %.3f%n", p);
			System.out.println("Ruta controlada por Primera Orden: " + (ctrl ? "SI" : "NO"));
		}
		System.out.println("----------------------------------------------");


	}

	public static void actualizarObservaciones(Observacion obs, int[][] aContObservaciones, String[] aPlanetas) {
		if (obs == null) return;
		int i = indexOfIgnoreCase(aPlanetas, obs.getRutaOrigen());
		int j = indexOfIgnoreCase(aPlanetas, obs.getRutaDestino());
		if (i >= 0 && j >= 0) {
			aContObservaciones[i][j] += 1;
		}
	}


	public static float[][] obtenerProbabilidadesLuke(Observacion[] aObservaciones,
			int[][] aContObservaciones,
			Ruta[] aRutas,
			String[] aPlanetas) {

		// reset contadores (por si venían con algo)
		for (int i = 0; i < aContObservaciones.length; i++) {
			Arrays.fill(aContObservaciones[i], 0);
		}

		// actualizar contadores con las observaciones existentes
		for (Observacion o : aObservaciones) {
			if (o == null) {
				break;
			}
			actualizarObservaciones(o, aContObservaciones, aPlanetas);
		}

		// hallar máximo solo en rutas NO controladas
		int max = 0;
		for (Ruta r : aRutas) {
			if (r == null) continue;
			if (r.isControladaPrimeraOrden()) 
				continue;
			int i = indexOfIgnoreCase(aPlanetas, r.getOrigen());
			int j = indexOfIgnoreCase(aPlanetas, r.getDestino());
			if (i >= 0 && j >= 0) {
				max = Math.max(max, aContObservaciones[i][j]);
			}
		}

		float[][] aProb = new float[aPlanetas.length][aPlanetas.length];

		if (max == 0) {
			// todo queda a 0 (ya lo está por defecto)
			return aProb;
		}

		// asignar probabilidades solo a rutas NO controladas
		for (Ruta r : aRutas) {
			if (r == null) continue;
			int i = indexOfIgnoreCase(aPlanetas, r.getOrigen());
			int j = indexOfIgnoreCase(aPlanetas, r.getDestino());
			if (i < 0 || j < 0) continue;

			if (r.isControladaPrimeraOrden()) {
				aProb[i][j] = 0f;
			} else {
				aProb[i][j] = aContObservaciones[i][j] / (float) max;
			}
		}

		return aProb;
	}


	public static void cargarObservaciones(Observacion[] aObservaciones) {
		int n = 0;

		while (n < aObservaciones.length) {
			System.out.println("\n--- Nueva observación ---");
			Observacion o = new Observacion();
			o.leer();

			// Inserción ordenada descendente por fechaObservacion (más reciente primero)
			int pos = 0;
			// Primero buscamos la posición
			while (pos < n && aObservaciones[pos].getFechaObservacion() >= o.getFechaObservacion()) {
				pos++;
			}
			// Una vez localizada, desplazamos a la derecha
			for (int k = n; k > pos; k--) {
				aObservaciones[k] = aObservaciones[k - 1];
			}
			aObservaciones[pos] = o;
			n++;

			String resp = JOptionPane.showInputDialog("¿Introducir más observaciones? (s/n): ");
			resp = resp.trim();
			if (!resp.equalsIgnoreCase("s") && !resp.equalsIgnoreCase("si") && !resp.equalsIgnoreCase("sí")) {
				break;
			}
		}
	}

}