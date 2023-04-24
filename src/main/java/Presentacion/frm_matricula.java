/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

/**
 *
 * @author Josuex
 */

import Conexion.Conexionproyecto;
import Conexion.Estudiante;
import Conexion.Materia;
import Conexion.Matricula;
import Conexion.Profesor;
import Conexion.Notas;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OracleTypes;
public class frm_matricula extends javax.swing.JFrame {
private static final String INSERTAR ="{call aplicacion.insertar_matri(?,?,?,?,?,?)}";
private static final String VER = "{? = call aplicacion.vermatricula}";
private static final String VER1 = "{? = call aplicacion.vermaterias}";
private static final String BORRAR ="{call aplicacion.eliminar_matri(?)}";
private static final String MODIFICAR ="{call aplicacion.modificar_matri(?,?,?,?,?,?)}";
Conexionproyecto conexion = new Conexionproyecto();
String ced;
String ced1;
    /**
     * Creates new form frm_matricula
     */
    public frm_matricula() {
        initComponents();
        this.setTitle("MENU DE MATRICULA");
        mostrar();
        mostrar1();
    }
    
     public void mostrar(){
        
        
            
        DefaultTableModel tab_estudiant = new DefaultTableModel();
        tab_estudiant.addColumn("ID Matricula");
        tab_estudiant.addColumn("ID Estudiante");
        tab_estudiant.addColumn("Materia 1");
        tab_estudiant.addColumn("Materia 2");
        tab_estudiant.addColumn("Materia 3");
        tab_estudiant.addColumn("Materia 4");
        tab_estudiante.setModel(tab_estudiant);
        
        String [] datos = new String [6]
;        try{
            
           
            CallableStatement  consulta = conexion.conectar().prepareCall(VER);
            consulta.registerOutParameter(1, OracleTypes.CURSOR);
            consulta.execute();
         
            ResultSet rs = (ResultSet) consulta.getObject(1);
            
            while (rs!=null && rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                
                
                
                tab_estudiant.addRow(datos);

            }
            tab_estudiante.setModel(tab_estudiant);
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
         
        }    
        
    }
    
