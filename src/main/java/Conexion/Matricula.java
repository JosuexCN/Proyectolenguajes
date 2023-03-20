/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

/**
 *
 * @author Josuex
 */
public class Matricula {
    private int idmatricula;
    private int idestudiante;
    private int idmateria1;
    private int idmateria2;
    private int idmateria3;
    private int idmateria4;

    public Matricula(int idmatricula, int idestudiante, int idmateria1, int idmateria2, int idmateria3, int idmateria4) {
        this.idmatricula = idmatricula;
        this.idestudiante = idestudiante;
        this.idmateria1 = idmateria1;
        this.idmateria2 = idmateria2;
        this.idmateria3 = idmateria3;
        this.idmateria4 = idmateria4;
    }
    
    public Matricula() {
        this.idmatricula = 0;
        this.idestudiante = 0;
        this.idmateria1 = 0;
        this.idmateria2 = 0;
        this.idmateria3 = 0;
        this.idmateria4 = 0;
    }

    public int getIdmatricula() {
        return idmatricula;
    }

    public void setIdmatricula(int idmatricula) {
        this.idmatricula = idmatricula;
    }

    public int getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(int idestudiante) {
        this.idestudiante = idestudiante;
    }

    public int getIdmateria1() {
        return idmateria1;
    }

    public void setIdmateria1(int idmateria1) {
        this.idmateria1 = idmateria1;
    }

    public int getIdmateria2() {
        return idmateria2;
    }

    public void setIdmateria2(int idmateria2) {
        this.idmateria2 = idmateria2;
    }

    public int getIdmateria3() {
        return idmateria3;
    }

    public void setIdmateria3(int idmateria3) {
        this.idmateria3 = idmateria3;
    }

    public int getIdmateria4() {
        return idmateria4;
    }

    public void setIdmateria4(int idmateria4) {
        this.idmateria4 = idmateria4;
    }
    
    
}
