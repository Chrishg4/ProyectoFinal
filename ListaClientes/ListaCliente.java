/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaClientes;

import Clientes.Cliente;
import java.util.ArrayList;

/**
 *
 * @author chris
 */
public class ListaCliente {
     private ArrayList<Cliente> listaClientes = new ArrayList<>();

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
     
    public void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public void actualizarCliente(String id, String telefono, String correo) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getIdentificacion() == id) {
                cliente.setTelefono(telefono);
                cliente.setCorreoElectronico(correo);
                break;
            }
        }
    }

    public void eliminarCliente(String id) throws Exception {
        for (Cliente cliente : listaClientes) {
            if (cliente.getIdentificacion() == id) {
                if (tienePaquetesEnTransito(cliente)) {
                    throw new Exception("No se puede eliminar el cliente porque tiene paquetes en tránsito");
                }
                listaClientes.remove(cliente);
                break;
            }
        }
    }

    public Cliente buscarCliente(String id) {
    for (Cliente cliente : listaClientes) {
        if (cliente.getIdentificacion().equals(id)) {
            return cliente;
        }
    }
    return null;
}

    private boolean tienePaquetesEnTransito(Cliente cliente) {
        // lista de paquetes
        // ...
        return false; // No tiene
    }
    
}

