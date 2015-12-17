/*
 * This program calculates sold seats for each class and amount of income.
 * Written by Sergey Skumatov,
 * CSC116500, exercise 9.
 */

import java.util.Scanner;

public class CSC116500_9_ver3
{
// constans.
   public final static double RATE_ONE = 1.10;
   public final static double RATE_TWO = 2.20;
   public final static double RATE_THREE = 3.70;
   public final static double RATE_FOUR = 3.80;
   
   public static void main(String[] args)
       
   {
// Create a Scanner object for keyboard input. 
      Scanner keyboard = new Scanner(System.in); 
        
// Declare local variables.
      double weightInput;
      double priceOne;
      double priceTwo;
      double priceThree;
      double priceFour;
        int weightGroupOne;
        weightGroupOne = 2;
        int weightGroupTwo;
        weightGroupTwo = 6;
        int weightGroupThree;
        weightGroupThree = 10;

        // Prompt the user to enter the weight.
      System.out.print("Please, enter the weight of a package "); 
      weightInput = keyboard.nextDouble(); 
      
   //Calculate the prices.
      
      if (weightInput <= weightGroupOne)
      {
           priceOne = calcPriceOne (weightInput);
         System.out.println("The shipping charges is $" + priceOne);
//           System.out.println("The shipping charges is $" + calcPriceOne);
      }
      
      else if (weightInput > weightGroupOne && weightInput <= weightGroupTwo)
      {
//         priceTwo = weightInput * RATE_TWO;
           priceTwo = calcPriceTwo (weightInput);
         System.out.println("The shipping charges is $" + priceTwo);            
      }
      
      else if (weightInput > weightGroupTwo && weightInput <= weightGroupThree)
         {
//          priceThree = weightInput * RATE_THREE;
            priceThree = calcPriceThree (weightInput);
            System.out.println("The shipping charges is $" + priceThree);
         }
         
      else if (weightInput > weightGroupThree)
         {
            priceFour = weightInput * RATE_FOUR;
            System.out.println("The shipping charges is $" + priceFour);
         }
    }
    
//Module One
    private static double calcPriceOne(double weightInput) {
//        double weight;
        return weightInput * RATE_ONE;
    }
    
//Module Two    
    private static double calcPriceTwo(double weightInput) {
//        double weight;
        return weightInput * RATE_TWO;
    }

//Module Three
    private static double calcPriceThree(double weightInput) {
//        double weight;
        return weightInput * RATE_THREE;
    }
}
