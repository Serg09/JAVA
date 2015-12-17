/*
 * This program is "Astronomy Helper"
 * Written by Sergey Skumatov,
 * CSC116500, chapter 11, exercise 4.
 *
 */

import java.util.Scanner;

public class CSC116500_ch11_ex4_verA
   {
   private static Scanner keyboard;
   
   public static void main(String[] args)
      {
      //create scanner
      keyboard = new Scanner(System.in);
      //Declare a variable to hold the user's menu selection
      int menuSelection;
      menuSelection = 0;
      
      
         //displayMenu(menuSelection);   

         switch(displayMenu(menuSelection))
            {
            case 1:
            mercury(); //module Mercury
            break;
            
            case 2:
            venus(); //module Venus            
            break;
            
            case 3:
            earth(); //module Earth
            break;
            
            case 4:
            mars(); //module Mars
            break;
            
            default:
            System.out.println();
            System.out.println("Buy!");
            System.out.println();
            break;
            }
      }
      
         
            
         //Module to display the menu and prompts the user for a selection.
         public static int displayMenu(int selection)
         //public static int displayMenu()
            {
            System.out.println("  SELECT A PLANET  ");
            System.out.println("1. Mercury.");
            System.out.println("2. Venus.");
            System.out.println("3. Earth.");
            System.out.println("4. Mars.");
            System.out.println("5. End the program.");
            System.out.println();
            System.out.println("Enter your selection.");
            selection = keyboard.nextInt();
            //Validate
            while(selection < 1 || selection > 5)
               {
               System.out.println("That is an invalid selection.");
               System.out.println("Enter 1, 2, 3, 4, or 5");
               selection = keyboard.nextInt();
               }
         return selection;
      }
            
            
         
         //MERCURY   
         public static void mercury()
            {
                  System.out.println(" M E R C U R Y ");
                  System.out.println("Average distance from the sun ------------ 57.9 million kilometers");
                  System.out.println("Mass ------------------------------------- 3.31 × 10^23 kg ");
                  System.out.println("Surface temperature ---------------------- -173 to 430 degrees Celsius  ");
                  System.out.println();
            }
            
         //VENUS   
         public static void venus()
            {
                  System.out.println(" V E N U S ");
                  System.out.println("Average distance from the sun ------------ 108.2 million kilometers ");
                  System.out.println("Mass ------------------------------------- 4.87 × 10^24 kg ");
                  System.out.println("Surface temperature ---------------------- 472 degrees Celsius  ");
                  System.out.println();
            }
            
         //EARTH   
         public static void earth()
            {
                  System.out.println(" E A R T H ");
                  System.out.println("Average distance from the sun ------------ 149.6 million kilometers ");
                  System.out.println("Mass ------------------------------------- 5.967 × 10^24 kg  ");
                  System.out.println("Surface temperature ---------------------- -50 to 50 degrees Celsius ");
                  System.out.println();
            }
            
         //MARS   
         public static void mars()
            {
                  System.out.println(" M A R S ");
                  System.out.println("Average distance from the sun ------------ 227.9 million kilometers ");
                  System.out.println("Mass ------------------------------------- 0.6424 × 10^24 kg ");
                  System.out.println("Surface temperature ---------------------- -140 to 20 degrees Celsius ");
                  System.out.println();
            }
    }

