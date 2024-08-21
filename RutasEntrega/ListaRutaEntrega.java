/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RutasEntrega;

import java.util.HashSet;

/**
 *
 * @author Luisk
 */
public class ListaRutaEntrega {
    private HashSet<RutaEntrega> conjuntoRutas;

    public ListaRutaEntrega() {
        this.conjuntoRutas = new HashSet<>();
    }

    public void agregarRuta(RutaEntrega ruta) {
        conjuntoRutas.add(ruta);
    }

    public boolean eliminarRuta(String codigoRuta) {
        RutaEntrega rutaAEliminar = buscarRuta(codigoRuta);
        if (rutaAEliminar != null) {
            conjuntoRutas.remove(rutaAEliminar);
            return true;
        }
        return false;
    }

    public RutaEntrega buscarRuta(String codigoRuta) {
        for (RutaEntrega ruta : conjuntoRutas) {
            if (ruta.getCodigoRuta().equalsIgnoreCase(codigoRuta)) {
                return ruta;
            }
        }
        return null;
    }

    public boolean actualizarRuta(String codigoRuta, String nuevaDescripcion, String nuevosDestinos) {
        RutaEntrega ruta = buscarRuta(codigoRuta);
        if (ruta != null) {
            ruta.actualizarDescripcion(nuevaDescripcion);
            ruta.actualizarDestinos(nuevosDestinos);
            return true;
        }
        return false;
    }

    public void mostrarRutas() {
        if (conjuntoRutas.isEmpty()) {
            System.out.println("No hay rutas de entrega.");
        } else {
            for (RutaEntrega ruta : conjuntoRutas) {
                System.out.println(ruta.toString());
                System.out.println("-----------------------------");
            }
        }
    }

    public HashSet<RutaEntrega> obtenerRutas() {
        return conjuntoRutas;
    }
}
