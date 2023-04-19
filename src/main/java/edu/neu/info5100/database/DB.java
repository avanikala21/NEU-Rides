package edu.neu.info5100.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB {
    public static DB db = new DB();

    public DB DB() {
        if (db == null) {
          synchronized (DB.class) {
            db = new DB();
          }
        }
        return db;
      }

      public Connection connection(){
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://dbsid-do-user-4668369-0.b.db.ondigitalocean.com:25060/dev", "doadmin", "AVNS_fgxjPQzbXDbb7q8ESCn");
//            System.out.println("Database Connection Successfull");
//            //
//            PreparedStatement pstm = con.prepareStatement("SELECT status, id FROM dev.test;");
//            ResultSet Rs = pstm.executeQuery();
//            while (Rs.next()) {
//                System.out.println("Checking Connection - output will be ok if database connection is working");
//
//               System.out.println(Rs.getString("status"));
//            }
            return con;
        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
        }
        return null;
      }
}
