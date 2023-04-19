/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edu.neu.info5100.components;

import static edu.neu.info5100.components.EnterpriseAddCarsPage.convertUtilDateToSqlDate;
import edu.neu.info5100.database.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sidb
 */
public class EnterpriseViewCars extends javax.swing.JPanel {

    /**
     * Creates new form EnterpriseViewCars
     */
    public EnterpriseViewCars() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewCars = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        txtLicenseNumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCarName = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        SSDate = new com.github.lgooddatepicker.components.DatePicker();
        SEDate = new com.github.lgooddatepicker.components.DatePicker();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cars available within the enterprises");

        tblViewCars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Car", "Enterprise", "Service Start", "Service End", "License No."
            }
        ));
        tblViewCars.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblViewCarsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblViewCars);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel7.setText("Service Start Date");

        jLabel8.setText("Service End Date");

        jLabel9.setText("License Number");

        jLabel3.setText("Car name:");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(jLabel3)
                                        .addGap(39, 39, 39)
                                        .addComponent(txtCarName, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(74, 74, 74))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel8))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel9)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addComponent(SSDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(SEDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDelete)
                                    .addComponent(btnUpdate))))
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDelete, btnUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCarName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(SSDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(SEDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        Connection conn = new DB().connection();

         DefaultTableModel model = (DefaultTableModel)tblViewCars.getModel();


        // get the selected row index
       int selectedRowIndex = tblViewCars.getSelectedRow();
       String carToDelete= (model.getValueAt(selectedRowIndex, 0).toString());
       System.out.println(carToDelete);
        try {
      PreparedStatement pstm = conn.prepareStatement(
        "DELETE FROM car WHERE name = ?;"
      );
      
    
 pstm.setString(
          1,
          String.valueOf(carToDelete)
        
      );      
        int rs = pstm.executeUpdate();
    
    }catch (Exception e) {
      System.out.println(e.getMessage());
    }
    loadTable();
  
              
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblViewCars.getSelectedRow();
        
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a car to view and update their details");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblViewCars.getModel();
        String nameSelectedToUpdate=txtCarName.getText();
        Connection conn = new DB().connection();
        String name=txtCarName.getText();
        //String enterprise_name=String.valueOf(enterpriseDropdown.getSelectedItem());
        String service_start_date = SSDate.getDateStringOrEmptyString();
        String service_end_date = SEDate.getDateStringOrEmptyString();
        String license=txtLicenseNumber.getText();
        
        try {
             PreparedStatement pstm = conn.prepareStatement(
            "UPDATE car SET name = ?, service_start_date=?, service_end_date=?, license=? "
                + "WHERE id=?;"
             );
       pstm.setString(1, name);
       //pstm.setString(2, enterprise_name);
        pstm.setString(2, service_start_date);
        pstm.setString(3, service_end_date);
        pstm.setString(4, license);
        pstm.setInt(5, GetCarID(nameSelectedToUpdate));
            System.out.println(pstm);

      int rs = pstm.executeUpdate();
      loadTable();
      
    } catch (Exception e) {
      System.out.println(e);
    }
        
        
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblViewCarsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblViewCarsMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel) tblViewCars.getModel();

        // set data to textfield when raw is selected

        String tblCarName = tblModel.getValueAt(tblViewCars.getSelectedRow(),0).toString();
//        Date tblserviceStart = (Date) tblModel.getValueAt(tblViewCars.getSelectedRow(),2);
//        Date tblserviceEnd = (Date) tblModel.getValueAt(tblViewCars.getSelectedRow(),3);
        String tblLicense = tblModel.getValueAt(tblViewCars.getSelectedRow(),4).toString();
        

        txtCarName.setText(tblCarName);
        //jDateServiceStart.setDate(tblserviceStart);
        //jDateServiceEnd.setDate(tblserviceEnd);
        txtLicenseNumber.setText(tblLicense);
        
        
    }//GEN-LAST:event_tblViewCarsMouseClicked
    
    public void loadTable(){
         Connection con = new DB().connection();
         DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Car");
        model.addColumn("Enterprise");
        model.addColumn("Service Start");
        model.addColumn("Service End");
        model.addColumn("License No.");
        try {
      
    PreparedStatement pstm = con.prepareStatement(
     "Select name, enterprise_name, service_start_date, service_end_date, license FROM car"
    );
      
        ResultSet Rs = pstm.executeQuery();
        while (Rs.next()) {
          model.addRow(
            new Object[] {
              Rs.getString("name"),
              Rs.getString("enterprise_name"),
              Rs.getString("service_start_date"),
              Rs.getString("service_end_date"),
              Rs.getString("license")         
          }
        );
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    tblViewCars.setModel(model);
    }
    
    
      private int GetCarID(String CarName) {
        int doc =0;
    Connection conn = new DB().connection();
    try {

      PreparedStatement pstm = conn.prepareStatement(
        "SELECT id FROM car Where name = ?"
      );
      
      pstm.setString(1, CarName);
      ResultSet rs = pstm.executeQuery();
      while (rs.next()) {
         doc = rs.getInt("id");
        //                DefaultComboBoxModel model = (DefaultComboBoxModel)comboBox1.getModel();
        return doc;
      }
    } catch (Exception e) {
      System.out.println(e);
    }
    return doc;
  }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker SEDate;
    private com.github.lgooddatepicker.components.DatePicker SSDate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblViewCars;
    private javax.swing.JTextField txtCarName;
    private javax.swing.JTextField txtLicenseNumber;
    // End of variables declaration//GEN-END:variables
}
