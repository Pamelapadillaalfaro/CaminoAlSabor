/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.Vector;

/**
 *Clase que crea un platillo
 * @author Ricardo R
 */
public class Platillo {

    String nombre, tipoDePlatillo, ingrediente;
    double precio,stock;

    public Platillo() {
    }

    public Platillo(String nombre, String tipoDePlatillo, double precio, String ingrediente, double stock) {
        this.nombre = nombre;
        this.tipoDePlatillo = tipoDePlatillo;
        this.precio = precio;
        this.ingrediente=ingrediente;
        this.stock=stock;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDePlatillo() {
        return tipoDePlatillo;
    }

    public void setTipoDePlatillo(String tipoDePlatillo) {
        this.tipoDePlatillo = tipoDePlatillo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public static int verificarPlatilloNuevo(String nombre){
        Vector lista=mostrar();
        Platillo obj;
        for (int i = 0; i < lista.size(); i++) {
            obj=(Platillo)lista.elementAt(i);
            if (obj.getNombre().equalsIgnoreCase(nombre)) {
                return i;
            }
        }
        return -1;
    }
    public static int verificarLogin(String nombre, double precio){
      Vector lista=mostrar();
      Platillo obj;
        for (int i = 0; i <lista.size(); i++) {
            obj=(Platillo)lista.elementAt(i);
            if (obj.getNombre().equalsIgnoreCase(nombre) && obj.getPrecio()==precio) {
                return i;
            }
        }
        return -1;
    }
    public static Vector mostrar(){
        return ListaPlatillo.mostrar();
    }

    @Override
    public String toString() {
        return "Platillo{" + "nombre=" + nombre + ", tipoDePlatillo=" + tipoDePlatillo + ", ingrediente=" + ingrediente + ", precio=" + precio + ", stock=" + stock + '}';
    }



    
}
