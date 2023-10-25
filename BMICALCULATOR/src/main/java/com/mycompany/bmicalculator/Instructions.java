
package com.mycompany.bmicalculator;


public class Instructions {
  
    public String  opinions(double bmi){
    
        String op = new String();
        
   if (bmi<=16)
   
       op = "Very Severely Underweight";
  
   else if (bmi>16&&bmi<=17)
   
       op =("Severely Underweight");
   
   else if (bmi>17&&bmi<=18.5)
   
       op= ("Underweight");
   
   
   else if (bmi>18.5&&bmi<=25)
   
       op = ("Normal");
   
   
   else if (bmi>25&&bmi<=30)
   
       op = ("Overweight");
    
    
   else if (bmi>30&&bmi<=35)
   
       op = ("Obese Calss I");
    
    
   else if (bmi>35&&bmi<=40)
   
      op=("Obese Calss II");
    
    
   else if (bmi>40)
   
       op = "Obese Calss III";
       
    
        
   
   return(op);
   
    }
    
    
    
    
    
}
