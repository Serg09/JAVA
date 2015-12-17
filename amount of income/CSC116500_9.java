// This program calculates sold seats for each class and amount of income.
// Written by Sergey Skumatov,
//  CSC116500, exercise 9.

import java.util.Scanner;

public class CSC116500_9
{
	public static void main(String[] args)
	{

// Variables
      int displayText;
      int squareFeet;
      int pricePerGallon;
           
//call module ticketsSoldA
      displayText();
      
//Call Moduls      
      calculationModule(115,8,20);
   }
            
              //Module_displayText
      public static void displayText()
      {
//Display_Text
      System.out.println("Paint Job Estimator");
      }
                
              //Module_Gallons og Paint needed_1
      public static void calculationModule(int value1, int value2, int value3)      
      {

//Variables      
      double resultTotalGallons;
      double resultHoursLabor;
      double resultCostPaint;
      double resultLaborCharges;
      double squareFeet;
      double pricePerGallon;
      double resultTotal;
      
//Scaner object for keyboard input
		Scanner keyboard = new Scanner(System.in);
//Enter Square Feet
      System.out.println("Please, Enter the square feet of wall space to be painted ");
      squareFeet = keyboard.nextDouble();
//Enter Price Per Gallon
      System.out.println("Please, Enter the paint price for a Gallon ");
      pricePerGallon = keyboard.nextDouble(); 
      
//Calculation_Gallons of Paint Required      
      resultTotalGallons = 1.00 / value1 * squareFeet;  
//Display the result
      System.out.println ("The number of gallons of paint required: " + resultTotalGallons + " gallons ");   

//Calculation_The hours of labor required
      resultHoursLabor = squareFeet / value1 * value2;
//Display the result
      System.out.println ("The hours of labor required: " + resultHoursLabor + " hours ");  

//Calculation_The cost of the paint
      resultCostPaint = pricePerGallon * resultTotalGallons;   
//Display the result
      System.out.println ("The cost of the paint: $" + resultCostPaint);
      
//Calculation_The labor charges
      resultLaborCharges = squareFeet / value1 * value2 * value3;
//Display the result
      System.out.println ("The labor charges: $" + resultLaborCharges);
      
//Calculation of total cost of the paint job
      resultTotal = resultLaborCharges + resultCostPaint;
//Display the result
      System.out.println ("The total cost of the paint job $" +resultTotal);
      }
}   
