/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales.entidades;

/**
 *
 * @author lucas
 */
public class Gato {
    private String nombre;
    private String raza;
    private int anio;
    private Double peso;

    public Gato() {
    }

    public Gato(String nombre, String raza, int anio, Double peso) {
        this.nombre = nombre;
        this.raza = raza;
        this.anio = anio;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    
}
