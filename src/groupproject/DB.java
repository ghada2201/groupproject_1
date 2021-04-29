/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupproject;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ghadamhassan
 */
class DB {

    public static Connection getConnection(){
        
        String uriSQLite = "jdbc:sqlite:rawcount_local_authority.db";
        Driver driverSQLite = new org.sqlite.JDBC();
        System.out.println("SqLite Driver loaded up!!");
        
        try {
            
            DriverManager.registerDriver(driverSQLite);           
        
        } catch (SQLException ex){
            
            System.out.println("There is a problem with the SQlite driver" + ex.getMessage());
        }
        
        Connection connection = null;
        try {      
            connection = DriverManager.getConnection(uriSQLite);
            System.out.println("Connected to database");

        } catch (SQLException ex) {
            System.out.println("Error connection to database" + ex.getMessage());
        }
        return connection;
    }
    
}
