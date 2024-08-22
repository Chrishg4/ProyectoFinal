/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquetes;

import java.util.HashMap;
import java.util.NoSuchElementException;


public class ListaPaquetes {
    private HashMap<String, Paquete> paquetes;

    public ListaPaquetes() {
        paquetes = new HashMap<>();
    }

    public void agregarPaquete(Paquete paquete) {
        if (paquetes.containsKey(paquete.getCodigo())) {
        } else {
            paquetes.put(paquete.getCodigo(), paquete);
        }
    }
 
    public void actualizarPaquete(String codigo, String nuevaDescripcion, String nuevoDestinatarioCedula, String nuevoDestinatarioNombre) {
        Paquete paquete = paquetes.get(codigo);
        if (paquete != null) {
            paquete.setDescripcion(nuevaDescripcion);
            paquete.setDestinatarioCedula(nuevoDestinatarioCedula);
            paquete.setDestinatarioNombre(nuevoDestinatarioNombre);
        } else {
        }
    }
  
    public void eliminarPaquete(String codigo) throws Exception {
        Paquete paquete = paquetes.get(codigo);
        if (paquete != null) {
            if (!"En tránsito".equals(paquete.getEstado())) {
                paquetes.remove(codigo);
            } else {
                throw new Exception("No se puede eliminar un paquete en transito.");
            }
        } else {
        }
    }
  
    public Paquete buscarPaquete(String codigo) {
    Paquete paquete = paquetes.get(codigo);
    if (paquete == null) {
        throw new NoSuchElementException("Paquete con código " + codigo + " no encontrado.");
    }
    return paquete;
}
    
    public void mostrarTodosLosPaquetes() {
        if (paquetes.isEmpty()) {
        } else {
            for (String codigo : paquetes.keySet()) {
            }
        }
    }
}
