/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquetes;

import java.util.HashMap;

/**
 *
 * @author ilope
 */
public class ListaPaquetes {
    private HashMap<String, Paquete> paquetes;

    public ListaPaquetes() {
        paquetes = new HashMap<>();
    }

    public void agregarPaquete(Paquete paquete) {
        if (paquetes.containsKey(paquete.getCodigo())) {
            System.out.println("El paquete con el codigo " + paquete.getCodigo()+ " ya existe.");
        } else {
            paquetes.put(paquete.getCodigo(), paquete);
            System.out.println("Paquete agregado: " + paquete);
        }
    }
 
    public void actualizarPaquete(String codigo, String nuevaDescripcion, String nuevoDestinatarioCedula, String nuevoDestinatarioNombre) {
        Paquete paquete = paquetes.get(codigo);
        if (paquete != null) {
            paquete.setDescripcion(nuevaDescripcion);
            paquete.setDestinatarioCedula(nuevoDestinatarioCedula);
            paquete.setDestinatarioNombre(nuevoDestinatarioNombre);
            System.out.println("Paquete actualizado: " + paquete);
        } else {
            System.out.println("Paquete con el codigo " + codigo + " no encontrado.");
        }
    }
  
    public void eliminarPaquete(String codigo) throws Exception {
        Paquete paquete = paquetes.get(codigo);
        if (paquete != null) {
            if (!"En tránsito".equals(paquete.getEstado())) {
                paquetes.remove(codigo);
                System.out.println("Paquete eliminado: " + paquete);
            } else {
                throw new Exception("No se puede eliminar un paquete en transito.");
            }
        } else {
            System.out.println("Paquete con el codigo " + codigo + " no encontrado.");
        }
    }
  
    public Paquete buscarPaquete(String codigo) {
        Paquete paquete = paquetes.get(codigo);
        if (paquete != null) {
            System.out.println("Paquete encontrado: " + paquete);
        } else {
            System.out.println("Paquete con el codigo " + codigo + " no encontrado.");
        }
        return paquete;
    }
    
    public void mostrarTodosLosPaquetes() {
        if (paquetes.isEmpty()) {
            System.out.println("No hay paquetes en la lista.");
        } else {
            System.out.println("Lista de todos los paquetes:");
            for (String codigo : paquetes.keySet()) {
                System.out.println(paquetes.get(codigo));
            }
        }
    }
}
