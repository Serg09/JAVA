/*
 * This program Decripting the file
 * Written by Sergey Skumatov,
 * CSC116500, chapter 12, exercise 11.
 *
 */

import java.io.*;
import java.util.Scanner;

public class CSC116500_ch12_ex11_verWork
{
   public static void main(String[] args) throws IOException
   {
            
      // Open a file named output.txt. (Encrypted file)
      Scanner myFile = new Scanner(new File("output.txt"));
      
      String input;
      String output;
      int index;
      char tempchar;
           
      // Display the records in the file and dencrypt
      while (myFile.hasNext())
      {
         // Read a record from the file.
         input = myFile.nextLine();
         
                  
         // Display Encrypted line from file
         System.out.println("Encrypted Line: " + input);
         // Display a blank line.
         //System.out.println();
         
         // Store the string in a StringBuilder object.
         StringBuilder str = new StringBuilder(input);
         
         char[] chararray;
         chararray = new char[str.length()];
         
         // Dencrypt each line to -2 character
         for (index = 0; index < str.length(); index++)
         {
         
         

               
               
            
            if (Character.isUpperCase(str.charAt(index)))
               {
                  str.setCharAt(index, Character.toLowerCase(str.charAt(index)));
               }
               else
                  {
                  str.setCharAt(index, Character.toUpperCase(str.charAt(index)));
                  }
                  


            tempchar = str.charAt(index);   
            chararray[index] = (char) (tempchar - 2); 
            
            
            
            //Change symbols back to char
            if (str.charAt(index) == '*')
               {
                  str.setCharAt(index, '.');
               }
            else if (str.charAt(index) == '2')
               {
                  str.setCharAt(index, 'T');
               }
            else if (str.charAt(index) == '¶')
               {
                  str.setCharAt(index, 'y');
               }
           
                     

         }
         
         
         //set chararray to output
         output = new String(chararray);
         
         // Display decrypted line on the screen
         System.out.println("Decrypted (Original) Line: " + output);
         // Display a blank line.
         System.out.println();

      }

      // Close the file.
      myFile.close();
   }
}