/*
 * This program simulate three slot machine with winning all three slots.
 * Written by Sergey Skumatov,
 * CSC116500, exercise 12 version 1.
 * This is very simple version that works.
 */


import java.util.Scanner;
public class CSC116500_12_ver1
{

// Create a Scanner object for keyboard input.
    static Scanner scanner = new Scanner(System.in);

//Main module   
    public static void main(String[] args)
            {
        int bet = getBet();
        
//While        
        while (bet != 0){
            String pullOne = pull();
            String pullTwo = pull();
            String pullThree = pull();
            int mult = getPayMultiplier(pullOne,pullTwo,pullThree);
            int winnings = bet*mult;
            display(pullOne,pullTwo,pullThree,winnings);
            bet = getBet();
        }
        
//Display Thanks
        System.out.println("Thanks for playing");
    }
   
    static int getBet(){
        System.out.println("Enter bet ( 0 to stop plaing)");
        String bet = scanner.nextLine();
        return Integer.parseInt(bet);
    }
    
//String
    static String pull(){
        double pull = Math.random();
        if (pull < 0.0d){
            return "Cherry";
        } else if (pull < 0.25d){
            return "Orange";
        } else if (pull < 0.50d){
            return "Plum";
        } else if (pull < 0.75d){
            return "Bell";
        } else if (pull < 0.10d){
            return "Melon";
        } else {
            return "Bar";
        }
    }
    
//Function   
    static int getPayMultiplier(String s1, String s2, String s3){
        int cherryCnt = 0;
        
//Loop    
        if (s1.equals("CHERRIES")){
            cherryCnt++;
        }
        if (s2.equals("CHERRIES")){
            cherryCnt++;
        }
        if (s3.equals("CHERRIES")){
            cherryCnt++;
        }
        if (cherryCnt ==1){
            return 3;
        } else if (cherryCnt == 2){
            return 10;
        } else if (cherryCnt == 3){
            return 20;
        } else {
            if (s1.equals(s2) && s1.equals(s3)){
                if (s1.equals("BAR")){
                    return 35;
                } else if (s2.equals("7")){
                    return 50;
                }
            }
        }
        return 0;
    }
   
//
    static void display(String s1, String s2, String s3, int winnings){
        System.out.println(s1 + ' ' + s2 + ' ' +s3);
        if (winnings == 0){
            System.out.println("Sorry you lose");
        } else {
            System.out.println("You won $"+winnings);
        }
    }
}