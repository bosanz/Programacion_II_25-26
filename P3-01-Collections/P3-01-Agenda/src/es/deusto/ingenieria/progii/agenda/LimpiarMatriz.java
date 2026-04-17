package es.deusto.ingenieria.progii.agenda;

import java.util.ArrayList;
import java.util.Arrays;

public class LimpiarMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Matriz original (con todos los datos)
        ArrayList<ArrayList<Integer>> original = new ArrayList<>();
        original.add(new ArrayList<>(Arrays.asList(1, 2, 0, 3, 0, 7)));
        original.add(new ArrayList<>(Arrays.asList(0, 0, 0, 0)));
        original.add(new ArrayList<>(Arrays.asList(0, 6, 9, 8, 0, 9, 6)));
        original.add(new ArrayList<>(Arrays.asList(0, 0, 0, 0, 7, 9, 0, 0)));
        original.add(new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0)));
        original.add(new ArrayList<>(Arrays.asList(8, 7, 0, 8, 9, 0, 8)));
        
        mostrarMatriz(original);
        
        ArrayList<ArrayList<Integer>> limpia = limpiarMatrizConCopia(original);
        
        System.out.println("==========DESPUES==========");
        
        mostrarMatriz(limpia);
        
        System.out.println("==========PARTE 2==========");
        
        limpiarMatriz(original);
        
        mostrarMatriz(original);

	}
	
	private static void limpiarMatriz(ArrayList<ArrayList<Integer>> original) {
		
		for (int i = original.size() - 1; i >= 0; i--) {
			ArrayList<Integer> fila = original.get(i);
			
			for(int j = fila.size() - 1; j >= 0; j--) {
				if (fila.get(j) == 0)
					fila.remove(j);
			}
			
			if (fila.size() == 0) {
				original.remove(i);
			}
		}
		
		
	}

	private static ArrayList<ArrayList<Integer>> limpiarMatrizConCopia(ArrayList<ArrayList<Integer>> original) {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayList<Integer>> resultado = new ArrayList<ArrayList<Integer>>();
		
		for(ArrayList<Integer> fila : original) {
			ArrayList<Integer> filaCopia = new ArrayList<Integer>(); 
			for(Integer e: fila) {
				if (e != 0) {
					// Añadimos el elemento a la fila
					filaCopia.add(e);
				}
			}
			
			// SI la fila no está vacía, la añadimos a la matriz
			if (filaCopia.size() != 0)
				resultado.add(filaCopia);
		}
		
		return resultado;
	}

	// Método auxiliar para que por consola se vea bonito
    public static void mostrarMatriz(ArrayList<ArrayList<Integer>> matriz) {
        for (ArrayList<Integer> fila : matriz) {
            for (Integer num : fila) {
                System.out.print(num + " ");
            }
            System.out.println(); // Salto de línea por cada fila
        }
    }

}
