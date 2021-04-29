/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author ghadamhassan
 */
public class CSVReader {
    public static ArrayList<String> readFile(String fileName){
        
        ArrayList<String> fileContents = new ArrayList<>();
        
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String line = "";
            
            bufferedReader.readLine();
            
            while((line = bufferedReader.readLine()) != null){
                fileContents.add(line);
                System.out.println(line);
            }
            
        } catch(Exception e){
            System.out.println("Error reading the file: " + e.getLocalizedMessage());
        }
        
        return fileContents;
        
    }
    
}
