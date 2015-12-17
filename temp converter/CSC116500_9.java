// This program converts Celsius temperatures to Fahrenheit temperatures.
// Written by Sergey Skumatov,
//  CSC116500, exercise 9.

import java.util.Scanner;

public class CSC116500_9
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
// Convert algebraic expressions to programming expressions to F=(9/5)*C+32
// Variables
		Float cTemp;
		Float fTemp;

// Input data on keyboard
		System.out.println("Enter a temperature in Celsius");
		cTemp = keyboard.nextFloat();

// Calculation
		fTemp = (9/5)*cTemp+32;

// Display result on screen
		System.out.print("The Fahrenheit Temperature is: " + fTemp);

	}
}