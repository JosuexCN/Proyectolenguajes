/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Presentacion;

import Conexion.Conexion;
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
        Conexion conexion = new Conexion();
        
        try{
            sSQL = "SELECT * FROM regions";
            Connection con = conexion.conectar();
            Statement on = con.createStatement();
            ResultSet res = on.executeQuery(sSQL);
            
            while(res.next()){
                System.out.println("---------------------");
                System.out.println(res.getInt("region_id"));
                System.out.println(res.getString("region_name"));
              
                
            }
        
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
}
