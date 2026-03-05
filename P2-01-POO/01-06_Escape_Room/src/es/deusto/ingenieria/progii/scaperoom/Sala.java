package es.deusto.ingenieria.progii.scaperoom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sala {
    private final String nombre;
    private final List<Puzzle> puzzles;
    private final int minPuzzlesObligatorios;

    public Sala(String nombre, int minPuzzlesObligatorios) {
        this.nombre = nombre;
        this.minPuzzlesObligatorios = Math.max(0, minPuzzlesObligatorios);
        this.puzzles = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public int getMinPuzzlesObligatorios() { return minPuzzlesObligatorios; }
    public List<Puzzle> getPuzzles() { return puzzles; }

    public void addPuzzle(Puzzle p) {
        if (p != null) puzzles.add(p);
    }

    public boolean estaSuperada() {
        int obligatoriosResueltos = 0;
        for (Puzzle p : puzzles) {
            if (p.isObligatorio() && p.isResuelto()) obligatoriosResueltos++;
        }
        return obligatoriosResueltos >= minPuzzlesObligatorios;
    }

    public int puzzlesPendientes() {
        int pendientes = 0;
        for (Puzzle p : puzzles) {
            if (!p.isResuelto()) pendientes++;
        }
        return pendientes;
    }

    public Puzzle getPuzzlePendienteAleatorio(Random rnd) {
        List<Puzzle> pendientes = new ArrayList<>();
        for (Puzzle p : puzzles) {
            if (!p.isResuelto()) pendientes.add(p);
        }
        if (pendientes.isEmpty()) return null;
        return pendientes.get(rnd.nextInt(pendientes.size()));
    }
}