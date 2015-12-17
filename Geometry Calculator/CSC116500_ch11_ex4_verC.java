/*
 * This program is "Astronomy Helper"
 * Written by Sergey Skumatov,
 * CSC116500, chapter 11, exercise 4.
 *
 */

import java.util.Scanner;

public class CSC116500_ch11_ex4_verC
   {
   private static Scanner keyboard;
   public static void main(String[] args)
   {
      //create scanner
      keyboard = new Scanner(System.in);
      //Declare a variable to hold the user's menu selection
      int menuSelection = 0;
      //int menuSelection;
      
      
         //displayMenu(menuSelection);   
         
      do
         {
         //call display menu
         //displayMenu(menuSelection);                            //as in the book
         //displayMenu();
         
         //Perform the selected operation
         //switch(menuSelection)                               // as in the book
         switch(displayMenu(menuSelection))                   // this way works better
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
        while (menuSelection != 4);
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
            //local variable
                //String another;
            String another = null;
            //another = ("Y");
            //another = keyboard.nextLine();
                                    //Create scanner and random generator   
                                    //keyboard = new Scanner(System.in);
            //another = another.toUpperCase();
            //while(toUpperCase(another) ==  toUpperCase("Y"))
            //while(another.toUpperCase.equals("y") || another.toUpperCase.equals("Y"));
            //while(toUpperCase(another).equals("y") || toUpperCase(another).equals("Y"));
            while(toUpperCase(another) == ("y") || toUpperCase(another) == ("Y"));
            //while (another == "Y");
               {
                  System.out.println(" M E R C U R Y ");
                  System.out.println("Average distance from the sun ------------ 57.9 million kilometers");
                  System.out.println("Mass ------------------------------------- 3.31 × 10^23 kg ");
                  System.out.println("Surface temperature ---------------------- -173 to 430 degrees Celsius  ");
                  System.out.println();
                  System.out.println("Do you want see information about another planets?");
                  System.out.println("(Enter Y for yes, or anything else for no.)");
                  //input = Y;
                  //while(toUpperCase(another) == ("y") || toUpperCase(another) == ("Y"));
                  //{
                  another = keyboard.nextLine();
                  //}
                  //while(toUpperCase(another) == ("y") || toUpperCase(another) == ("Y"));
                  //another = another.toUpperCase();
                  System.out.println();
               }
            }
            
         //VENUS   
         public static void venus()
            {
            //local variable
            String another = "Y";
            another = keyboard.nextLine();
            //while(toUpperCase(another) == "Y")
            //while(another == "Y" || another == "y");
            while(toUpperCase(another) == ("y") || toUpperCase(another) == ("Y"));

               {
                  System.out.println(" V E N U S ");
                  System.out.println("Average distance from the sun ------------ 108.2 million kilometers ");
                  System.out.println("Mass ------------------------------------- 4.87 × 10^24 kg ");
                  System.out.println("Surface temperature ---------------------- 472 degrees Celsius  ");
                  System.out.println();
                  System.out.println("Do you want see information about another planets?");
                  System.out.println("(Enter Y for yes, or anything else for no.)");
                  //input = Y;
                  another = keyboard.nextLine();
                  //while(toUpperCase(another) == ("y") || toUpperCase(another) == ("Y"));

                  //System.out.println();
               }
            }
            
         //EARTH   
         public static void earth()
            {
            //local variable
            String another = "Y";
            another = keyboard.nextLine();
            //while(toUpperCase(another) == "Y")
            //while(another == "Y" || another == "y");
            while(toUpperCase(another) == ("y") || toUpperCase(another) == ("Y"));
               {
                  System.out.println(" E A R T H ");
                  System.out.println("Average distance from the sun ------------ 149.6 million kilometers ");
                  System.out.println("Mass ------------------------------------- 5.967 × 10^24 kg  ");
                  System.out.println("Surface temperature ---------------------- -50 to 50 degrees Celsius ");
                  System.out.println();
                  System.out.println("Do you want see information about another planets?");
                  System.out.println("(Enter Y for yes, or anything else for no.)");
                  //input = Y;
                  another = keyboard.nextLine();
                  System.out.println();
               }
            }
            
         //MARS   
         public static void mars()
            {
            //local variable
            String another = "Y";
            another = keyboard.nextLine();
            //while(toUpperCase(another) == "Y")
            //while(another == "Y" || another == "y");
            while(toUpperCase(another) == ("y") || toUpperCase(another) == ("Y"));
               {
                  System.out.println(" M A R S ");
                  System.out.println("Average distance from the sun ------------ 227.9 million kilometers ");
                  System.out.println("Mass ------------------------------------- 0.6424 × 10^24 kg ");
                  System.out.println("Surface temperature ---------------------- -140 to 20 degrees Celsius ");
                  System.out.println();
                  System.out.println("Do you want see information about another planets?");
                  System.out.println("(Enter Y for yes, or anything else for no.)");
                  //input = Y;
                  another = keyboard.nextLine();
                  System.out.println();
               }
            }

    private static String toUpperCase(String another) {
        return null;
    }
}
