/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupproject;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ghadamhassan
 */
public class table {
    
    public static void creatingtable(){
            
    Connection connection = DB.getConnection();
    
    String sql = "CREATE TABLE  if not exists rawcount_local_authority"
                + "("
                    + "id   INTEGER,"
                    + "direction_of_travel  VARCHAR (15),"
                    + "year INTEGER,"
                    + "count_date   DATE,"
                    + "hour INTEGER,"
                    + "region_id    INTEGER,"
                    + "region_name  VARCHAR (15),"
                    + "local_authority_id   INTEGER,"
                    + "local_authority_name VARCHAR (15),"
                    + "road_name    VARCHAR (15),"
                    + "road_type    VARCHAR (15),"
                    + "start_junction_road_name VARCHAR (15),"
                    + "end_junction_road_name   VARCHAR (15),"
                    + "easting INTEGER,"
                    + "northing INTEGER,"
                    + "latitude   INTEGER,"
                    + "longitude   INTEGER,"
                    + "link_length_km   INTEGER,"
                    + "link_length_miles   INTEGER,"
                    + "pedal_cycles   INTEGER,"
                    + "two_wheeled_motor_vehicles   INTEGER,"
                    + "cars_and_taxis   INTEGER,"
                    + "buses_and_coaches   INTEGER,"
                    + "lgvs   INTEGER,"
                    + "hgvs_2_rigid_axle   INTEGER,"
                    + "hgvs_3_rigid_axle   INTEGER,"
                    + "hgvs_4_or_more_rigid_axle   INTEGER,"
                    + "hgvs_3_or_4_articulated_axle   INTEGER,"
                    + "hgvs_5_articulated_axle   INTEGER,"
                    + "hgvs_6_articulated_axle   INTEGER,"
                    + "all_hgvs   INTEGER,"
                    + "all_motor_vehicles   INTEGER"
                + ")" ;
    
        try 
        {
            Statement  sqlStatement =  connection.createStatement();
            sqlStatement.executeUpdate(sql);
            System.out.println("Table is created");
         } 
        catch (SQLException ex) 
        {
            System.out.println("Error creating the Table" + ex.getMessage());
            
        }
      
    }
    
    public static void CreateUser() {
     //for the admidpanal
     Connection connection = DB.getConnection();
        
        String sql = "CREATE TABLE  if not exists UserInfo "
                + "("
                    + "id INTEGER PRIMARY KEY,"
                    + "First Name VARCHAR (15),"
                    + "Last Name  VARCHAR (15),"
                    + "Email      VARCHAR (50),"
                    + "Date Joined  Date"
                + ")" ;
        
        try 
        {
            Statement  sqlStatement =  connection.createStatement();
            sqlStatement.executeUpdate(sql);
             System.out.println(" User Table created");
         } 
        catch (SQLException ex) 
        {
            System.out.println("Error creating UserTable" + ex.getMessage());
            
        }
    }
}
