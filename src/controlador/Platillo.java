/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *Clase que crea un platillo
 * @author Ricardo R
 */
public class Platillo {

    String nombre, tipoDePlatillo, ingrediente, tipoEnvoltorio, cubiertos;
    double precio;
    /**
     * Constructor vacío
     */
    public Platillo() {
    }
    /**
     * Constructor con atributos
     * @param nombre Nombre del platillo
     * @param tipoDePlatillo Tipo de platillo
     * @param precio Precio del platillo
     * @param tipoEnvoltorio Tipo de envoltorio seleccionado por el usuario
     * @param cubiertos True si el usuario pide cubiertos
     * @param ingrediente Ingredientes que tiene el platillo
     */
    public Platillo(String nombre, String tipoDePlatillo, String ingrediente, String tipoEnvoltorio, String cubiertos, double precio) {
        this.nombre = nombre;
        this.tipoDePlatillo = tipoDePlatillo;
        this.ingrediente = ingrediente;
        this.tipoEnvoltorio=tipoEnvoltorio;
        this.cubiertos = cubiertos;
        this.precio = precio;
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

    public String getTipoEnvoltorio() {
        return tipoEnvoltorio;
    }

    public void setTipoEnvoltorio(String tipoEnvoltorio) {
        this.tipoEnvoltorio = tipoEnvoltorio;
    }

    public String getCubiertos() {
        return cubiertos;
    }

    public void setCubiertos(String cubiertos) {
        this.cubiertos = cubiertos;
    }
    /**
     * Método que muestra los atributos del platillo
     * @return Atributos del platillo
     */
    @Override
    public String toString() {
        return "Platillo{" + "nombre=" + nombre + ", tipoDePlatillo=" + tipoDePlatillo + ", ingrediente=" + ingrediente + ", tipoEnvoltorio=" + tipoEnvoltorio + ", cubiertos=" + cubiertos + ", precio=" + precio + '}';
    }



    
}
