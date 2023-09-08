/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.evaluacionformac;

/**
 *
 * @author vina
 */
public class Cliente {
    private String nombre;
    private String appaterno;
    private String apmaterno;
    private int rut;
    private int edad;
    

    public Cliente() {
    }

    public Cliente(String nombre, String appaterno, String apmaterno, int rut, int edad) {
        this.nombre = nombre;
        this.appaterno = appaterno;
        this.apmaterno = apmaterno;
        this.rut = rut;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppaterno() {
        return appaterno;
    }

    public void setAppaterno(String appaterno) {
        this.appaterno = appaterno;
    }

    public String getApmaterno() {
        return apmaterno;
    }

    public void setApmaterno(String apmaterno) {
        this.apmaterno = apmaterno;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", appaterno=" + appaterno + ", apmaterno=" + apmaterno + ", rut=" + rut + ", edad=" + edad + '}';
    }
    
    
        
    }
    
    
   
    
   
}
