/*
 * This program do While-Loop and displays largest and smallest number.
 * Written by Sergey Skumatov,
 * CSC116500, exercise 10.
 */

import java.util.Scanner;

   public class CSC116500_10_12
{

//public static final int MAX_VALUE;
//public static final int MIN_VALUE;
//   public final static double FINAL_END = -99;
    private static int i;

    public static void main(String[] args)
       
   {
      
// variables.
//   int inputNumber;
        int inputNumber;
        inputNumber = 0;
        int max;
        max = 0;
        int min;
        min = 0;

        // Create a Scanner object for keyboard input.
      Scanner scan = new Scanner(System.in); 
   
//Input the number     
         System.out.print("Enter the number: "); 
         inputNumber = scan.nextInt();
         
//Get largest and smallest number   
            if (inputNumber == -99)
            {  
            System.out.println("\nPlease, enter the number or -99 to quit");  
            }
            for (i = 1; 1 != -99; i++)
//            else
//            {
//            
//            do
//            {
//            System.out.print("Enter the number (or -99 to quit): ");  
//            inputNumber = scan.nextInt(); 
//            }  
//            while (inputNumber != -99);      
            {
            if (inputNumber > max)
            {
            max = inputNumber;
            }
            else if (inputNumber < min)
            {
            min = inputNumber;
            }
       

            
//            System.out.print("The largest entered number is: " + max, "the smolest entered number is: " + min);   

        System.out.print("\nLargest: " + max);  
        System.out.print("\nSmallest:" + min); 
}
}
}

