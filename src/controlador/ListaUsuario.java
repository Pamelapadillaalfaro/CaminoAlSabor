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
    public static void agregar(Usuario obj){
        datos.addElement(obj);
    }
    public static void eliminar(int pos){
        datos.removeElementAt(pos);
    }
    public static Vector mostrar(){
        return datos;
    }
    public static void validarEdicion(){
       ListaUsuario.flag=1;
    }
}
