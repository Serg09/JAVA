/*
 * This program Calculating the Factorial of a Number.
 * Written by Sergey Skumatov,
 * CSC116500, exercise 12, version 2 with Module
 */

import java.util.Scanner;

public class CSC116500_12_ver2
{
   public static void main(String[] args)
       
   {
      
   // variables.
      int maxValue;
      int fact;
      int result;
   
   
   // Create a Scanner object for keyboard input. 
      Scanner in = new Scanner(System.in); 
   
   //Input the number     
      System.out.print("Enter the number to calculate the factorial: "); 
      maxValue = in.nextInt();
      
   // Function
    fact =  result (maxValue);
    
   // Display result
      System.out.println(" Factorial of " + maxValue + " is = " + fact); 
   }
   
      //Module
    private static int result(int maxValue) 
    {
        int counter;
        int result = 1;
        {
        //If-Else
               if (maxValue < 0)
               System.out.println ("Enter the non-negative number.");       
               else
               
        //Loop
        for (counter = 1; counter <= maxValue; counter ++)
        {
            result = counter * result;
    }
    
        //Function return
        return result;
    
      }
   }
}
