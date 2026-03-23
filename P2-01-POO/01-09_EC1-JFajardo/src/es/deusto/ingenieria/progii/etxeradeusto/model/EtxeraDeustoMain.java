package es.deusto.ingenieria.progii.etxeradeusto.model;

import java.util.ArrayList;
import java.util.Collections;

public class EtxeraDeustoMain {

    public static void main(String[] args) {
        Inmobiliaria inmobiliaria = new Inmobiliaria();

        // Viviendas
        Apartamento a1 = new Apartamento(80, "Calle Mayor 1", "Ana", 210000, true);
        Casa c1 = new Casa(150, "Barrio Goikoa 12", "Luis", 320000, true, "Rural");
        Casa c2 = new Casa(130, "Centro 25", "Marta", 280000, false, "Urbana");
        Casa c3 = new Casa(170, "Caserío 7", "Pedro", 350000, true, "Rural");
        Comercio co1 = new Comercio(200, "Avenida 10", "Sonia", 500000, false, true);

        // Reservas de ejemplo
        a1.reservar();
        // c2 ya está no disponible por constructor
        // co1 ya está no disponible por constructor

        inmobiliaria.getViviendas().add(a1);
        inmobiliaria.getViviendas().add(c1);
        inmobiliaria.getViviendas().add(c2);
        inmobiliaria.getViviendas().add(c3);
        inmobiliaria.getViviendas().add(co1);

        // Usuarios
        Comprador u1 = new Comprador("111A", "Iker", "600111111", 25, 210000);
        Arrendatario u2 = new Arrendatario("222B", "Nerea", "600222222", 32, 24);
        Vendedor u3 = new Vendedor("333C", "Jon", "600333333", 45, true);
        Arrendatario u4 = new Arrendatario("444D", "Leire", "600444444", 29, 12);

        inmobiliaria.getUsuarios().add(u1);
        inmobiliaria.getUsuarios().add(u2);
        inmobiliaria.getUsuarios().add(u3);
        inmobiliaria.getUsuarios().add(u4);

        // Transacciones
        inmobiliaria.getTransacciones().add(new Transaccion("222B", c1.getId()));
        inmobiliaria.getTransacciones().add(new Transaccion("222B", c3.getId()));
        inmobiliaria.getTransacciones().add(new Transaccion("333C", co1.getId()));

        // 3.1 Probar 2.2
        System.out.println("Cantidad de viviendas reservadas: " + inmobiliaria.contarViviendasReservadas());

        // 3.1 Probar 2.3
        System.out.println("Usuario con más viviendas en oferta: " + inmobiliaria.usuarioConMasViviendasEnOferta());

        // 3.1 Probar 2.4
        System.out.println("Casas rurales disponibles:");
        ArrayList<Casa> casasRurales = inmobiliaria.obtenerViviendasRuralesDisponibles();
        for (Casa casa : casasRurales) {
            System.out.println(casa);
        }

        // 3.2 Probar Comparable
        ArrayList<Usuario> listaUsuarios = inmobiliaria.getUsuarios();
        Collections.sort(listaUsuarios);

        System.out.println("Usuarios ordenados por edad:");
        for (Usuario u : listaUsuarios) {
            System.out.println(u);
        }
    }
}
