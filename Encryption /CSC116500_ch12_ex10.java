/*
 * This program Encrypte the file
 * Written by Sergey Skumatov,
 * CSC116500, chapter 12, exercise 10.
 *
 */

import java.io.*;
import java.util.Scanner;

public class CSC116500_ch12_ex10
{
   public static void main(String[] args) throws IOException
   {
            
      // Open a file named input.txt.
      Scanner inputFile = new Scanner(new File("input.txt"));
      //Create a file named output.txt
      PrintWriter outputFile = new PrintWriter("output.txt");

      //Declare variables
      String input;
      String output;
      int index;
      char tempchar;
           
      // Display the records in the file and encrypt
      while (inputFile.hasNext())
      {
         // Read a record from the file.
         input = inputFile.nextLine();
         
         // Display original line from file
         System.out.println("Original Line: " + input);
         
         // Store the string in a StringBuilder object.
         StringBuilder str = new StringBuilder(input);
         
         char[] chararray;
         chararray = new char[str.length()];
         
         // encrypt each line to +2 character
         for (index = 0; index < str.length(); index++)
         {  
            //exchange upper case and lower case
            if (Character.isUpperCase(str.charAt(index)))
               {
                  str.setCharAt(index, Character.toLowerCase(str.charAt(index)));
               }
            else
               {
                  str.setCharAt(index, Character.toUpperCase(str.charAt(index)));
               }
            
            //create temporary array and plus two characters
            tempchar = str.charAt(index);   
            chararray[index] = (char) (tempchar + 2); 
            
            //Change some char to symbols
            if (str.charAt(index) == '.')
               {
                  str.setCharAt(index, '*');
               }
            else if (str.charAt(index) == 'T')
               {
                  str.setCharAt(index, '2');
               }
            else if (str.charAt(index) == 'y')
               {
                  str.setCharAt(index, '¶');
               }
            
         }
         
         //set chararray to output
         output = new String(chararray);
         outputFile.println(output);
         
         // Display encrypted line
         System.out.println("Encrypted Line: " + output);
         // Display a blank line.
         System.out.println();
      }  

      // Close the files
      inputFile.close();
      outputFile.close();
   }
}