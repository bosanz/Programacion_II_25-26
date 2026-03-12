package es.deusto.ingenieria.progii.ludoteca.model;

import java.time.LocalDate;

public class Prestamo {

    private Usuaria usuaria;
    private Recurso recurso;
    private LocalDate fecha;

    public Prestamo() {
        super();
    }

    public Prestamo(Usuaria usuaria, Recurso recurso, LocalDate fecha) {
        super();
        this.usuaria = usuaria;
        this.recurso = recurso;
        this.fecha = fecha;
    }

    public Usuaria getUsuaria() {
        return usuaria;
    }

    public void setUsuaria(Usuaria usuaria) {
        this.usuaria = usuaria;
    }

    public Recurso getRecurso() {
        return recurso;
    }

    public void setRecurso(Recurso recurso) {
        this.recurso = recurso;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

}
