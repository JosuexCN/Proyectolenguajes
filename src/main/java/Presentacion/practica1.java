/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Presentacion;


import Conexion.Conexionproyecto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Josuex
 */
public class practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sSQL = "";
        Conexionproyecto conexion = new Conexionproyecto();
        
        try{
            sSQL = "SELECT * FROM estudiante";
            Connection con = conexion.conectar();
            Statement on = con.createStatement();
            ResultSet res = on.executeQuery(sSQL);
            
            while(res.next()){
                System.out.println("---------------------");
                System.out.println(res.getInt("idestudiante"));
                System.out.println(res.getString("nombre"));
                 System.out.println(res.getString("apellidos"));
                  System.out.println(res.getString("fechanac"));
                   System.out.println(res.getString("correo"));
                    System.out.println(res.getString("genero"));
                
              
                
            }
        
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
}
