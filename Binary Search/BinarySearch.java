// ----------------------------------------------------------------------------
// SCI 199Y  "Great Ideas in Computing"  Assignment 2
//
// BinarySearch:  implements a simple command-prompt interface used to test
// a binary search routine on a choice of arrays of integers.
//
// On Unix:
//   to compile:  % javac BinarySearch.java
//   to run:      % java BinarySearch
//
// ----------------------------------------------------------------------------
import java.io.*;

class BinarySearch {

    // ------------------------------------------------------------------------
    // This is the main routine of the program, which is executed when the
    // program is started by entering "java BinarySearch" at the command
    // prompt.
    // 
    // ***** DO NOT MODIFY THIS ROUTINE ***************************************
    //
    // ------------------------------------------------------------------------
    public static void main (String args[]) throws IOException {

	// --------------------------------------------------------------------
	// Here are some utilities that Java uses to handle interaction with
	// a user using a keyboard.
	// --------------------------------------------------------------------
	BufferedReader input = 
	    new BufferedReader(new InputStreamReader(System.in));

	// --------------------------------------------------------------------
	// Here are the arrays we will use to test if the binary search 
	// procedure is working correctly.
	// --------------------------------------------------------------------
	int[] set1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int[] set2 = { 2, 2, 2, 2, 13, 23, 23, 25, 25, 25, 25, 25, 60 };
	int[] set3 = { 4 };

	// --------------------------------------------------------------------
	// We ask this user if we should perform a test.  If the user answers
	// "yes" or "y", we will proceed.  If the user answers anything else
	// we exit this program.
	// --------------------------------------------------------------------
	while(true) {

	    String element = new String();
	    int elementValue;

	    System.out.print("\nWould you like to perform a test? (y/n):  ");
	    String firstAnswer = input.readLine();

	    // ----------------------------------------------------------------
	    // firstAnswer is NOT equal to "yes" and NOT equal to "y",
	    // so we exit the program.
	    // ----------------------------------------------------------------
	    if( ! firstAnswer.equalsIgnoreCase("yes") &&
	        ! firstAnswer.equalsIgnoreCase("y"))
		break;

	    // ----------------------------------------------------------------
	    // Print out the arrays of numbers that the user can test binary
	    // searching on.
	    // ----------------------------------------------------------------
	    System.out.println
		("\nYou may choose from the following test sets:");
	    System.out.print("    1: ");  printArray(set1);
	    System.out.print("    2: ");  printArray(set2);
	    System.out.print("    3: ");  printArray(set3);

	    // ----------------------------------------------------------------
	    // Ask the user to pick a test set.
	    // ----------------------------------------------------------------
	    System.out.print("\nSelect a test set (1/2/3):  ");
	    int setNumber = Integer.parseInt(input.readLine());
	    System.out.println("You have chosen test set " + setNumber);
	    
	    // ----------------------------------------------------------------
	    // Ask the user to enter a value to search for in the test set.
	    // ----------------------------------------------------------------
	    System.out.print("\nEnter a value to search for:  ");
	    int searchElement = Integer.parseInt(input.readLine());

	    // ----------------------------------------------------------------
	    // Next, we call binary search to look for the searchElement
	    // the user wants to find, in the given test set.
	    // ----------------------------------------------------------------

	    int index = -1;  // This index variable will store the answer given
	                     // by binary search, that is, it will tell the 
	                     // location of the searchElement in the set.  It
	                     // will equal -1 if the element was not found.
	    
	    switch(setNumber) {
	    case 1:
		index = binarySearch(set1,searchElement,0,set1.length-1);
		break;
	    case 2:
		index = binarySearch(set2,searchElement,0,set2.length-1);
		break;
	    case 3:
		index = binarySearch(set3,searchElement,0,set3.length-1);
		break;
	    default:
		System.out.println("Invalid set number selected! Try again.");
	    }

	    // ----------------------------------------------------------------
	    // Report the result of the binary search operation.
	    // ----------------------------------------------------------------
	    if(index > -1)
		System.out.println("\nSearch element " + searchElement + 
				   " was found at location " + index);
	    else
		System.out.println("\nSearch element " + searchElement +
				   " was NOT FOUND!");

	}
	System.out.println();
    }
    // --end-of-main-routine---------------------------------------------------

    // ------------------------------------------------------------------------
    // This routine is used to print an array of integers to the screen.
    // 
    // ***** DO NOT MODIFY THIS ROUTINE ***************************************
    //
    // ------------------------------------------------------------------------
    public static void printArray(int[] array) {
	System.out.print(" [ ");
	for(int i=0; i<array.length; i++)
	    System.out.print(array[i] + " ");
	System.out.println("]");
    }
    // --end-of-printArray-routine---------------------------------------------
    
    // ------------------------------------------------------------------------
    // THE ROUTINE BELOW IS WHERE YOU SHOULD FILL IN CODE FOR BINARY SEARCH
    //
    // The arguments to this routine are:
    //     array -- the collection through which we are searching,
    //              with elements indexed starting from 0
    //     key   -- the value we are searching for
    //     first -- the index of the first element in the array
    //     last  -- the index of the last element in the array
    //
    // *** You should modify binarySearch so that it fulfills the following
    // requirements:
    //
    // binarySearch should return an integer such that:
    //    if the key value is NOT in the array, -1 is returned
    //      OR
    //    if the key value WAS FOUND, the LARGEST index of the matching 
    //    element in the array is returned
    //
    // (This current version which you are going to modify actually returns
    //  the *smallest* index of the matching element, if it exists in the
    //  array.)
    //
    // ------------------------------------------------------------------------
    public static int binarySearch(int[] array, int key, int first, int last) {

	// ********** MODIFY CODE HERE ******************

	// Allocate an integer to keep track of the "middle" position.
	int middle;

	// A variable to indicate the position of the element if found.
	int position;

	while (first != last) {

	   // Determine the middle between the "first" and "last" pointers.
     	   middle = (first + last) / 2;
	
           // If the search key is equal to or smaller than the
	   // element at the middle, reset the "last" pointer to be at the
	   // middle element.
           if (key <= array[middle])
	   	last = middle;

	   // Otherwise, the search key is greater than the element at the 
	   // middle, so we reset the "first" pointer to be the element 
           // after the middle.
           else
	   	first = middle + 1;

	} // while loop ends here

	// If the key exists in the array, its position should be given
	// by the "first" pointer.
	position = first;

	// The matching element was found, return its position.
	if(array[position] == key) {
	   return position;
	}	
	// The matching element was not found, so return the value -1.
	else {
	   return -1;
	}

	// ********** END MODIFICATIONS HERE *************

    } // --end-of-binarySearch-routine-----------------------------------------

}


