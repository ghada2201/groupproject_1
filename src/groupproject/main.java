/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupproject;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ghadamhassan
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //DB.getConnection();
       
       
       
       table.creatingtable();  
       
        ReadingData.insert (16712, "e", 2005, "17/10/2005", 7, 11, "North East", 171, "Redcar and Cleveland", "A174", "Major", "A1053", "A1042", 457782, 520013, "54.5720445", "-1.10772887", "2.9", "1.8", 3, 18, 1042, 21, 179, 20, 4, 13, 1, 15, 7, 60, 1320);
        ReadingData.insert(18593, "E", 2005, "12/10/2005", 8, 11, "North East", 171, "Redcar and Cleveland", "A171", "Major", "A1043", "A173", 455000, 515662, "54.53325664", "-1.15156771", "4.1", "2.55", 3, 5, 666, 13, 141, 21, 2, 3, 2, 2, 4, 34, 859);
        
       
        ResultSet id = ReadingData.get(16712); 
       
        ArrayList<String> fileContenta = CSVReader.readFile("file.CSV"); 
        
        ReadingData.batchInsert(fileContenta);
        
        Dashboard3 BD = new Dashboard3();
        BD.setVisible(true);
        
    }
        
}
