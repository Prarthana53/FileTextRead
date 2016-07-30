/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prarthana.filereadexample;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Pavilion G4
 */
public class Main {

   
    public static void main(String[] args) {
      String fileName="C:\\Users\\Pavilion G4\\Desktop\\output\\output.txt";
      
      try{
      byte[] buffer = new byte[1000];
          FileInputStream is=new FileInputStream(fileName);
          int total=0;
          int read=0;
          
          while((read=is.read(buffer))!=-1){
          
              System.out.println(new String(buffer));
              total+=read;
          
          }
          is.close();
          System.out.println("\n"+"Read "+total+ " bytes." );
      
      }catch (IOException ioe){
          System.out.println(ioe.getMessage());
      
      }
        
        
        
        
        
    }
    
}
