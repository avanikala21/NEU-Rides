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
public class CustomerLeftPane extends javax.swing.JPanel {

    /**
     * Creates new form CustomerLeftPane
     */
    public CustomerLeftPane() {
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

        BookTripButton = new javax.swing.JButton();
        CurrentTripButton = new javax.swing.JButton();
        RideHistoryButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        BookTripButton.setText("Book Trip");
        BookTripButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookTripButtonActionPerformed(evt);
            }
        });

        CurrentTripButton.setText("Current Trip");
        CurrentTripButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurrentTripButtonActionPerformed(evt);
            }
        });

        RideHistoryButton.setText("Ride History");
        RideHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RideHistoryButtonActionPerformed(evt);
            }
        });

        jButton3.setText("Customer Support ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jButton1.setText("Pending Rides");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnLogout, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RideHistoryButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CurrentTripButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BookTripButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(BookTripButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CurrentTripButton)
                .addGap(18, 18, 18)
                .addComponent(RideHistoryButton)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CurrentTripButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurrentTripButtonActionPerformed
        // TODO add your handling code here:
                INFO5100Project.getUI().ChangeRightPanel(new CustomerCurrentBookingPage(), "CustomerCurrentBookingPage");

    }//GEN-LAST:event_CurrentTripButtonActionPerformed

    private void BookTripButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookTripButtonActionPerformed
        // TODO add your handling code here:
        INFO5100Project.getUI().ChangeRightPanel(new CustomerBookTripPage(), "CustomerBookTripPage");
    }//GEN-LAST:event_BookTripButtonActionPerformed

    private void RideHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RideHistoryButtonActionPerformed
        // TODO add your handling code here:
                INFO5100Project.getUI().ChangeRightPanel(new CustomerRideHistoryPage(), "CustomerBookTripPage");

    }//GEN-LAST:event_RideHistoryButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        INFO5100Project.getUI().ChangeLeftPanel(new CustomerSupportLeftPane(), "CustomerSupportLeftPane()");
        INFO5100Project.getUI().ChangeRightPanel(new CustomerSupportPage(), "CustomerSupportPage");
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        // TODO add your handling code here:
        INFO5100Project.getUI().ChangeLeftPanel(new LoginSignupPane(), "LoginSignupPane");
        INFO5100Project.getUI().ChangeRightPanel(new LoginPage(), "LoginPage");
        INFO5100Project.getSession().DeleteSession();
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        INFO5100Project.getUI().ChangeRightPanel(new CustomerPendingRides(), "CustomerPendingRides()");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookTripButton;
    private javax.swing.JButton CurrentTripButton;
    private javax.swing.JButton RideHistoryButton;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
