/*
 * This program is "Geometry Calculator"
 * Written by Sergey Skumatov,
 * CSC116500, chapter 11, exercise 3.
 *
 */

import java.util.Scanner;

public class CSC116500_ch11_ex3_verB
   {
   private static Scanner keyboard;
   public static void main(String[] args)
   {
      //create scanner
      keyboard = new Scanner(System.in);
      //Declare a variable to hold the user's menu selection
      int menuSelection = 0;
      //int menuSelection;
      
      do
         {
         //call display menu
         //displayMenu(menuSelection);                            //as in the book
         //displayMenu();
         
         //Perform the selected operation
         //switch(menuSelection)                                  // as in the book
         switch(displayMenu(menuSelection))                       // this way works better
            {
            case 1:
            areaCircle(); //module to calculate the Area of a Circle
            break;
            
            case 2:
            areaRectangle(); //module to calculate the Area of a Rectangle
            break;
            
            case 3:
            areaTriangle(); //module to calculate the Area of a Triangle
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
            System.out.println("1. Calculate the Area of a Circle.");
            System.out.println("2. Calculate the Area of a Rectangle.");
            System.out.println("3. Calculate the Area of a Triangle.");
            System.out.println("4. End the program.");
            System.out.println();
            System.out.println("Enter your selection.");
            selection = keyboard.nextInt();
            //Validate
            while(selection < 1 || selection > 4)
               {
               System.out.println("That is an invalid selection.");
               System.out.println("Enter 1, 2, 3, or 4");
               selection = keyboard.nextInt();
               }
       return selection;
            }
         
         //The areaCircle module calculates the are of a Circle   
         public static void areaCircle()
            {
            //local variable
            double r, area;
            double p = 3.14159;
            //get the radius
            System.out.println("Eneter the Radius of a Circle.");
            //input = r();
            r = keyboard.nextInt();
            //calculate the area
            area = p * (r *r);
            //area = p * Math.pow(r);
            //Display the result
            System.out.println("The Area of a Circle is: " + area);
            System.out.println("-------------------------------------");
            System.out.println();
            System.out.println();
            }
            
         //The areaRectangle module calculates rectangle area
         public static void areaRectangle()
            {
            double area, length, width;
            //Get the length
            System.out.println("Enter the Length of the Rectangle.");
            //input = length();
            length = keyboard.nextInt();
            //Get the width
            System.out.println("Enter the Width of the Rectangle.");
            //input = width();
            width = keyboard.nextInt();
            //calculate the area
            area = length * width;
            //Display the result
            System.out.println("The Area of a Rectangle is: " + area);
            System.out.println("-------------------------------------");
            System.out.println();
            System.out.println();
            }
            
         //The areaTriangle calculates the are of triangle
         public static void areaTriangle()
            {
            double area, base, height;
            //Get the base length
            System.out.println("Enter the Length of the Triangle Base.");
            //input = base();
            base = keyboard.nextInt();
            //Get the height
            System.out.println("Enter the triangle height.");
            //input = height();
            height = keyboard.nextInt();
            //calculate the triangle area
            area = base * height * .5;
            //Display the result
            System.out.println("The Triangle area is: " + area);
            System.out.println("-------------------------------------");
            System.out.println();
            System.out.println();        
      }
}
            
            