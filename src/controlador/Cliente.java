/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;

/**
 *Clase que crea un cliente
 * @author Pamela
 */
public class Cliente extends Usuario{
    private  String direccion, datosTarjeta;
    /**
     * Constructor vacío
     */
    public Cliente() {
    }
    /**
     * Constructor con atributos
     * @param direccion Direccion donde vive el cliente
     * @param datosTarjeta Datos de la tarjeta del cliente
     * @param idUsuario ID que se lo otorga al cliente
     * @param nombre Nombre del cliente
     * @param contrasena Contraseña del cliente
     */
    public Cliente(String direccion, String datosTarjeta, int idUsuario, String nombre, String contrasena) {
        super(idUsuario, nombre, contrasena);
        this.direccion = direccion;
        this.datosTarjeta = datosTarjeta;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getDatosTarjeta() {
        return datosTarjeta;
    }
    public void setDatosTarjeta(String datosTarjeta) {
        this.datosTarjeta = datosTarjeta;
    }
    /**
     * Método que muestra los atributos del cliente
     * @return Atributos del cliente
     */
    @Override
    public String toString() {
        return super.toString()+"Cliente{" + "direccion=" + direccion + ", datosTarjeta=" + datosTarjeta + '}';
    }

    
           
}
