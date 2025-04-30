/**
 * In-class examples from 2/11/2025
 * CS 1180
 *
 * This file has examples for while loops including
 * off-by-one errors, do-while loops, and using while
 * loops to validate user input
 */

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int myInt;// = input.nextInt();

        // if myInt is 1, this loop will run forever
//        while (myInt == 1) {
//            System.out.println("In the while loop");
//        }

        myInt = 0;
        // print what myInt is before the if statement
        System.out.println("myInt: " + myInt);
        if (myInt < 10) {
            myInt = 5;
        }
        // myInt should be 5, it was changed in the if
        System.out.println("myInt: " + myInt);
        System.out.println();

        // if we want to show the numbers 1, 2, 3, 4, 5, this will result in
        // an off by one error
        myInt = 0;
        while (myInt <= 5) {
            myInt = myInt + 1;
            System.out.println("myInt: " + myInt);
        }

        System.out.println("After while myInt is: " + myInt);
        System.out.println();

        // do-while will run the code at least once before checking condition
        // for do-while, we need do before the curly braces
        // then while(condition); after
        // the regular while loop does not need the 'do' only the do-while
        //myInt = 0;
        do {
            myInt = myInt + 1;
            System.out.println("myInt: " + myInt);
        } while (myInt < 5);
        System.out.println("After do-while myInt is: " + myInt);

        // do-while can be used to validate user input
        // say we want the user to input an integer but
        // need to check if they don't enter an integer
        // the do-while will always prompt at least once
        // then if the input is not valid, prompt again
        boolean validInput = false;
        do {
            System.out.println("Enter an integer: ");
            if (input.hasNextInt()) { // check if input is valid, this doesn't get the input yet
                myInt = input.nextInt(); // if next is an int, now we can get it
                validInput = true; // setting validInput to true will end the loop
            } else {
                // since validInput is set to false above, if we don't change it here
                // the loop will run again asking for input
                System.out.println("invalid input");
                input.nextLine(); // we need to get the invalid input and ignore it
                                    // otherwise the input is still there
            }
            // when the user inputs a valid int, validInput will be set to true and the loop exits
        } while (validInput == false);
        System.out.println("You entered: " + myInt);
    }
}