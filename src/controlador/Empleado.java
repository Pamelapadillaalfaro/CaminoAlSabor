/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *Clase que crea un empleado
 * @author Pamela
 */
public class Empleado extends Usuario{
    private String puesto;
    private int numeroDeEmpleado;
    /**
     * Constructor vacío
     */
    public Empleado() {
    }
    /**
     * Constructor con atributos
     * @param puesto Puesto del empleado
     * @param numeroDeEmpleado Numero de empleado
     * @param idUsuario ID que se le asigna al empleado
     * @param nombre Nombre del empleado
     * @param contrasena Contraseña del empleado
     */
    public Empleado(String puesto, int numeroDeEmpleado, int idUsuario, String nombre, String contrasena) {
        super(idUsuario, nombre, contrasena);
        this.puesto = puesto;
        this.numeroDeEmpleado = numeroDeEmpleado;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public int getNumeroDeEmpleado() {
        return numeroDeEmpleado;
    }
    public void setNumeroDeEmpleado(int numeroDeEmpleado) {
        this.numeroDeEmpleado = numeroDeEmpleado;
    }
    /**
     * Método que muestra los atributos del empleado
     * @return Atributos del empleado
     */
    @Override
    public String toString() {
        return super.toString()+"Empleado{" + "puesto=" + puesto + ", numeroDeEmpleado=" + numeroDeEmpleado + '}';
    }
    
}
