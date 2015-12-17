/*
 * This program is "Sorting Benchmarks"
 * Written by Sergey Skumatov,
 * CSC116500, chapter 9, exercise 8.
 *
 */
 
import java.util.Scanner;

public class CSC116500_ch9_8
   {
      // Create a Scanner object for keyboard input. 
      private static Scanner keyboard;
      // Create a constant for the number of IDs. 
      private static final int SIZE = 500;
      
        //Constants to count swaps
        private static int countS;
        private static int countB;
        private static int countI;

    //private static int input;

    public static void main(String[] args)
      {
      keyboard = new Scanner(System.in);

         //declare an arrays holding IDs
         int[] swapNumber = {9472678, 9797480, 6432860, 9916931, 1854931, 3260505, 1433997, 6913520, 8474952, 8571084, 8282688, 9147876, 4162099, 5339002, 6588718, 2839571, 5087013, 4954474, 7742302, 8378820, 8859480, 7417500,
                              2743439, 5375408, 4089286, 1337865, 7201916, 7609764, 2166647, 7105784, 7898160, 1301459, 9701348, 6721256, 9051744, 4450495, 4473814, 9184282, 1662667, 3837297, 8703622, 3104647, 8511358, 3681439,
                              6780982, 2262779, 6817388, 8763348, 7705896, 1878251, 7970972, 2912383, 9088150, 1951063, 2972109, 2299185, 4317957, 7261642, 9820799, 2143327, 2395317, 4029561, 8126830, 7225236, 3320231, 3645033,
                              9280414, 1374271, 4702485, 6108058, 4281551, 9761074, 8932292, 9028424, 8740028, 9605216, 7009652, 8186556, 9436272, 3296911, 7934566, 7802028, 1589855, 8836160, 9316820, 7874840, 3200779, 8222962,
                              4546627, 4185418, 1049469, 8067104, 2623987, 9953338, 8355500, 1758799, 3548901, 9568810, 9509084, 7298048, 7321368, 3031835, 4510221, 6684850, 2551175, 5952200, 2358911, 6528992, 9628536, 2720119,
                              9664942, 9220688, 8163236, 2335591, 1818525, 5759936, 2935703, 4798617, 5819662, 5146738, 7165510, 1109195, 1278139, 4990881, 5242870, 6877114, 1974383, 7682576, 3777571, 6492586, 3127967, 4221825,
                              7550038, 8955612, 7129104, 3608627, 2779845, 2875977, 2587581, 3452769, 9857206, 8643896, 9893612, 6144464, 1782119, 8259368, 2047195, 2683713, 3164373, 1722393, 6048332, 2070515, 7394180, 4642759,
                              3897022, 1914657, 5471540, 3800890, 2203053, 4606353, 6396454, 3416363, 3356637, 1145601, 7778708, 3489175, 7357774, 9532404, 3008515, 8799754, 2816251, 9376546, 1085875, 5567672, 3512495, 3068241,
                              2010789, 5183144, 4666078, 8607490, 3393043, 7646170, 8667216, 7994292, 1013063, 1566535, 4125693, 7838434, 8090424, 9724667, 2431723, 1530129, 6625124, 9340140, 3585307, 7069378, 1397591, 9412952,
                              7586444, 4065967, 5627398, 5723530, 5435134, 6300322, 3704759, 2491449, 3741165, 8992018, 2239459, 2106921, 4894749, 5531266, 6011926, 4569946, 8895886, 2527855, 1241733, 7490312, 4354363, 4762210,
                              8319094, 4258231, 5050606, 7453906, 9244008, 3873703, 6204190, 3993154, 1626261, 6336728, 1205327, 9989744, 5856068, 2647307, 5663804, 3224099, 3933429, 8415226, 3969835, 5915794, 4858342, 8030698,
                              7513632, 2455043, 6240596, 1493723, 9124556, 8451632, 1470403, 4414089, 6973246, 1685987, 8547764, 1182007, 5279276, 4377682, 9472678, 9797480, 6432860, 9916931, 1854931, 3260505, 1433997, 6913520,
                              8474952, 8571084, 8282688, 9147876, 4162099, 5339002, 6588718, 2839571, 5087013, 4954474, 7742302, 8378820, 8859480, 7417500, 2743439, 5375408, 4089286, 1337865, 7201916, 7609764, 2166647, 7105784,
                              7898160, 1301459, 9701348, 6721256, 9051744, 4450495, 4473814, 9184282, 1662667, 3837297, 8703622, 3104647, 8511358, 3681439, 6780982, 2262779, 6817388, 8763348, 7705896, 1878251, 7970972, 2912383,
                              9088150, 1951063, 2972109, 2299185, 4317957, 7261642, 9820799, 2143327, 2395317, 4029561, 8126830, 7225236, 3320231, 3645033, 9280414, 1374271, 4702485, 6108058, 4281551, 9761074, 8932292, 9028424,
                              8740028, 9605216, 7009652, 8186556, 9436272, 3296911, 7934566, 7802028, 1589855, 8836160, 9316820, 7874840, 3200779, 8222962, 4546627, 4185418, 1049469, 8067104, 2623987, 9953338, 8355500, 1758799,
                              3548901, 9568810, 9509084, 7298048, 7321368, 3031835, 4510221, 6684850, 2551175, 5952200, 2358911, 6528992, 9628536, 2720119, 9664942, 9220688, 8163236, 2335591, 1818525, 5759936, 2935703, 4798617,
                              5819662, 5146738, 7165510, 1109195, 1278139, 4990881, 5242870, 6877114, 1974383, 7682576, 3777571, 6492586, 3127967, 4221825, 7550038, 8955612, 7129104, 3608627, 2779845, 2875977, 2587581, 3452769,
                              9857206, 8643896, 9893612, 6144464, 1782119, 8259368, 2047195, 2683713, 3164373, 1722393, 6048332, 2070515, 7394180, 4642759, 3897022, 1914657, 5471540, 3800890, 2203053, 4606353, 6396454, 3416363,
                              3356637, 1145601, 7778708, 3489175, 7357774, 9532404, 3008515, 8799754, 2816251, 9376546, 1085875, 5567672, 3512495, 3068241, 2010789, 5183144, 4666078, 8607490, 3393043, 7646170, 8667216, 7994292,
                              1013063, 1566535, 4125693, 7838434, 8090424, 9724667, 2431723, 1530129, 6625124, 9340140, 3585307, 7069378, 1397591, 9412952, 7586444, 4065967, 5627398, 5723530, 5435134, 6300322, 3704759, 2491449,
                              3741165, 8992018, 2239459, 2106921, 4894749, 5531266, 6011926, 4569946, 8895886, 2527855, 1241733, 7490312, 4354363, 4762210, 8319094, 4258231, 5050606, 7453906, 9244008, 3873703, 6204190, 3993154,
                              1626261, 6336728, 1205327, 9989744, 5856068, 2647307, 5663804, 3224099, 3933429, 8415226, 3969835, 5915794, 4858342, 8030698, 7513632, 2455043};
                           
         // Create a Scanner object to read input.         keyboard = new Scanner(System.in);

         //Variables
         int bub, sel, ins;

         
         //Get the Bubble sort
         bub = bubSort(swapNumber);
         
         // Get the Selection sort
         sel = selSort(swapNumber);
         
         // Get the Selection sort
         ins = insSort(swapNumber);
         
         //Display result
         System.out.println("The Bubble sorting did: " + bub + " counts");
         System.out.println("The Selection sorting did: " + sel + " counts");
         System.out.println("The Insertion sorting did: " + ins + " counts");
         }
         


         public static int bubSort(int[] array)
            {
               //Variables
               // Marks the last element to compare 
               int maxElement;
               // Index of an element to compare 
               int index;
               // Used to swap to elements 
               int temp;  
               
               // The outer loop positions maxElement at the last element 
               // to compare during each pass through the array. Initially 
               // maxElement is the index of the last element in the array.
               // During each iteration, it is decreased by one.  
               for (maxElement = array.length - 1; maxElement >= 0; maxElement--) 
               {
                  // The inner loop steps through the array, comparing
                  // each element with its neighbor. All of the elements
                  // from index 0 thrugh maxElement are involved in the
                  // comparison. If two elements are out of order, they
                  // are swapped.
                  for (index = 0; index <= maxElement - 1; index++) 
                  {
                     // Compare an element with its neighbor. 
                     if (array[index] > array[index + 1])
                     {
                        //Swaping elements
                        temp = array[index];
                        //countB++;
                        array[index] = array[index + 1];
                        array[index + 1] = temp;
                        countB++;
                     }
                   }
                   
                }
                return countB;
            }
             
                
                
         public static int selSort(int[] array)
            {
               // Starting position of the scan 
               int startScan;
               // To hold a subscript value 
               int index;
               // Element with smallest value in the scan 
               int minIndex;
               // The smallest value found in the scan 
               int minValue;
               
               // The outer loop iterates once for each element in the
               // array. The startScan variable marks the position where
               // the scan should begin.
        for (startScan = 0; startScan < (array.length-1); startScan++) 
               {
                  // Assume the first element in the scannable area
                  // is the smallest value.
                  minIndex = startScan;
                  minValue = array[startScan]; 
                  
                  // Scan the array, starting at the 2nd element in
                  // the scannable area. We are looking for the smallest
                  // value in the scannable area.
                  for(index = startScan + 1; index  < array.length; index++)
                  {
                     if (array[index] < minValue)
                     {
                        minValue = array[index];
                        minIndex = index;
                        //countS++;
                     }
                  }
                  //Swap the element with the smallest value 
                  // with the first element in the scannable area. 
                  array[minIndex] = array[startScan];
                  array[startScan] = minValue; 
                  countS++;
               }
               return countS;
            }
            
            
         public static int insSort(int[] array)
            {
               // The first unsorted value 
               int unsortedValue;
               //Used to scan the array 
               int scan;
               
               // The outer loop steps the index variable through
               // each subscript in the array, starting at 1. This
               // is because element 0 is considered already sorted.
               for (int index = 1; index < array.length; index++) 
               {
                  // The first element outside the sorted subset is
                  // array[index]. Store the value of this element
                  // in unsortedValue.
                  unsortedValue = array[index];
                  
                  // Start scan at the subscript of the first element
                  // outside the sorted subset.
                  scan = index;
                  
                  // Move the first element outside the sorted subset
                  // into its proper position within the sorted subset. 
                  while (scan > 0 && array[scan-1] > unsortedValue) 
                  {
                     array[scan] = array[scan - 1];
                     //countI++;
                     scan--;
                     //countI++;
                  }
                  
                  // Insert the unsorted value in its proper position
                  // within the sorted subset.
                  array[scan] = unsortedValue; 
                  countI++;
               }
               return countI;
            }
   }
