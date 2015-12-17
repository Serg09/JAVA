// This program calculates sold seats for each class and amount of income.
// Written by Sergey Skumatov,
//  CSC116500, exercise 8.

import java.util.Scanner;

public class CSC116500_8
{
	public static void main(String[] args)
	{
      
// Variables
		int ticketsSold;
      
// Display the program name
		System.out.println("Stadium tickets sale");
      
//call module ticketsSold
      ticketsSold(15,12,9);

   }     
         //Module 
      public static void ticketsSold(int value1, int value2, int value3)
   {
//Scaner object for keyboard input
		Scanner keyboard = new Scanner(System.in);
//Local variable
      int resultA;
      int ticketsInputA;
      int resultB;
      int ticketsInputB;
      int resultC;
      int ticketsInputC;

//Display_Enter the amount of sold ticket A
      System.out.println("Enter the amount of sold tickets in Class A seats");
      ticketsInputA = keyboard.nextInt();
      
//Calculation
      resultA = value1 * ticketsInputA;
      
//Display the result
      System.out.println ("Section A income $" + resultA);

//Display_Enter the amount of sold ticket B
      System.out.println("Enter the amount of sold tickets in Class B seats");
      ticketsInputB = keyboard.nextInt();
      
//Calculation
      resultB = value2 * ticketsInputB;
      
//Display the result
      System.out.println ("Section B income $" + resultB); 

//Display_Enter the amount of sold ticket C
      System.out.println("Enter the amount of sold tickets in Class C seats");
      ticketsInputC = keyboard.nextInt();
      
//Calculation
      resultC = value3 * ticketsInputC;
      
//Display the result
      System.out.println ("Section C income $" + resultC);

      int totalSale;
//Tickets Total
      totalSale = resultA + resultB + resultC;
   
//Display the total
      System.out.print("Total amount of income generated from tickets sales is $" + totalSale);
   }
}


