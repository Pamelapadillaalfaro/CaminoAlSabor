/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.Vector;

/**
 *Clase que crea una lista de usuarios
 * @author Pamela
 */
public class ListaUsuario {
    private static Vector<Usuario> datos =new Vector<Usuario>();
    public static int flag=0, index=0;
    /**
     * Método que agrega un objeto al vector
     * @param obj Objeto tipo Usuario que se agrega a la lista
     */
    public static void agregar(Usuario obj){
        datos.addElement(obj);
    }
    /**
     * Método que elimina un objeto del vector segun el indice
     * @param pos Número que indica la posicion del objeto en el vector
     */
    public static void eliminar(int pos){
        datos.removeElementAt(pos);
    }
    /**
     * Método que regresa al vector
     * @return Vector
     */
    public static Vector mostrar(){
        return datos;
    }/**
     * Método que modifica el atributo flag
     */
    public static void validarEdicion(){
       ListaUsuario.flag=1;
    }
}
