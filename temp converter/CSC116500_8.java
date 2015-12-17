// This program calculates Tip, Tax, and Total at the restaurant.
// Written by Sergey Skumatov,
//  CSC116500, exercise 8.

import java.util.Scanner;

public class CSC116500_8
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
// Variables
		double foodPrice;
		double tipPercentage;
		double taxPercentage;
		double totalPrice;
		
// Constants
		final double TIP_PERCENT = 0.15;
		final double SALES_TAX = 0.07;

// Input data on keyboard
		System.out.println("Enter the food price");
		foodPrice = keyboard.nextDouble();

// Calculation
		tipPercentage = foodPrice * TIP_PERCENT;
		taxPercentage = foodPrice * SALES_TAX;
		totalPrice = foodPrice + tipPercentage + taxPercentage;

// Display result on screen
		System.out.print("Your Tip is: " + tipPercentage);
//		System.out.print(tipPercentage, ); (in case if in previous line not using combination + )
		System.out.print(" Tax is: " + taxPercentage);
//		System.out.print(taxPercentage, ); (in case if in previous line not using combination + )
		System.out.print(" Total: " + totalPrice);
//		System.out.print(totalPrice); (in case if in previous line not using combination + )

	}
}