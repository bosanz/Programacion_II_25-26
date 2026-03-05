package es.deusto.ingenieria.progii.scaperoom;
import java.util.ArrayList;
import java.util.List;

public class EscapeRoom {
    private final String nombre;
    private final List<Sala> salas;

    public EscapeRoom(String nombre) {
        this.nombre = nombre;
        this.salas = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public List<Sala> getSalas() { return salas; }

    public void addSala(Sala s) {
        if (s != null) salas.add(s);
    }

    public Sala getSalaInicial() {
        return salas.isEmpty() ? null : salas.get(0);
    }

    public Sala getSiguienteSala(Sala actual) {
        if (actual == null) return null;
        int idx = salas.indexOf(actual);
        if (idx < 0) return null;
        int next = idx + 1;
        return (next < salas.size()) ? salas.get(next) : null;
    }

    public int numeroSalas() {
        return salas.size();
    }
}