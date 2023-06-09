/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edu.neu.info5100.components;

import edu.neu.info5100.database.DB;
import edu.neu.info5100.driver.INFO5100Project;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author megha
 */
public class ViewOngoingRides extends javax.swing.JPanel {

    /**
     * Creates new form ViewOngoingRides
     */
    public ViewOngoingRides() {
        initComponents();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        OngoingRides = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(400, 600));

        OngoingRides.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(OngoingRides);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

public void loadTable() {
    Connection conn = new DB().connection();

    DefaultTableModel model = new DefaultTableModel();
    
    model.addColumn("Driver Name");
    model.addColumn("From Location");
    model.addColumn("To Location");

    model.addColumn("Time");


    try {
      PreparedStatement pstm = conn.prepareStatement(
        "Select drivername, fromLocation , toLocation ,time FROM cabrides where status='InProgress';"
      );
     ResultSet Rs = pstm.executeQuery();
      while (Rs.next()) {
        model.addRow(
          new Object[] {
            Rs.getString("drivername"),
            Rs.getString("fromLocation"),
            Rs.getString("toLocation"),
            Rs.getString("time"),
  
          }
        );
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
      
    }
    OngoingRides.setModel(model);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable OngoingRides;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
