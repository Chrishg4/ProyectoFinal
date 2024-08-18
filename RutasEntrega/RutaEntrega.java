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
public class RutaEntrega {
    private String codigoRuta;
    private String nombre;
    private String descripcion;
    private HashSet<String> destinos;

    public String getCodigoRuta() {
        return codigoRuta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public HashSet<String> getDestinos() {
        return destinos;
    }

    public void setCodigoRuta(String codigoRuta) {
        this.codigoRuta = codigoRuta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
     public RutaEntrega(String codigoRuta, String nombre, String descripcion) {
        this.codigoRuta = codigoRuta;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.destinos = new HashSet<>();
    }

    public RutaEntrega(String codigoRuta, String nombre, String descripcion, HashSet<String> destinos) {
        this.codigoRuta = codigoRuta;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.destinos = new HashSet<>(destinos);
    }

    public void agregarDestino(String destino) {
        destinos.add(destino);
    }

    public void eliminarDestino(String destino) {
        destinos.remove(destino);
    }

    public void actualizarDescripcion(String nuevaDescripcion) {
        this.descripcion = nuevaDescripcion;
    }

    public void actualizarDestinos(HashSet<String> nuevosDestinos) {
        this.destinos = nuevosDestinos;
    }

    @Override
    public String toString() {
        return "RutaEntrega{" + "codigoRuta=" + codigoRuta + ", nombre=" + nombre + ", descripcion=" + descripcion + ", destinos=" + destinos + '}';
    }

    public boolean contieneDestino(String destino) {
        return destinos.contains(destino);
    }
 }

