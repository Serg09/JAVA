// This program calculates sold seats for each class and amount of income.
// Written by Sergey Skumatov,
//  CSC116500, exercise 9.

import java.util.Scanner;

public class CSC116500_9
{

// constans.
   public final static double RATE_ONE = 1.10;
   public final static double RATE_TWO = 2.20;
   public final static double RATE_THREE = 3.70;
   public final static double RATE_FOUR = 3.80;

   public static void main(String[] args)
        
   //Variables
      
   {
   // Create a Scanner object for keyboard input. 
      Scanner keyboard = new Scanner(System.in); 
      
   
   // Declare local variables. 
      double weightInput;
      double priceOne;
      double priceTwo;
      double priceThree;
      double priceFour;
      int weightGroupOne = 2;
      int weightGroupTwo = 6;
      int weightGroupThree = 10;
   
   // Prompt the user to enter the weight.
      System.out.print("Please, enter the weight of a package "); 
      weightInput = keyboard.nextDouble(); 
      
   //Calculate the prices.
      
      if (weightInput <= weightGroupOne)
      {
         priceOne = weightInput * RATE_ONE;
         System.out.println("The shipping charges is $" + priceOne);
      }
      
      else if (weightInput > weightGroupOne && weightInput <= weightGroupTwo)
      {
         priceTwo = weightInput * RATE_TWO;
         System.out.println("The shipping charges is $" + priceTwo);            
      }
      
      else if (weightInput > weightGroupTwo && weightInput <= weightGroupThree)
         {
            priceThree = weightInput * RATE_THREE;
            System.out.println("The shipping charges is $" + priceThree);
         }
         
      else if (weightInput > weightGroupThree)
         {
            priceFour = weightInput * RATE_FOUR;
            System.out.println("The shipping charges is $" + priceFour);
         }
            
   }  
}