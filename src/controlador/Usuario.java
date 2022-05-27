/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.Vector;

/**
 *Clase que crea un usuario
 * @author Pamela
 */
public class Usuario {
    private  int idUsuario;
    private  String nombre, contrasena;
    /**
     * Constructor vacío
     */
    public Usuario() {
    }
    /**
     * Constructor con parametros
     * @param idUsuario ID que se le asigna al usuario
     * @param nombre Nombre del usuario
     * @param contrasena Contraseña del usuario
     */
    public Usuario(int idUsuario, String nombre, String contrasena) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.contrasena = contrasena;
    }
    public int getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    /**
     * Método que verifica si el usuario es nuevo
     * @param usuario Nombre del usuario
     * @return -1 si el usuario ya existe o el indice se el usuario es nuevo
     */
    public static int verificarUsuarioNuevo(String usuario){
        Vector lista=mostrar();
        Usuario obj;
        for (int i = 0; i < lista.size(); i++) {
            obj=(Usuario)lista.elementAt(i);
            if (obj.getNombre().equalsIgnoreCase(usuario)) {
                return i;
            }
        }
        return -1;
    }
    public static int verificarLogin(String contrasena, int idUsuario){
      Vector lista= mostrar();
      Usuario obj;
        for (int i = 0; i <lista.size(); i++) {
            obj=(Usuario)lista.elementAt(i);
            if (obj.getIdUsuario()==idUsuario && obj.getContrasena().equalsIgnoreCase(contrasena)) {
                return i;
            }
        }
        return -1;
    }
    public static boolean tipoUsuario(int i){
        Cliente clienteTemp= new Cliente();
        if(Usuario.mostrar().get(i).getClass()==clienteTemp.getClass()){
            return true;
        }
        else
            return false;
    }
    public static Vector mostrar(){
        return ListaUsuario.mostrar();
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nombre=" + nombre + ", contrasena=" + contrasena + '}';
    }
    
   
    
}
