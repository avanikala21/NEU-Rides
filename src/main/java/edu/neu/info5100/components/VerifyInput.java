/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.info5100.components;

import javax.swing.JComponent;
import javax.swing.JTextField;

/**
 *
 * @author sidb
 */
public class VerifyInput {
    
    
    public static boolean VerifyEmptyInput(JTextField j){
           if(j.getText()==""){
               return true;
           }
        return false;
    }
    
}
