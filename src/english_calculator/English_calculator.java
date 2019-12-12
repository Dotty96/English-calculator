/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package english_calculator;
import java.util.Scanner;
import java.lang.Math; 
import java.util.Arrays;

/**
 *
 * 
 */
public class English_calculator {
    
 static String Convert(int num){
           
       if (num == 1){
          return "One";
      }
        if (num == 2){
          return "Two";
      }
        if (num == 3){
          return "Three";
      }
         if (num == 4){
          return "Four";
      }
          if (num == 5){
          return "Five";
      }
           if (num == 6){
          return "Six";
      }
           if (num == 7){
          return "Seven";
      }
          if (num == 8){
          return "Eight";
      }
          if (num == 9){
          return "Nine";
      }
           if (num == 0){
          return "Zero";
      }
      
           
           else 
               return "Please pick numbers 0-9";
       

}
     static String Operation(String sign){
         if (sign.equals("+")){
         return "pluse";
         }
         if (sign.equals("-")){
         return "minus";
         }
         if (sign.equals("*")){
         return "Times";
         }
         if (sign.equals("/")){
         return "Divied by";
         }
         if (sign.equals("^")){
         return " to the power ";
         }
         else
             return "Error not operator";
         
       }
     
     static double Result(int n, String sign, int n2){
         double result = 0;
          if (sign.equals("+")){
            return  result = (int) n + n2;
         }
         if (sign.equals("-")){
            return  result = (int) n - n2;
         }
         if (sign.equals("*")){
             return result = (int) n * n2;
         }
         if (sign.equals("/")){
             if (n2 == 0){
             System.out.println("Cannot divide by 0");
             System.exit(0);
             }
            return  result = (int) n/n2;
         }
         else if (sign.equals("^")){
            return  result =  Math.pow(n,n2);
         }
         return result;
         
     
     
     
     }
    public static void main(String[] args) {
       
       
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a digit 0-9");
        int num = in.nextInt();
        
         if (num < 10 && num >= 0){
             System.out.println("Enter an Operation such as +,-,/,*,^");
             String op = in.next();
        
             if (Arrays.asList("+","-","/","*","^").contains(op)) {
          
            System.out.println("Enter a second digit 0-9");
            int num2= in.nextInt();
            if (num2 < 10 && num2 >= 0){
              
              System.out.println(Convert(num) +" "+ Operation(op)+" "+ Convert(num2)+" is "
                + Result(num, op, num2));
            }
        
            else
            System.out.println("Second number is not within range 0-9");
        
            }
            else
             System.out.println("That is not an Operation ");
        
            }
         else
            System.out.println("Number is not within range 0-9");
        
        
       
    }
    
}

