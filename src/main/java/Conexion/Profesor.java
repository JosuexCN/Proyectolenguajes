/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

/**
 *
 * @author Josuex
 */
public class Profesor {
    private int idprofesor;
    private String nombre;
    private String apellidos;
    private String fechanac;
    private String correo;
    private String genero;
    private String especialidad;

    public Profesor(int idprofesor, String nombre, String apellidos, String fechanac, String correo, String genero, String especialidad) {
        this.idprofesor = idprofesor;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechanac = fechanac;
        this.correo = correo;
        this.genero = genero;
        this.especialidad = especialidad;
    }
    
    public Profesor() {
        this.idprofesor = 0;
        this.nombre = "";
        this.apellidos = "";
        this.fechanac = "";
        this.correo = "";
        this.genero = "";
        this.especialidad = "";
    }

    public int getIdprofesor() {
        return idprofesor;
    }

    public void setIdprofesor(int idprofesor) {
        this.idprofesor = idprofesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechanac() {
        return fechanac;
    }

    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    
}
