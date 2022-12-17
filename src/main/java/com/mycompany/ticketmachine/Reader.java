/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ticketmachine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ezbis
 */
public class Reader {
    
    
public static ArrayList<String> moviesReader(){
      
      ArrayList<String> movies = new ArrayList<>();
    // Create a File object for the CSV file
        
    File newFile = new File("CSVFiles/movies.csv");
    
    
    // Create a Scanner to read the file
    Scanner input = null;
      try {
          input = new Scanner(newFile);
      } catch (FileNotFoundException ex) {
          Logger.getLogger(Reader.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      input.nextLine();
    // Read each line from the file
    while (input.hasNextLine()) {
        // Get the line as a string
        String line = input.nextLine();

        // Split the line into fields using the comma as the separator
        String[] values = line.split(",");
        
        movies.add(values[0]);
    }
      return movies;
  }
  
  
public static ArrayList<String> moviesReader(String str){
      
      ArrayList<String> movies = new ArrayList<>();
    // Create a File object for the CSV file
        
    File newFile = new File("CSVFiles/movies.csv"); 
    
    // Create a Scanner to read the file
    Scanner input = null;
      try {
          input = new Scanner(newFile);
      } catch (FileNotFoundException ex) {
          Logger.getLogger(Reader.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      input.nextLine();
    // Read each line from the file
    while (input.hasNextLine()) {
        
        // Get the line as a string
        String line = input.nextLine();

        // Split the line into fields using the comma as the separator
        String[] values = line.split(",");
        
        if(values[1].equals(str)){
             
                movies.add(values[0]);
            
        }
    }
      return movies;
  }

  
public static ArrayList<String> genreReader(){
      
      ArrayList<String> genre = new ArrayList<>();
    // Create a File object for the CSV file
        
    File newFile = new File("CSVFiles/movies.csv");
    
    
    // Create a Scanner to read the file
    Scanner input = null;
      try {
          input = new Scanner(newFile);
      } catch (FileNotFoundException ex) {
          Logger.getLogger(Reader.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      input.nextLine();
    // Read each line from the file
    while (input.hasNextLine()) {
        // Get the line as a string
        String line = input.nextLine();

        // Split the line into fields using the comma as the separator
        String[] values = line.split(",");
        int k=0;
        for(String item : genre){
            if(item == null ? values[1] == null : item.equals(values[1])){
                k++;
            }
        } 
        if(k==0){
       genre.add(values[1]); 
        }
    }
      return genre;
  }
  
  
public static ArrayList<String> showTimesReader(String str){
      
      ArrayList<String> showTimes = new ArrayList<>();
    // Create a File object for the CSV file
        
    File newFile = new File("CSVFiles/movies.csv"); 
    
    // Create a Scanner to read the file
    Scanner input = null;
      try {
          input = new Scanner(newFile);
      } catch (FileNotFoundException ex) {
          Logger.getLogger(Reader.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      input.nextLine();
    // Read each line from the file
    while (input.hasNextLine()) {
        
        // Get the line as a string
        String line = input.nextLine();

        // Split the line into fields using the comma as the separator
        String[] values = line.split(",");
        
        if(values[0].equals(str)){
            
            for(int i=3; i<values.length; i++){
             
                showTimes.add(values[i]);
            }
        }
    }
      return showTimes;
  }


public static ArrayList<String> ticketTypeReader(){
      
      ArrayList<String> ticketType = new ArrayList<>();
    // Create a File object for the CSV file
        
    File newFile = new File("CSVFiles/prices.csv");
    
    
    // Create a Scanner to read the file
    Scanner input = null;
      try {
          input = new Scanner(newFile);
      } catch (FileNotFoundException ex) {
          Logger.getLogger(Reader.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      input.nextLine();
    // Read each line from the file
    while (input.hasNextLine()) {
        
        // Get the line as a string
        String line = input.nextLine();

        // Split the line into fields using the comma as the separator
        String[] values = line.split(",");

        ticketType.add(values[0]);
    }
      return ticketType;
  }


public static int priceReader(String str){
      
      int price = 0;
    // Create a File object for the CSV file
        
    File newFile = new File("CSVFiles/prices.csv"); 
    
    // Create a Scanner to read the file
    Scanner input = null;
      try {
          input = new Scanner(newFile);
      } catch (FileNotFoundException ex) {
          Logger.getLogger(Reader.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      input.nextLine();
    // Read each line from the file
    while (input.hasNextLine()) {
        // Get the line as a string
        String line = input.nextLine();

        // Split the line into fields using the comma as the separator
        String[] values = line.split(",");
        
        if(values[0].equals(str)){
            
            price = Integer.parseInt(values[1]);
        }
    }
      return price;
  }

  
public static String imageReader(String str){
      
      String fileName = "";
    // Create a File object for the CSV file
        
    File newFile = new File("CSVFiles/movies.csv");
    
    
    // Create a Scanner to read the file
    Scanner input = null;
      try {
          input = new Scanner(newFile);
      } catch (FileNotFoundException ex) {
          Logger.getLogger(Reader.class.getName()).log(Level.SEVERE, null, ex);
      }
      
        input.nextLine();
    // Read each line from the file
    while (input.hasNextLine()) {
        // Get the line as a string
        String line = input.nextLine();

        // Split the line into fields using the comma as the separator
        String[] values = line.split(",");
        
        if(values[0].equals(str)){
            
             fileName = values[2];
        }
    }
      return fileName;
  }
  
  

}