/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Envios;

import Clientes.Cliente;
import Paquetes.Paquete;
import RutasEntrega.RutaEntrega;
import java.time.LocalDate;

/**
 *
 * @author chris
 */
public class Envio {
    private static int contadorEnvios = 1;
    private int numeroEnvio;
    private Cliente cliente;
    private Paquete paquete;
    private RutaEntrega ruta;
    private LocalDate fechaEnvio;
    private LocalDate fechaEntrega;
    private double precioEnvio;
    private String estado;

    public Envio(Cliente cliente, Paquete paquete, RutaEntrega ruta, LocalDate fechaEnvio, LocalDate fechaEntrega) {
        this.numeroEnvio = contadorEnvios++;
        this.cliente = cliente;
        this.paquete = paquete;
        this.ruta = ruta;
        this.fechaEnvio = fechaEnvio;
        this.fechaEntrega = fechaEntrega;
        this.precioEnvio = calcularPrecio(paquete.getPeso());
        this.estado = "En almacén";
    }

    public int getNumeroEnvio() {
        return numeroEnvio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public RutaEntrega getRuta() {
        return ruta;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public String getEstado() {
        return estado;
    }

    public void despachar() {
        if ("En almacén".equals(this.estado)) {
            this.estado = "Despachado";
        } else {
            throw new IllegalStateException("El envío no se puede despachar. Estado actual: " + this.estado);
        }
    }
     public void entregar() {
        if ("Despachado".equals(this.estado)) {
            this.estado = "Entregado";
        } else {
            throw new IllegalStateException("El envío no se puede entregar. Estado actual: " + this.estado);
        }
    }

    public void cancelar() {
        if ("En almacén".equals(this.estado)) {
            this.estado = "Cancelado";
        } else {
            throw new IllegalStateException("El envío no se puede cancelar. Estado actual: " + this.estado);
        }
    }

    private double calcularPrecio(double peso) {
        double precioBase = 20100;
        double precioPorKiloAdicional = 1200;
        if (peso <= 1) {
            return precioBase;
        } else {
            return precioBase + (peso - 1) * precioPorKiloAdicional;
        }
    }
}
