/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edu.neu.info5100.components;

import edu.neu.info5100.driver.INFO5100Project;

/**
 *
 * @author sidb
 */
public class AdminDashboard extends javax.swing.JPanel {

    /**
     * Creates new form AdminDashboard
     */
    public AdminDashboard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOrg = new javax.swing.JButton();
        btnEnterprises = new javax.swing.JButton();
        btnUsers = new javax.swing.JButton();
        btnCars = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnDrivers = new javax.swing.JButton();

        btnOrg.setText("Organization");

        btnEnterprises.setText("Enterprise");

        btnUsers.setText("Users");

        btnCars.setText("Cars");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage following:");

        btnDrivers.setText("Drivers");
        btnDrivers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDriversActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCars)
                    .addComponent(btnDrivers)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnEnterprises)
                        .addComponent(btnOrg)
                        .addComponent(btnUsers)))
                .addContainerGap(244, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCars, btnDrivers, btnEnterprises, btnOrg, btnUsers});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOrg)
                .addGap(18, 18, 18)
                .addComponent(btnEnterprises)
                .addGap(18, 18, 18)
                .addComponent(btnUsers)
                .addGap(18, 18, 18)
                .addComponent(btnDrivers)
                .addGap(18, 18, 18)
                .addComponent(btnCars)
                .addGap(66, 66, 66))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDriversActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDriversActionPerformed
        // TODO add your handling code here:
        INFO5100Project.getUI().ChangeLeftPanel(new ManageDriversAdmin(), "ManageDriversAdmin");
        INFO5100Project.getUI().ChangeRightPanel(new LandingPage(), "LandingPage");
        
    }//GEN-LAST:event_btnDriversActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCars;
    private javax.swing.JButton btnDrivers;
    private javax.swing.JButton btnEnterprises;
    private javax.swing.JButton btnOrg;
    private javax.swing.JButton btnUsers;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
