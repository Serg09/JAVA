/*
 * This program is "Sales Report"
 * Written by Sergey Skumatov,
 * CSC116500, chapter 10, exercise 8.
 *
 */
 
import java.io.*; 
import java.util.Scanner;
import java.text.DecimalFormat;

public class CSC116500_ch10_8
   {
    // Create a Scanner object for keyboard input. 
    Scanner keyboard = new Scanner(System.in);
    static DecimalFormat formatter = new DecimalFormat("#,##0.00");

    //private static int input;
    public static void main(String[] args) throws IOException
      {
      //Call function Header
      printHeader();
      //Call function with detailed report
      printDetails();
      }
         
         //The header module
         private static void printHeader() 
            {
             System.out.println("      Brewster has Used Cars, Inc.");
             System.out.println("\t      Sales report");
             System.out.println();
             System.out.println("Sales person ID       \t      Sale Amount");
             System.out.println("=========================================");
            }
            
         public static void printDetails() throws IOException 
            {
               //Variables
               int salespersonID;
               double saleAmount;
               
               //Acumulator variables
               double salespersonTotal = 0;
               double total = 0;
               
               //Variable to use a control break
               int currentID;
               
               //Declare an input file and open it
               Scanner myFile = new Scanner(new File("sales.txt")); 

               currentID = 0;

                              
               //Print the report details
               while (myFile.hasNext())
               {
                   //Read the next record
                  salespersonID = myFile.nextInt();
                  saleAmount = myFile.nextDouble();
                  if ((salespersonID != currentID)&& (currentID != 0))
                  {
                     System.out.println("Total sales for sale person:    " + "$" + formatter.format(salespersonTotal)); 
                     System.out.println();                     
                     //Save the next students ID
                     currentID = salespersonID;
                     //Reset the student accumulator
                     salespersonTotal = 0;
                  }
                  
                  //Print the data
                  System.out.printf(salespersonID + "\t\t\t\t" + "$" + formatter.format(saleAmount));
                  System.out.println();
                  
                  //Update the accumulators
                  salespersonTotal = salespersonTotal + saleAmount;
                  total = total + saleAmount;
                  
                  currentID = salespersonID;
                  
                                   
               }
               //Print the total for the last sales person
               System.out.println("Total sales for sale person_*:  " + "$" + formatter.format(salespersonTotal));
               System.out.println();
               
               //Print the total of all sales
               System.out.println("Total of all sales: " + "$" + formatter.format(total));
               
               //Close the file
               myFile.close();
            }
}

 

