/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.neu.info5100.driver;

import com.formdev.flatlaf.FlatDarculaLaf;
import edu.neu.info5100.database.DB;
import edu.neu.info5100.session.Session;
import edu.neu.info5100.ui.UI;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.UIManager;
/**
 *
 * @author sidb
 */
public class INFO5100Project {

  public static UI mainJF = new UI();
  public static Session session = new Session();

  public static UI getUI() {
    if (mainJF == null) {
      synchronized (INFO5100Project.class) {
            try {
   UIManager.setLookAndFeel( new FlatDarculaLaf() );
 } catch( Exception ex ) {
     System.err.println( "Failed to initialize LaF" );
 }
        mainJF = new UI();

      }
    }
    return mainJF;
  }

   public static Session getSession() {
    if (session == null) {
        session = new Session();
    }
    return session;
  }
  public static void main(String[] args) {
    DB db = new DB();
    UI jf = new INFO5100Project().getUI();
    Connection conn = db.connection();
    PreparedStatement pstm;
    try {
      pstm = conn.prepareStatement("SELECT status, id FROM dev.test;");
      ResultSet Rs = pstm.executeQuery();
      while (Rs.next()) {
        System.out.println(
          "Checking Connection in main - output will be ok if database connection is working"
        );
        System.out.println(Rs.getString("status"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  
    System.out.println("Hello World!");
     try {
   UIManager.setLookAndFeel( new FlatDarculaLaf() );
 } catch( Exception ex ) {
     System.err.println( "Failed to initialize LaF" );
 }

    java.awt.EventQueue.invokeLater(
      new Runnable() {
        public void run() {
          jf.setVisible(true);
        }
      }
    );
  }
}
