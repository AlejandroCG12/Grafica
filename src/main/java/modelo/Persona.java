/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Momo
 */
public class Persona {
    
    private String nombre;
    private String id;
    private int edad;
    private String apellido;

    public Persona() {
    }

    public Persona(String nombre, String id, int edad, String apellido) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", id=" + id + ", edad=" + edad + ", apellido=" + apellido + '}';
    }
    
}
