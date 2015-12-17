/*
 * This program Calculating the Factorial of a Number.
 * Written by Sergey Skumatov,
 * CSC116500, exercise 12.
 */
 
import java.util.Scanner;
public class CSC116500_12 
{ 
   public static void main(String[] args) 
   { 
   // Variables 
      int counter;
      int fact = 1; 
      int factValue; 
   
   // Create a Scanner object for keyboard input. 
      Scanner in = new Scanner(System.in); 
   
   //Input the number     
      System.out.print("Enter the number to calculate the factorial: "); 
      factValue = in.nextInt();
   
   // Display table headings. 
      System.out.println("Number\t\tFactorial"); 
      System.out.println("-----------------------"); 
   
   // Loop
      if (factValue < 0)
         System.out.println ("Enter the non-negative number.");
      else
      
         for (counter = 1; counter <= factValue; counter++) 
         { 
            fact = fact * counter; 
            System.out.println(counter + "\t\t" + fact); 
         } 
   } 
} 
