/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RutasEntrega;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Luisk
 */
public class RutaEntrega {
    private String codigoRuta;
    private String nombre;
    private String descripcion;
    private Set<String> destinos;

    public String getCodigoRuta() {
        return codigoRuta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Set<String> getDestinos() {
        return destinos;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDestinos(Set<String> destinos) {
        this.destinos = destinos;
    }
   
    public RutaEntrega(String codigoRuta, String nombre, String descripcion) {
        this.codigoRuta = codigoRuta;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.destinos = new HashSet<>();
    }

    public void agregarDestino(String destino) {
        destinos.add(destino);
    }

    public void actualizarRuta(String nuevaDescripcion, Set<String> nuevosDestinos) {
        setDescripcion(nuevaDescripcion);
        setDestinos(nuevosDestinos);
    }

    public void eliminarDestino(String destino) {
        destinos.remove(destino);
    }

    public boolean buscarDestino(String destino) {
        return destinos.contains(destino);
    }

    public void mostrarInformacion() {
        System.out.println("Código de Ruta: " + codigoRuta);
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Destinos: " + destinos);
    }

    @Override
    public String toString() {
        return "RutaEntrega{" +
                "codigoRuta='" + codigoRuta + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", destinos=" + destinos +
                '}';
    }
}
