/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 *
 * @author jdarg
 */
public class ListaEmpleados {
    private ArrayList<Empleado> empleados = new ArrayList<>();

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void actualizarEmpleado(String id, String nuevoTelefono, String nuevoCorreo, String nuevoPuesto, double nuevoSalario) {
        Empleado empleado = buscarEmpleado(id);
        empleado.setTelefono(nuevoTelefono);
        empleado.setCorreo(nuevoCorreo);
        empleado.setPuesto(nuevoPuesto, nuevoSalario);
    }

    public void eliminarEmpleado(String id) {
        Empleado empleado = buscarEmpleado(id);
        empleados.remove(empleado);
    }

    public Empleado buscarEmpleado(String id) {
        for (Empleado empleado : empleados) {
            if (empleado.getId().equals(id)) {
                return empleado;
            }
        }
        throw new NoSuchElementException("Empleado no encontrado.");
    }

    public void mostrarEmpleado(String id) {
        Empleado empleado = buscarEmpleado(id);
        System.out.println(empleado);
    }
}
