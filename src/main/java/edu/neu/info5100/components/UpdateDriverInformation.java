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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author megha
 */
public class UpdateDriverInformation extends javax.swing.JPanel {

    /**
     * Creates new form UpdateDriverInformation
     */
    public UpdateDriverInformation() {
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
        ListOfDriversTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtGender = new javax.swing.JComboBox<>();
        txtRole = new javax.swing.JTextField();
        txtGenderValue = new javax.swing.JLabel();
        txtOrg = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnUpdateDriverDetails = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtEnterprise = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        ListOfDriversTable.setModel(new javax.swing.table.DefaultTableModel(
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
        ListOfDriversTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListOfDriversTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListOfDriversTable);

        jLabel8.setText("Username");

        jLabel5.setText("Role");

        txtGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Transgender", "Non-Conforming", "I'd prefer not to say" }));
        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });

        jLabel9.setText("Gender");

        jLabel4.setText("Organisation");

        jLabel3.setText("Mobile");

        jLabel2.setText("Name");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel7.setText("Age");

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        jLabel6.setText("Password");

        btnUpdateDriverDetails.setText("Update Driver Details");
        btnUpdateDriverDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDriverDetailsActionPerformed(evt);
            }
        });

        jLabel1.setText("Enterprise");

        jButton1.setText("View Driver Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUsername)
                                    .addComponent(txtPassword)
                                    .addComponent(txtRole)
                                    .addComponent(txtOrg)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtGenderValue, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtName)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(10, 10, 10)
                                .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUpdateDriverDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtGender)
                                .addComponent(jLabel9))
                            .addComponent(txtGenderValue, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(btnUpdateDriverDetails)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ListOfDriversTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListOfDriversTableMouseClicked
//        // TODO add your handling code here:
//        Connection conn = new DB().connection();
//        DefaultTableModel model = (DefaultTableModel)ListOfDriversTable.getModel();
//
//        // get the selected row index
//        int selectedRowIndex = ListOfDriversTable.getSelectedRow();
//        String driverToDelete= (model.getValueAt(selectedRowIndex, 2).toString());
//        System.out.println(driverToDelete);
//        try {
//            PreparedStatement pstm = conn.prepareStatement(
//                "DELETE FROM userdetails WHERE username='?';"
//            );
//            pstm.setString(
//                1,
//                String.valueOf(driverToDelete)
//
//            );      ResultSet Rs = pstm.executeQuery();
//            while (Rs.next()) {
//                model.addRow(
//                    new Object[] {
//                        Rs.getString("name"),
//                        Rs.getString("username"),
//                        Rs.getString("organization"),
//                        Rs.getString("enterprise"),
//
//                    }
//                );
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        ListOfDriversTable.setModel(model);

    }//GEN-LAST:event_ListOfDriversTableMouseClicked

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
        String gender=txtGender.getSelectedItem().toString();
        txtGenderValue.setText(gender);
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void btnUpdateDriverDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDriverDetailsActionPerformed
        // TODO add your handling code here:
           int selectedRowIndex = ListOfDriversTable.getSelectedRow();

        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a person to view and update their details");
            return;
        }

        
