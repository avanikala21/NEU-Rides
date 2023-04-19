package edu.neu.info5100.info5100.components;

import java.sql.*;  

public class ConnectionClass 
{
    Connection con;
    Statement stm;
    public ConnectionClass()
    {  
        try
        {  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            con =DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
            stm =con.createStatement();
        }
        catch(Exception e)
        { 
            System.out.println(e);
        }  
    }
}
