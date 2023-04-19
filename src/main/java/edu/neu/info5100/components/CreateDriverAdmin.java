/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edu.neu.info5100.components;

import edu.neu.info5100.database.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author megha
 */
public class CreateDriverAdmin extends javax.swing.JPanel {

    /**
     * Creates new form CreateDriverAdmin
     */
    public CreateDriverAdmin() {
        initComponents();
        txtRole.setText("driver");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtGenderValue = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtRole = new javax.swing.JTextField();
        txtOrg = new javax.swing.JTextField();
        txtGender = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSignup = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtEnterprise = new javax.swing.JTextField();

        jLabel9.setText("Gender");

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

        jLabel5.setText("Role");

        jLabel8.setText("Username");

        txtGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Transgender", "Non-Conforming", "I'd prefer not to say" }));
        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });

        jLabel4.setText("Organization");

        jLabel3.setText("Mobile");

        btnSignup.setText("Create Driver");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        jLabel10.setText("Enterprise");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(10, 10, 10)
                            .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnSignup)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel8)
                                .addComponent(jLabel6))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtRole, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtOrg)
                                .addComponent(txtPassword))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7))
                                .addGap(10, 10, 10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtGenderValue, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
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
                    .addComponent(txtGenderValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(29, 29, 29)
                .addComponent(btnSignup)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
        String gender=txtGender.getSelectedItem().toString();
        txtGenderValue.setText(gender);
    }//GEN-LAST:event_txtGenderActionPerformed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        // TODO add your handling code here:
        
        String name=txtName.getText();
        String mobile=txtMobile.getText();
        String age=txtAge.getText();
        String username=txtUsername.getText();
        String password=txtPassword.getText();
        String gender=txtGenderValue.getText();
        String role=txtRole.getText();
        String enterprise=txtEnterprise.getText();
        String org=txtOrg.getText();

        //Validations
        //         ArrayList<String> errList=new ArrayList<>( );
        //        int errCount=0;
        //        String regexName="^[A-Z].*";
        //        String regexAge="2[0-9]|[3-5][0-9][60]";
        //        String regexPhone="^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$";
        //        String regexUsername="^[A-Za-z]+[0-9]+$";
        //
        //        if(!"".equals(mobile))
        //             if(inputValidation(regexPhone,Integer.parseInt(mobile)) ){
            //
            //            JOptionPane.showMessageDialog(null, "Valid name");
            //        } else {
            //            errList.add("Please enter a valid first name");
            //            errCount++;
            //        }
        //
        //        if(inputValidation(regexName,lastName) && !"".equals(lastName)){
            //            person.setLastName(lastName);
            //        } else {
            //            errList.add("Please enter a valid last name");
            //            errCount++;
            //        }
        //
        //        if(inputValidation(regexAge,String.valueOf(age)) && age>=0 && !"".equals(String.valueOf(age))){
            //            person.setAge(age);
            //        } else {
            //            errList.add("Please enter valid age ");
            //            errCount++;
            //        }
        //
        //        if(inputValidation(regexPhone,String.valueOf(mobileNumber)) && !"".equals(String.valueOf(mobileNumber))){
            //            person.setMobileNumber(mobileNumber);
            //        } else {
            //            errList.add("Please enter valid cell number ");
            //            errCount++;
            //        }
        //
        //        if(inputValidation(regexEmail,email) && !"".equals(email)){
            //            person.setEmailAddress(email);
            //        } else {
            //            errList.add("Please enter a valid email ");
            //            errCount++;
            //        }
        //        //        if(lblImage.getIcon()==null){
            //            //            emp.setProfileImage(profileImage);
            //            //         } else {
            //            //            errList.add("Please upload an image ");
            //            //            errCount++;
            //            //        }
        //        if(inputValidation(regexUsername,username) && !"".equals(username)){
            //            person.setUsername(username);
            //        } else {
            //            errList.add("Please enter a valid username : the length of the characters must be atleast 4 and must contain lower case alphabets and numbers only");
            //            errCount++;
            //        }
        //        person.setPassword(password);
        //        String errMessageFinal = "";
        //        if(errCount>0){
            //            for( int i=0;i<errList.size();i++){
                //                errMessageFinal=errMessageFinal+errList.get(i)+"\n";
                //            }
            //            JOptionPane.showMessageDialog(this, errMessageFinal);
            //        }
        //        else{
            //            JOptionPane.showMessageDialog(this, "New Person Added");
            //            txtAge.setText("");
            //            txtEmail.setText("");
            //        txtFirstName.setText("");
            //        txtGenderValue.setText("");
            //        txtLastName.setText("");
            //        txtMobileNumber.setText("");
            //        txtPassword.setText("");
            //        txtUsername.setText("");
            //        txtRoleValue.setText("");

            Connection conn = new DB().connection();
            try {
                PreparedStatement pstm = conn.prepareStatement(
                    "INSERT INTO userdetails (name,mobile,age,username,password,gender,role,organization,enterprise) VALUES(?, ?, ?,?,?,?,?,?,?);"
                );
                pstm.setString(1,name);
                pstm.setString(2, mobile);
                pstm.setString(3, age);
                pstm.setString(4, username);
                pstm.setString(5,password);
                pstm.setString(6, gender);
                pstm.setString(7, role);
                pstm.setString(8, org);
                pstm.setString(9, enterprise);
                System.out.println(pstm);
                pstm.executeUpdate();

                //                }
            JOptionPane.showMessageDialog(
                null,
                "Driver created!"
            );
            //Inserting into the users table for login
            pstm = conn.prepareStatement(
                "INSERT INTO users (username,password,role) VALUES(?, ?, ?);"
            );
            pstm.setString(1,username);
            pstm.setString(2, password);
            pstm.setString(3, role);

            System.out.println(pstm);
            pstm.executeUpdate();
        } catch (Exception e3) {
            System.out.println("Not able to create driver");
            System.out.println(e3);
        }

    }//GEN-LAST:event_btnSignupActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignup;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
