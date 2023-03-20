/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

/**
 *
 * @author Josuex
 */
public class Notas {
    private int idnota;
    private int idestudiante;
    private int idprofesor;
    private int idmateria;
    private int nota;

    public Notas(int idnota, int idestudiante, int idprofesor, int idmateria, int nota) {
        this.idnota = idnota;
        this.idestudiante = idestudiante;
        this.idprofesor = idprofesor;
        this.idmateria = idmateria;
        this.nota = nota;
    }
    
    public Notas() {
        this.idnota = 0;
        this.idestudiante = 0;
        this.idprofesor = 0;
        this.idmateria = 0;
        this.nota = 0;
        
    }

    public int getIdnota() {
        return idnota;
    }

    public void setIdnota(int idnota) {
        this.idnota = idnota;
    }

    public int getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(int idestudiante) {
        this.idestudiante = idestudiante;
    }

    public int getIdprofesor() {
        return idprofesor;
    }

    public void setIdprofesor(int idprofesor) {
        this.idprofesor = idprofesor;
    }

    public int getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(int idmateria) {
        this.idmateria = idmateria;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
}
