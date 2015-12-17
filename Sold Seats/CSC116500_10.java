// This program calculates sold seats for each class and amount of income.
// Written by Sergey Skumatov,
//  CSC116500, exercise 9.

import java.util.Scanner;

public class CSC116500_10
{

// constans.
   public final static double UNDER_BMI = 18.5;
   public final static double OVER_BMI = 25;

   public static void main(String[] args)
      
   {
   // Create a Scanner object for keyboard input. 
      Scanner keyboard = new Scanner(System.in);      
   
   // Declare local variables. 
      double inputWeight;
      double inputHeight;
      double totalResult;
   
   // Prompt the user to enter the weight.
      System.out.print("Please, enter the Weight "); 
      inputWeight = keyboard.nextDouble(); 
      
   // Prompt the user to enter the high.
      System.out.print("Please, enter the Height in inches "); 
      inputHeight = keyboard.nextDouble(); 
      
   //Calculate total result
      totalResult = inputWeight * 703 / (inputHeight * inputHeight);
      
   //Calculate for the total result.
      
      if (totalResult < UNDER_BMI)
      {
      System.out.println("You are considered to be underwight.");
      }
         else if (totalResult > OVER_BMI)
         {
         System.out.println("You are considered to be overweight.");
         }           
            else 
            {
            System.out.println("You are considered to have a good Weight.");
            }
   }
}