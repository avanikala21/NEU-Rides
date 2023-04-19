/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edu.neu.info5100.components;

import edu.neu.info5100.database.DB;
import edu.neu.info5100.driver.INFO5100Project;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author sidb
 */
public class AdminLeftPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminLeftPanel
     */
    public AdminLeftPanel() {
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

        jButton1 = new javax.swing.JButton();
        AdminOrgButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        RidesHistoryAdmin = new javax.swing.JButton();
        AdDrivers = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        jButton1.setText("Users");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        AdminOrgButton.setText("Organisations");
        AdminOrgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminOrgButtonActionPerformed(evt);
            }
        });

        jButton4.setText("Enterprises");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Reporting");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        RidesHistoryAdmin.setText("Rides");
        RidesHistoryAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RidesHistoryAdminActionPerformed(evt);
            }
        });

        AdDrivers.setText("Drivers");
        AdDrivers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdDriversActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AdminOrgButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RidesHistoryAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AdDrivers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(RidesHistoryAdmin)
                .addGap(18, 18, 18)
                .addComponent(AdDrivers)
                .addGap(18, 18, 18)
                .addComponent(AdminOrgButton)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(59, 59, 59)
                .addComponent(btnLogout)
                .addContainerGap(91, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                        INFO5100Project.getUI().ChangeRightPanel(new AdminUsersCrud(), "AdminUsersCruds");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void AdDriversActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdDriversActionPerformed
        // TODO add your handling code here:
                INFO5100Project.getUI().ChangeRightPanel(new LandingPage(), "LandingPage");
                INFO5100Project.getUI().ChangeLeftPanel(new ManageDriversAdmin(), "ManageDriversAdmin");

    }//GEN-LAST:event_AdDriversActionPerformed

    private void RidesHistoryAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RidesHistoryAdminActionPerformed
        // TODO add your handling code here: AdminRidesPanel()
                INFO5100Project.getUI().ChangeRightPanel(new AdminRidesPanel(), "AdminRidesPanel");
    }//GEN-LAST:event_RidesHistoryAdminActionPerformed

    private void AdminOrgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminOrgButtonActionPerformed
        // TODO add your handling code here:
         INFO5100Project.getUI().ChangeLeftPanel(new AdminOrgLeftPanel(), "AdminOrgLeftPanel");
        INFO5100Project.getUI().ChangeRightPanel(new LandingPage(), "LandingPage");
    }//GEN-LAST:event_AdminOrgButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         INFO5100Project.getUI().ChangeLeftPanel(new AdminEnterpriseLeftpane(), "AdminEnterpriseLeftpane");  
        INFO5100Project.getUI().ChangeRightPanel(new AdminEnterprisesPage(), "AdminEnterprisePage");          
                
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        INFO5100Project.getUI().ChangeLeftPanel(new LoginSignupPane(), "LoginSignupPane");
        INFO5100Project.getUI().ChangeRightPanel(new LoginPage() , "LoginPage");
        INFO5100Project.getSession().DeleteSession();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
                INFO5100Project.getUI().ChangeRightPanel(new Reporting() , "Reporting");

        
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdDrivers;
    private javax.swing.JButton AdminOrgButton;
    private javax.swing.JButton RidesHistoryAdmin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    // End of variables declaration//GEN-END:variables
}
