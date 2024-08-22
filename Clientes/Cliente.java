/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author chris
 */
public class Cliente {
    private String id;
    private String nombre;
    private LocalDate fechaNac;
    private String telefono;
    private String correo;
    private int edad; 

    public String getIdentificacion() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNac;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setIdentificacion(String identificacion) {
        this.id = identificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNac = fechaNacimiento;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correo = correoElectronico;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Cliente(String id, String nombre, LocalDate fechaNac, String telefono, String correo, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
        this.correo = correo;
        /*this.edad = edad;*/
    }

    public Cliente() {
        this("","",LocalDate.now(),"","",0);
    }
    
    
      
    // Calcular edad del cliente
    public int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        Period edad = Period.between(getFechaNacimiento(), fechaActual);
        return edad.getYears();
    }
   
}

