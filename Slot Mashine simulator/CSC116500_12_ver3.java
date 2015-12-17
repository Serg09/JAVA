/*
 * This program is Slot Machine Simulation
 * Written by Sergey Skumatov,
 * CSC116500, exercise 12.
 * Why DO loop doesn not work?
 *
 */


import java.util.Random;
import java.util.Scanner;
import java.util.List;
 
 public class CSC116500_12_ver3
 
{

// Declare variables
static String[] reels = { "Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars" };
static int numberOfReels = 3;

char playAgain;
double amountBet = 0;
double totalWon = 0;

//Decimal Format
DecimalFormat dollar = new DecimalFormat("#,##0.00");


// Create a Scanner object for keyboard input.
Scanner keyboard = new Scanner(System.in);

// Method that return the number of times
static int determinePayOutPercentage(List<String> reels) 

   {
      Multiset<String> reelCount = HashMultiset.create();
      reelCount.addAll(reels);

// order the number of elements by the higest
      ImmutableMultiset<String> highestCountFirst = Multisets.copyHighestCountFirst(reelCount);

      int count = 0;
      for (Entry<String> entry : highestCountFirst.entrySet())
      {
      count = entry.getCount();
      break;
      }
      return count;
   }

//Method gets reel randomly and returns string representing reel
static String getRandomReel()

// Create a Random object, set seed to the number of elements in array
         {
         Random randomNumber = new Random();
         return getReel(randomNumber.nextInt(reels.length));
         }

/*
 * Method return reel based on index of array 0 - cherries 1 -
 * oranges 2 - plums 3 - bells 4 - melons 5 - bars
 */
            static String getReel(int index)
            {
            checkElementIndex(index, reels.length);
            return reels[index];
            }

// Play the slot machine, and repeat the game as needed.
               do 
               {
               System.out.println("Welcome to the Slot Machine Simulation.");

// Get the amount the user wants to bet.
                  System.out.print("\nEnter the amount you would like to bet: $");
                  amountBet = keyboard.nextDouble();

// Skip a line.
               System.out.println();

// generate random reels
               List<String> reels = Lists.newArrayList();
                  for (int x = 0; x < numberOfReels; x++) 
                  {
                  reels.add(getRandomReel());
                  }

// display reels
               System.out.println(Joiner.on("--").join(reels));

// determine the payout percentage
               int payoutPercentage = determinePayOutPercentage(reels);

// calcuate the amount won
               double amountWon = payoutPercentage * amountBet;

// keep running total of amount won
               totalWon += amountWon;

// Display the amount won.
               System.out.println("\nYou win $" + dollar.format(amountWon));

// Ask the user to play again.
         System.out.println("\nWould you like to play again?");
         System.out.print("Enter Y for yes or N for no: ");
         String input = keyboard.next(); // Read a string.
         playAgain = input.charAt(0); // Get the first character.

            } 
         while (playAgain == 'Y' || playAgain == 'y');
         
//Display the total amount won  
            {          
         System.out.println("You won a total of $" + dollar.format(totalWon));

            }
}