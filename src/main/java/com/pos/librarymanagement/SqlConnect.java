/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pos.librarymanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author saajan
 */
public class SqlConnect {
    
     public static Connection connect() throws SQLException {
    try {
        Connection res = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?autoReconnect=true&useSSL=false", "root", "root");
        return res;
    } catch (SQLException e) {
        System.out.println("Connection Failed!" + e.getMessage());
        throw e;
    }
       
    }
}
