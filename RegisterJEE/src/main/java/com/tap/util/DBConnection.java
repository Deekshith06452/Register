package com.tap.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL      = "jdbc:mysql://localhost:3306/register";
    private static final String USER     = "root";
    private static final String PASSWORD = "1027";  
    private static Connection con;
    
    
    public static Connection getConnection() 
    {
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            
        }catch(ClassNotFoundException e) {
        	e.printStackTrace();        	
        }catch(SQLException e) {
        	e.printStackTrace();
        }
        return con;
    }
}