    public void mostrar1(){
        
        
            
        DefaultTableModel tab_estudiant = new DefaultTableModel();
        tab_estudiant.addColumn("Id");
        tab_estudiant.addColumn("Nombre");
        tab_estudiant.addColumn("Tipo");
        tab_estudiant.addColumn("Precio");
        
        tab_estudiante1.setModel(tab_estudiant);
        
        String [] datos = new String [4];
        try{

            CallableStatement  consulta = conexion.conectar().prepareCall(VER1);
            consulta.registerOutParameter(1, OracleTypes.CURSOR);
            consulta.execute();
         
            ResultSet rs = (ResultSet) consulta.getObject(1);;
            
            while (rs!=null && rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                
                
                
                tab_estudiant.addRow(datos);

            }
            tab_estudiante1.setModel(tab_estudiant);
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
         
        }    
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab_estudiante1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lbl_cedula = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        lbl_titulo = new javax.swing.JLabel();
        btn_aceptar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbl_cedula2 = new javax.swing.JLabel();
        lbl_nombre1 = new javax.swing.JLabel();
        lbl_genero1 = new javax.swing.JLabel();
        lbl_apellido2 = new javax.swing.JLabel();
        txt_cedula2 = new javax.swing.JTextField();
        txt_genero1 = new javax.swing.JTextField();
        txt_apellido2 = new javax.swing.JTextField();
        txt_nombre1 = new javax.swing.JTextField();
        btn_modifica = new javax.swing.JButton();
        btn_inserta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_nota = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_nota1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_estudiante = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setText("insertar nuevas matriculas y modificar matriculas actuales");

        btn_salir.setForeground(new java.awt.Color(255, 102, 102));
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        tab_estudiante1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tab_estudiante1);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));

        lbl_cedula.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_cedula.setText("ID de matricula");

        lbl_titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_titulo.setText("Eliminar Matricula");

        btn_aceptar1.setForeground(new java.awt.Color(0, 204, 255));
        btn_aceptar1.setText("Aceptar");
        btn_aceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptar1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Verifique bien el numero de Id antes de eliminar.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_titulo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btn_aceptar1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_cedula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo)
                .addGap(18, 18, 18)
                .addComponent(lbl_cedula)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_aceptar1))
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));

        lbl_cedula2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_cedula2.setText("ID Matricula");

        lbl_nombre1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_nombre1.setText("ID Estudiante");

        lbl_genero1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_genero1.setText("ID Materia 1");

        lbl_apellido2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_apellido2.setText("ID Materia 2");

        txt_cedula2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cedula2ActionPerformed(evt);
            }
        });

        btn_modifica.setForeground(new java.awt.Color(0, 204, 204));
        btn_modifica.setText("Modificar");
        btn_modifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificaActionPerformed(evt);
            }
        });

        btn_inserta.setForeground(new java.awt.Color(0, 204, 204));
        btn_inserta.setText("Insertar");
        btn_inserta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Ingresar y modificar Matricula");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("ID Materia 3");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("ID Materia 4");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(lbl_cedula2)
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_genero1)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btn_modifica, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(btn_inserta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_nota)
                                    .addComponent(txt_cedula2, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                    .addComponent(txt_genero1, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_apellido2)
                                            .addComponent(lbl_nombre1))
                                        .addGap(55, 55, 55)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_nota1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(66, 66, 66)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cedula2)
                    .addComponent(txt_cedula2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nombre1)
                    .addComponent(txt_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_apellido2)
                    .addComponent(txt_apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_genero1)
                    .addComponent(txt_genero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addComponent(txt_nota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_modifica)
                    .addComponent(btn_inserta))
                .addContainerGap())
        );

        jLabel4.setText("En esta seccion el administrador podra.");

        jLabel2.setText("Ver la lista de matriculas actualizada");

        tab_estudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tab_estudiante);

        jLabel5.setText("Eliminar una matricula a partir del id");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(53, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(btn_salir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_aceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptar1ActionPerformed

        ced = txt_cedula.getText();

        try{

            CallableStatement  consulta = conexion.conectar().prepareCall(BORRAR);

            consulta.setString(1, ced);
            if (consulta.executeUpdate()>0){
                JOptionPane.showMessageDialog(null,"Los datos de la nota fueron borrados de la base de datos");
            }else{
                JOptionPane.showMessageDialog(null,"No fue encontada la cédula del estudiante en la base de datos");
            }

        }catch (SQLException ex){

            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        limpiaCajasDeTexto();
        mostrar();
    }//GEN-LAST:event_btn_aceptar1ActionPerformed

    private void txt_cedula2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cedula2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedula2ActionPerformed

    private void btn_modificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificaActionPerformed
        // TODO add your handling code here:
        try{

            Matricula obj = new Matricula();

            obj.setIdmatricula(Integer.parseInt( txt_cedula2.getText()));
            obj.setIdestudiante(Integer.parseInt( txt_nombre1.getText()));
            obj.setIdmateria1(Integer.parseInt( txt_genero1.getText()));
            obj.setIdmateria2(Integer.parseInt( txt_apellido2.getText()));
            obj.setIdmateria3(Integer.parseInt( txt_nota.getText()));
            obj.setIdmateria4(Integer.parseInt( txt_nota1.getText()));

            CallableStatement  sentencia = conexion.conectar().prepareCall(MODIFICAR);
            sentencia.setInt(1, obj.getIdmatricula());
            sentencia.setInt(2, obj.getIdestudiante());
            sentencia.setInt(3, obj.getIdmateria1());
            sentencia.setInt(4, obj.getIdmateria2());
            sentencia.setInt(5, obj.getIdmateria3());
            sentencia.setInt(6, obj.getIdmateria4());

            if (sentencia.executeUpdate()>0){
                JOptionPane.showMessageDialog(null,"La información de la nota fue actualizada correctamente");
            }else{
                JOptionPane.showMessageDialog(null,"No fue encontrado la nota para actualizarlo");
            }
            limpiaCajasDeTexto1();
            mostrar();

        }catch (SQLException ex){

            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
    }//GEN-LAST:event_btn_modificaActionPerformed

    private void btn_insertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertaActionPerformed
        // TODO add your handling code here:
        try{

            Matricula obj = new Matricula();

            obj.setIdmatricula(Integer.parseInt( txt_cedula2.getText()));
            obj.setIdestudiante(Integer.parseInt( txt_nombre1.getText()));
            obj.setIdmateria1(Integer.parseInt( txt_genero1.getText()));
            obj.setIdmateria2(Integer.parseInt( txt_apellido2.getText()));
            obj.setIdmateria3(Integer.parseInt( txt_nota.getText()));
            obj.setIdmateria4(Integer.parseInt( txt_nota1.getText()));

            CallableStatement  sentencia = conexion.conectar().prepareCall(INSERTAR);

            sentencia.setInt(1, obj.getIdmatricula());
            sentencia.setInt(2, obj.getIdestudiante());
            sentencia.setInt(3, obj.getIdmateria1());
            sentencia.setInt(4, obj.getIdmateria2());
            sentencia.setInt(5, obj.getIdmateria3());
            sentencia.setInt(6, obj.getIdmateria4());

            if (sentencia.executeUpdate()>0){
                JOptionPane.showMessageDialog(null,"Nota ingresada correctamente");
            }else{
                JOptionPane.showMessageDialog(null,"No se pudo ingresar la nota");
            }

            limpiaCajasDeTexto1();
            mostrar();

        }catch (SQLException ex){

            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
    }//GEN-LAST:event_btn_insertaActionPerformed
    public void limpiaCajasDeTexto (){

        this.txt_cedula.setText("");
        
    }
    public void limpiaCajasDeTexto1 (){
        
        this.txt_apellido2.setText("");
        this.txt_nota1.setText("");
        this.txt_nombre1.setText("");
        this.txt_nota.setText("");
        this.txt_cedula2.setText("");
        this.txt_genero1.setText("");
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_matricula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar1;
    private javax.swing.JButton btn_inserta;
    private javax.swing.JButton btn_modifica;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_apellido2;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_cedula2;
    private javax.swing.JLabel lbl_genero1;
    private javax.swing.JLabel lbl_nombre1;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JTable tab_estudiante;
    private javax.swing.JTable tab_estudiante1;
    private javax.swing.JTextField txt_apellido2;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_cedula2;
    private javax.swing.JTextField txt_genero1;
    private javax.swing.JTextField txt_nombre1;
    private javax.swing.JTextField txt_nota;
    private javax.swing.JTextField txt_nota1;
    // End of variables declaration//GEN-END:variables
}
