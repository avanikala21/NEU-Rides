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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author megha
 */
public class CustomerSupportViewRequestsByOrganization extends javax.swing.JPanel {

    /**
     * Creates new form CustomerSupportViewRequestsByOrganization
     */
    public CustomerSupportViewRequestsByOrganization() {
        initComponents();
        loadOrganizations();
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

        OrganizationComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SupportRequestsTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMainIssue = new javax.swing.JTextArea();
        txtSubject = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtResponse = new javax.swing.JTextArea();

        OrganizationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrganizationComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Organization");

        SupportRequestsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        SupportRequestsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SupportRequestsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(SupportRequestsTable);

        jLabel5.setText("Username");

        jLabel2.setText("Main Issue");

        txtMainIssue.setColumns(20);
        txtMainIssue.setRows(5);
        jScrollPane2.setViewportView(txtMainIssue);

        jButton1.setText("Update Response");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Email");

        jButton3.setText("View Request");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Subject");

        jLabel6.setText("ID");

        jLabel7.setText("Response");

        txtResponse.setColumns(20);
        txtResponse.setRows(5);
        jScrollPane3.setViewportView(txtResponse);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addComponent(OrganizationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane2)
                            .addComponent(txtSubject)
                            .addComponent(Email)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(5, 5, 5)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton3)
                            .addComponent(jButton1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(OrganizationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(39, 39, 39)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel7))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SupportRequestsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupportRequestsTableMouseClicked
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
    }//GEN-LAST:event_SupportRequestsTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = SupportRequestsTable.getSelectedRow();

        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a person to view and update their details");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) SupportRequestsTable.getModel();
        String usernameSelectedToUpdate=txtUsername.getText();
        Connection conn = new DB().connection();

        String response=txtResponse.getText();

        try {
            PreparedStatement pstm = conn.prepareStatement(
                "UPDATE customerrequests SET response = ?"
                + "WHERE email=?;"
            );
            pstm.setString(1, response);
            pstm.setString(2,Email.getText());

            System.out.println(pstm);

            int rs = pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Response has been updated");
            loadTable();

        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = SupportRequestsTable.getSelectedRow();

        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a request to view");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) SupportRequestsTable.getModel();
        String usernameSelectedToViewid=(String)model.getValueAt(selectedRowIndex, 0);
        Connection conn = new DB().connection();

        try {
            PreparedStatement pstm = conn.prepareStatement(
                "Select id,name, email,subject,issue,response from customerrequests where id=?;"
            );
            pstm.setString(
                1,
                String.valueOf(usernameSelectedToViewid)
            );
            System.out.println(pstm);

            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                id.setText(rs.getString("id"));
                txtUsername.setText(rs.getString("name"));
                Email.setText(rs.getString("email"));
                txtSubject.setText(rs.getString("subject"));
                txtMainIssue.setText(rs.getString("issue"));
                txtResponse.setText(rs.getString("response"));

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void OrganizationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrganizationComboBoxActionPerformed
        // TODO add your handling code here:
        loadTable();
    }//GEN-LAST:event_OrganizationComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JComboBox<String> OrganizationComboBox;
    private javax.swing.JTable SupportRequestsTable;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtMainIssue;
    private javax.swing.JTextArea txtResponse;
    private javax.swing.JTextField txtSubject;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
public void loadTable(){
     Connection conn = new DB().connection();
     String selectedOrg = (String) OrganizationComboBox.getSelectedItem();
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Request ID");
    model.addColumn("Email");
     model.addColumn("Username ");
    
    model.addColumn("Subject");
    model.addColumn("Main Issue");
    model.addColumn("Response");
     model.addColumn("Organization");


    try {
      PreparedStatement pstm = conn.prepareStatement(
        "Select cr.id, cr.email,cr.name,cr.subject,cr.issue,cr.response,ud.organization from customerrequests cr LEFT JOIN userdetails ud on cr.name=ud.username where ud.organization=?;"
      );
      pstm.setString(
        1,String.valueOf(selectedOrg)
        
      );     
        ResultSet Rs = pstm.executeQuery();
      while (Rs.next()) {
        model.addRow(
          new Object[] {
               Rs.getString("id"),
            Rs.getString("email"),
               Rs.getString("name"),
                Rs.getString("subject"), 
                Rs.getString("issue"),
                Rs.getString("response"),

                Rs.getString("organization"),
          }
        );
      }
    } catch (Exception e) {
      System.out.println(e);
    }
    SupportRequestsTable.setModel(model);
}
    private void loadOrganizations() {

        OrganizationComboBox.removeAllItems();

        //String usernameSupport=String.valueOf(INFO5100Project.getSession().GetUsername());
        Connection conn = new DB().connection();
    try {

      PreparedStatement pstm = conn.prepareStatement(
        "SELECT name FROM organization;"
      );
      
            System.out.println(pstm);

      ResultSet rs = pstm.executeQuery();
    
      while (rs.next()) {
          OrganizationComboBox.addItem((rs.getString("name")));
          

      }
    } catch (Exception e) {
      System.out.println("null");
    }
 
    }
}