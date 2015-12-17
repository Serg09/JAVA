/*
 * This program is Rock, Paper and Scissor game.
 * Written by Sergey Skumatov,
 * CSC116500, exercise 5 ver2
 *
 */


import java.util.Scanner;
import java.util.Random;

public class CSC116500_5_ver_FIXED

{
   private static Scanner keyboard;
   public static void main(String[] args)
    
   {
      
         //User's play "R", "P", or "S"
      //String personPlay;
        String personPlay;
        personPlay = ("Rock");
       personPlay = ("Paper");
       personPlay = ("Scissors");
      //personPlay = null;
         //Computer's play "R", "P", or "S"
      String computerPlay; 
         //Randomly generated number
      int computerInt; 
         
      //Create scanner and random generator   
      keyboard = new Scanner(System.in);
      Random generator = new Random();
      
       //Ask player to play (stored as a string)     
      System.out.println ("Enter ROCK for Rock, PAPER for Paper, SCISSORS for Scissors: "); 
      personPlay = keyboard.next();
      personPlay = personPlay.toUpperCase();
         
      //Validation
      while (toUpperCase(personPlay) != toUpperCase("ROCK") || toUpperCase(personPlay) != toUpperCase("SCISSORS") || toUpperCase(personPlay) != toUpperCase("PAPER"))
      {
         System.out.print("Please, enter ROCK for Rock, PAPER for Paper, SCISSORS for Scissors:");
         personPlay = keyboard.next();
      }
   
            //Computer generator (0,1,2)
      computerInt = generator.nextInt(3);
   
               //Switch
      switch (computerInt)
      {
         case 0:
            {
               computerPlay = "ROCK";
               break;
            }
         case 1:
            {
               computerPlay = "PAPER";
               break;
            }
         case 2:
            {
               computerPlay = "SCISSORS";
               break;
            }
         default:
            {
               computerPlay = "will not happen";
            }	
      }
               
   //If-else. Find the winner
               
      System.out.println ("Computer plays: " + computerPlay);
      if (personPlay.equals(computerPlay))
      {
         System.out.println("The chice is matching!");
      }
         
      else if (personPlay.equals("ROCK"))
      {
         if (computerPlay.equals("SCISSORS"))
            System.out.println("The ROCK smashes the SCISSORS. You win!!");
         else if (computerPlay.equals("PAPER"))
            System.out.println ("PAPER eats ROCK. You lose!!");
      }
      else if (personPlay.equals("PAPER"))
      {
         if (computerPlay.equals("SCISSORS"))
            System.out.println ("SCISSORS cuts PAPER. You lose!!");
         else if (computerPlay.equals("ROCK"))
            System.out.println ("PAPER eats ROCK. You win!!");
      }
      else if (personPlay.equals("SCISSORS"))
      {
         if (computerPlay.equals("PAPER"))
            System.out.println ("SCISSORS cuts PAPER. You win!!");
         else if (computerPlay.equals("ROCK"))
            System.out.println ("ROCK breaks SCISSORS. You lose!!");
      }
   }

   private static Object toUpperCase(String string) {
   	// TODO Auto-generated method stub
      return null;
   }

}
