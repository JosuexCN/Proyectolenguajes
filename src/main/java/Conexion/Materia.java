/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

/**
 *
 * @author Josuex
 */
public class Materia {
    private int idmateria;
    private String nombre;
    private String tipo;
    private int precio;

    public Materia(int idmateria, String nombre, String tipo, int precio) {
        this.idmateria = idmateria;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }
    public Materia() {
        this.idmateria = 0;
        this.nombre = "";
        this.tipo = "";
        this.precio = 0;
        
    }
    public int getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(int idmateria) {
        this.idmateria = idmateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
