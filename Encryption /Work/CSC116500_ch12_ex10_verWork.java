/*
 * This program Encrypte the file
 * Written by Sergey Skumatov,
 * CSC116500, chapter 12, exercise 10.
 *
 */

import java.io.*;
import java.util.Scanner;

public class CSC116500_ch12_ex10_verWork
{
   public static void main(String[] args) throws IOException
   {
            
      // Open a file named input.txt.
      Scanner inputFile = new Scanner(new File("input.txt"));
      //Create a file named output.txt
      PrintWriter outputFile = new PrintWriter("output.txt");
      //String newLine = System.getProperty("line.separator");       //try X, Finde it on interenet and try make this. Did not work. Later I used "line.separator"
                                                                     //it did nop work at all (did not save that line)
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
         
                  
         /// Display original line from file
         System.out.println("Original Line: " + input);
         // Display a blank line.
         //System.out.println();
         
         // Store the string in a StringBuilder object.
         StringBuilder str = new StringBuilder(input);
         
         char[] chararray;
         chararray = new char[str.length()];
         
         // encrypt each line to +2 character
         for (index = 0; index < str.length(); index++)
         {   
      
                        
            //char c = str.charAt(index);
            if (Character.isUpperCase(str.charAt(index)))
               {
                  str.setCharAt(index, Character.toLowerCase(str.charAt(index)));
               }
               else
                  {
                  str.setCharAt(index, Character.toUpperCase(str.charAt(index)));
                  }
                  



            //outputFile.println(chararray);  
            tempchar = str.charAt(index);   
            chararray[index] = (char) (tempchar + 2); 
            
            
            //Change char to symbols
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
            
            
            //try to make symbol exchange
            //char[] exchange = chararray[index];                   //did not work 
            //char temp = exchange[0];
            //exchange[0] = exchange[1];
            //exchange[1] = temp;
            
            //MODULE exchanging symbols                           //did not work ????????
            //exchange(str.charAt(index));

   
            //outputFile.println(chararray[index]);  
            //outputFile.print(chararray[index]);  
            //outputFile.println();


         }
         
            //set chararray to output
            output = new String(chararray);
            outputFile.println(output);
            //outputFile.close();
         
         // Display encrypted line
         System.out.println("Encrypted Line: " + output);
         // Display a blank line.
         System.out.println();
         
         
            //PrintWriter outputFile = new PrintWriter("output.txt");
            //{
            //outputFile.println(output);
            //outputFile.close();
            //}

      }
         
     
            
      // Close the files.
      inputFile.close();
      outputFile.close();
   }
   

       /*
       private static void exchange(char[] c) 
       {
        char[] c;
        c = str.charAt;
        char temp = c[0];
        c[0] = c[1];
        c[1] = temp;
        }
        */
}