/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquetes;

/**
 *
 * @author ilope
 */
public class Paquete {
    private String Codigo;
    private String descripcion;
    private double peso;
    private String remitenteCedula;
    private String remitenteNombre;
    private String destinatarioCedula;
    private String destinatarioNombre;
    private char estado;
    
    public static final char Almacenado='A',Transitando='T',Entregado='E';


    public String getCodigo() {
        return Codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPeso() {
        return peso;
    }

    public String getRemitenteCedula() {
        return remitenteCedula;
    }

    public String getRemitenteNombre() {
        return remitenteNombre;
    }

    public String getDestinatarioCedula() {
        return destinatarioCedula;
    }

    public String getDestinatarioNombre() {
        return destinatarioNombre;
    }

    public String getEstado () {
    return switch (estado) {
        case Almacenado -> "En almacen";
        case Transitando -> "En transito";
        case Entregado -> "Paquete entregado";
        default -> "Estado no reconocido";
    };
    }


        

    

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setRemitenteNombre(String remitenteNombre) {
        this.remitenteNombre = remitenteNombre;
    }

    public void setDestinatarioNombre(String destinatarioNombre) {
        this.destinatarioNombre = destinatarioNombre;
    }

    public void setDestinatarioCedula(String destinatarioCedula) {
        this.destinatarioCedula = destinatarioCedula;
    }

    public void setRemitenteCedula(String remitenteCedula) {
        this.remitenteCedula = remitenteCedula;
    }
    

    public void setEstado (char estado) {
    estado = Character.toUpperCase(estado);
    if (estado == 'A' || estado == 'T' || estado == 'E'){
    this.estado = estado;
    }
    }
    public Paquete(String Codigo, String descripcion, double peso, String remitenteCedula, String remitenteNombre, String destinatarioCedula, String destinatarioNombre) 
    {
        this.Codigo = Codigo;
        this.descripcion = descripcion;
        this.peso = peso;
        this.remitenteCedula = remitenteCedula;
        this.remitenteNombre = remitenteNombre;
        this.destinatarioCedula = destinatarioCedula;
        this.destinatarioNombre = destinatarioNombre;
        this.estado = estado;
    }

    

    @Override
    public String toString() {
    return String.format(
        "Paquete--Codigo: %s,--Descripcion: %s,--Peso: %.2f,--Remitente Cedula: %s,--Remitente Nombre: %s,--Destinatario Cedula: %s,--Destinatario Nombre: %s,--Estado: %s",
        Codigo,
        descripcion,
        peso,
        remitenteCedula,
        remitenteNombre,
        destinatarioCedula,
        destinatarioNombre,
        estado
    );
}
}
