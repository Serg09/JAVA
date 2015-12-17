/*
 * This program is "Search Benchmarks"
 * Written by Sergey Skumatov,
 * CSC116500, chapter 9, exercise 7.
 *
 */
 
import java.util.Scanner;

public class CSC116500_ch9_7
   {
      // Create a Scanner object for keyboard input. 
      private static Scanner keyboard;
      // Create a constant for the number of IDs. 
      private static final int SIZE = 100;

      //private static int input;

    public static void main(String[] args)
      {
      keyboard = new Scanner(System.in);

         //declare an arrays holding IDs
         int[] benchMark = {9923361, 1944406, 1271483, 3290254, 3843726, 6402884, 1115625, 1367615, 3001858, 4708914, 3807320, 8902316, 2617330, 5862498, 9346569, 3674782, 2690143, 9863635,
                           6343158, 7904589, 8000721, 7712325, 8577514, 5981950, 4768640, 6018356, 2269209, 4516650, 4384112, 7171940, 7808457, 8289117, 6847138, 2173077, 4805046, 3518924,
                           9767503, 6631554, 7039402, 1596285, 6535422, 7327798, 9731097, 2521198, 6150894, 8481382, 6270346, 3903452, 8613920, 3482518, 3266935, 8133260, 4924498, 7940996,
                           5501290, 6210620, 1692417, 6247026, 8192985, 7135534, 1307889, 9790823, 4732234, 8517788, 3770914, 2401747, 1728823, 3747594, 6691280, 9250437, 3963178, 1824955,
                           3459199, 7556468, 6654874, 2749868, 3074671, 8710052, 3194122, 4132122, 5537696, 3711188, 9190712, 1752142, 1848274, 1559879, 2425066, 6439290, 7616193, 8865909,
                           5116762, 7364204, 7231666, 1019493, 1656010, 2136670, 9694691, 5020630, 7652600, 6366478};
                           
         // Create a Scanner object to read input.
         keyboard = new Scanner(System.in);

         //Variables
         int seq;
         //seq = getSeq;
         int bin;
         //bin = getBin;
         int input;
         
         //Get the users value
         System.out.println("Enter the value");
         input = keyboard.nextInt();
         
         //Get the sequential search
         seq = getSeq(benchMark, input);
         //getSeq(benchMark, input);
         
         // Get the binary search
         bin = getBin(benchMark, input);
         //getBin(benchMark, input);
         
         //Display result
         System.out.println("The sequential algorithm did: " + seq + " comparisons");
         System.out.println("The binary algorithm did: " + bin + " comparisons");
         }
         
         
            //The getSeq function accepts an Integer array and the
            //array size as argument. It returns the Integer number of comparisons
            public static int getSeq(int[] array, int input)
               {
                  //Loop counter
                  int index, comp;
                  boolean found;
            
                  // Declare a Boolean variable to act as a flag. 
                  found = false;
            
                  //Set the counter and comparison variable to 0
                  //int index;
                  index = 0;
                  //int comp;
                  comp = 0;
            
                  while (found == false && index < array.length)
                     {
                        if (array[index] == input)
                           found = true;
                        else
                           index = index + 1;
                           comp++;
                        
                        //System.out.println("The sequential algorithm did: " + comp + " comparisons");
                     }
                    return comp;
               }


            //The getSeq function accepts an Integer array and the
            //array size as argument. It returns the Integer number of comparisons
            public static int getBin(int[] array, int input)
               {
                  int first;
                  int last;
                  int middle;
                  int position;
                  int count;
                  boolean found;

                  //Initialize values
                  first = 0;
                  last = array.length - 1;
                  position = - 1;
                  found = false;
                  count = 0;
                  
                  //Search for the value
                  while (!found && first <= last)
                  {
                     //Calculate middle point
                     middle = (first + last) / 2;
                     count++;
                     
                     //if value found in the middle
                     if (array[middle] == (input))
                     {
                        found = true;
                        position = middle;
                        //count++;
                     }
                     //else if in lower half
                     //else if (array[middle].compareTo(input) > 0)//original
                     else if (array[middle] > input)
                     //else if ((array[middle] != input) && (array[middle] > 0))
                     //else if (compare(array[middle],input) > 0)
                        last = middle - 1;
                     //else if value in upper half
                     else
                        first = middle + 1;
                    }
                 return count;
                 }
}