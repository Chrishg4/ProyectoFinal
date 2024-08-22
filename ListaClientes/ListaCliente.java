/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaClientes;

import Clientes.Cliente;
import Paquetes.ListaPaquetes;
import Paquetes.Paquete;
import java.util.ArrayList;
import java.util.HashMap;


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
        Cliente cliente = buscarCliente(id);
    if (cliente != null) {
        cliente.setTelefono(telefono);
        cliente.setCorreoElectronico(correo);
    } else {
        throw new RuntimeException("El cliente no existe");
    }
    }

    public void eliminarCliente(String id) throws Exception {
        int identificacion = Integer.parseInt(id);
    for (Cliente cliente : listaClientes) {
        int clienteId = Integer.parseInt(cliente.getIdentificacion());
        if (clienteId == identificacion) {
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
    ListaPaquetes paquet = new ListaPaquetes();
    HashMap<String, Paquete> paquetesCliente = paquet.getPaquetes();
    for (Paquete paquete : paquetesCliente.values()) {
        if ("En transito".equalsIgnoreCase(paquete.getEstado())) {
            return true;
        }
    }
    return false;
}
}