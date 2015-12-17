/*
 * This program calculates rectangle's area.
 * Written by Sergey Skumatov,
 * CSC116500, exercise 12 version 2.
 * 
 * This version is which should be rigth, but I do not understand where is mistake.
 * It doesn show any error, but still doesn not work properly
 * 
 */
import java.util.*; //?
import java.util.Random;
import java.util.Scanner;

public class CSC116500_12_ver2
{	
   public static void main(String[] args)	
   {
   // create variables
        Random generator;
        generator = new Random();

        // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner (System.in);
   		
   //Number of slots         
      int slots1; 
      int slots2; 
      int slots3;	
      
   //Number for each slot
      int cherries = 0;			// 0
      int oranges = 0;			// 1
      int plums = 0;				// 2
      int bells = 0;				// 3
      int melons = 0;		   // 4
      int bars = 0;				// 5
      boolean playAgain = true;
      
   // boolean playAgain = false;
      
      double money;
      double totalAmountWon = 0;
      double totalAmountEntered = 0;
      
      String input;
      double winnings = 0;
      char choice;
      
      
   //while loop
      //while (playAgain = true);
     do 
   //Get user data
   // Display how much money do you want to insert 
      {
         System.out.println ("Make a bet $");
         money = keyboard.nextDouble();
      		
            
      //input money totalAmountEntered
      //totalAmountEntered = totalAmountEntered + money
      
         slots1 = generator.nextInt(6);
         slots2 = generator.nextInt(6);
         slots3 = generator.nextInt(6);
         
      //Loop
            
            if (slots1 != slots2) {
            } else {
                if (slots1 == 1)
                    cherries++;
                else if (slots1 == 2)
                    oranges++;
                else if (slots1 == 3)
                    plums++;
                else if (slots1 == 4)
                    bells++;
                else if (slots1 == 5)
                    melons++;
                else if (slots1 == 6)
                    bars++;
            }

            if (slots2 != slots3) {
            } else {
                if (slots2 == 1)
                    cherries++;
                else if (slots2 == 2)
                    oranges++;
                else if (slots2 == 3)
                    plums++;
                else if (slots2 == 4)
                    bells++;
                else if (slots2 == 5)
                    melons++;
                else if (slots2 == 6)
                    bars++;
            }

            if (slots1 != slots3) {
            } else {
                if (slots3 == 1)
                    cherries++;
                else if (slots3 == 2)
                    oranges++;
                else if (slots3 == 3)
                    plums++;
                else if (slots3 == 4)
                    bells++;
                else if (slots3 == 5)
                    melons++;
                else if (slots3 == 6)
                    bars++;
            }


            //calculate winnings
         if (slots1 == slots2 && slots2 == slots3)
         {
         //if all three words match
            winnings = 3 * money;
            totalAmountWon = totalAmountWon + winnings;
            System.out.print("Your bet multiply 3X " + totalAmountWon);		
         }
         
         if (slots1 != slots2 && slots1 != slots3 && slots2 != slots3)
         {
         //two words match 
            winnings = 2 * money;
            totalAmountWon = totalAmountWon + winnings;
            System.out.print("Your bet multiply 2X " + totalAmountWon);
         }
         else
         {
            winnings = 0;
            System.out.print("Sorry you lose");
         }
            
      
      //display if want to play again? (y or n)
         {
            System.out.print("Do you want to play again (Y/N): ");
            input = keyboard.nextLine();
            choice = input.charAt(0);
                if (choice != 'Y' && choice != 'y') {
                } else {
                    playAgain = true;
                }
                if (choice == 'N' || choice == 'n')
            {
              while (playAgain = false);
            }
         }
      }
