/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bmicalculator;

import java.text.DecimalFormat;


public class Calculations {
    
    public  double heightcnv(double heightft,double heightinch){
    
   double fnheight =  (heightft*0.3048)+(heightinch*0.0254);
    
   return(fnheight*fnheight);
   
    }
        
        
      public double bmical(double finalweight, double finalheight){
          
       DecimalFormat  td =  new DecimalFormat  ("#.00");
       
      
      double finalbmi = Double.parseDouble(td.format(finalweight/finalheight));
      
      
      return finalbmi;
      }
        
    public String idealweightcal(double heightfinal ){
    
    
    double weightinitial = Math.round ((18.5*heightfinal)*10.0)/10.0;
    double weightfinal = Math.round ((25*heightfinal)*10.0)/10.0;
    
    
    String idealweight = (weightinitial+ "  To  " +weightfinal);
    
    
    
    return(idealweight);
    }
    
}