//        systext.setText(p.getPersonp().getFirstName());
//        syslastname.setText(p.getPersonp().getLastName());
//        sysgender.setText(p.getPersonp().getGender());
//        sysage.setText(String.valueOf(p.getPersonp().getAge()));
//        sysemail.setText(p.getPersonp().getEmailAddress());
//        sysmobile.setText(String.valueOf(p.getPersonp().getMobileNumber()));
//        syspass.setText(p.getPersonp().getPassword());
//        sysblood.setText(p.getBloodgroup());
//        sysusername.setText(p.getUsername());
//        sysweight.setText(String.valueOf(p.getWeight()));
//        sysheight.setText(String.valueOf(p.getHeight()));
//           
        
        DefaultTableModel model = (DefaultTableModel) ListOfDriversTable.getModel();
        String usernameSelectedToUpdate=txtUsername.getText();
        Connection conn = new DB().connection();
         String name=txtName.getText();
        String mobile=txtMobile.getText();
        String age=txtAge.getText();
        String username=txtUsername.getText();
        String password=txtPassword.getText();
        String gender=txtGenderValue.getText();
        String role=txtRole.getText();
        String org=txtOrg.getText();
        String enterprise=txtEnterprise.getText();
        
        try {
      PreparedStatement pstm = conn.prepareStatement(
        "UPDATE userdetails SET name = ?,mobile =? , age=?,username=?,password=?,gender=?,role=?,organization=?,enterprise=? "
                + "WHERE username=?;"
      );
       pstm.setString(1, name);
        pstm.setString(2, mobile);
        pstm.setString(3, age);
        pstm.setString(4, username);
        pstm.setString(5, password);
        pstm.setString(6, gender);
        pstm.setString(7, role);
        pstm.setString(8, org);
        pstm.setString(9, enterprise);

        pstm.setString(10, usernameSelectedToUpdate);
            System.out.println(pstm);

      int rs = pstm.executeUpdate();
      loadTable();
    
      
    
      
    } catch (Exception e) {
      System.out.println(e);
    }
     
    }//GEN-LAST:event_btnUpdateDriverDetailsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          int selectedRowIndex = ListOfDriversTable.getSelectedRow();

        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a person to view and update their details");
            return;
        }
         DefaultTableModel model = (DefaultTableModel) ListOfDriversTable.getModel();
        String usernameSelectedToView=(String)model.getValueAt(selectedRowIndex, 3);
        Connection conn = new DB().connection();

        try {
            PreparedStatement pstm = conn.prepareStatement(
        "Select name, mobile,age,username,password, gender , role,organization,enterprise from userdetails where username=?;"
      );
       pstm.setString(
          1,
          String.valueOf(usernameSelectedToView)
        );
            System.out.println(pstm);

      ResultSet rs = pstm.executeQuery();
    
      while (rs.next()) {
          txtName.setText(rs.getString("name"));
          txtAge.setText(rs.getString("age"));
          txtGenderValue.setText(rs.getString("gender"));
          txtMobile.setText(rs.getString("mobile"));
          txtOrg.setText(rs.getString("organization"));
          txtRole.setText(rs.getString("role"));
          txtEnterprise.setText(rs.getString("enterprise"));
          txtUsername.setText(rs.getString("username"));
          txtPassword.setText(rs.getString("password"));
      }
        
     
          


      } catch (Exception e) {
      System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

public void loadTable(){
     Connection conn = new DB().connection();

    DefaultTableModel model = new DefaultTableModel();
    
    model.addColumn("Driver Name");
     model.addColumn("Mobile ");
    
    model.addColumn("Age");
    model.addColumn("Username");
    model.addColumn("Password");
    model.addColumn("Gender");
    model.addColumn("Role");
    model.addColumn("Organization");
    model.addColumn("Enterprise");

    try {
      PreparedStatement pstm = conn.prepareStatement(
        "Select name, mobile,age,username,password, gender , role,organization,enterprise from userdetails where role='driver';"
      );
        ResultSet Rs = pstm.executeQuery();
      while (Rs.next()) {
        model.addRow(
          new Object[] {
            Rs.getString("name"),
               Rs.getString("mobile"),
                Rs.getString("age"), 
                Rs.getString("username"),
                 Rs.getString("password"),
                 Rs.getString("gender"),
            Rs.getString("role"),
            Rs.getString("organization"),
            Rs.getString("enterprise"),

          }
        );
      }
    } catch (Exception e) {
      System.out.println(e);
    }
    ListOfDriversTable.setModel(model);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ListOfDriversTable;
    private javax.swing.JButton btnUpdateDriverDetails;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEnterprise;
    private javax.swing.JComboBox<String> txtGender;
    private javax.swing.JLabel txtGenderValue;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOrg;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtRole;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}