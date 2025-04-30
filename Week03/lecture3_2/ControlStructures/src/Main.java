/**
 * CS 1180
 * 30 Jan 2025
 * In-class code examples
 *
 * The first part of this code is demonstrating the String.valueOf method
 * The second part demonstrates comparison operators
 * The final part demonstrates if/else if/else statements
 *
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // we've seen we can call some methods with the class name
        // we've done that with Math and System
        double rounded = Math.round(2.9);

        // there are some methods we can call using the String class
        String test = String.valueOf(true);
        System.out.println(test);
        // valueOf can also be called with a String object, but it's better to just use String.valueOf
        test = test.valueOf(9.2);
        System.out.println(test);

        int anInt = 5;
        System.out.println(String.valueOf(anInt));

        // comparison operators
        /// /////////////////////////////
        int i = 9;
        int j = 9;
//
        boolean isTrue = i <= j; // comparators like <, <=, >, >=, ==, and != give us a boolean true or false
        System.out.println(isTrue);
        isTrue = true;
        isTrue = false;

        // just like we can print out the result of 1 + 2 which is an int, we can print the result of a comparison
        // this is mostly for demonstration, you typically want to use the result of an addition or comparison
        System.out.println(1 + 2);
        System.out.println(i >= j);
        System.out.println(i == j);
        System.out.println(i != j);

        // I can compare characters
        // lower case 'c' is not the same as upper case 'C'
        char c1 = 'c';
        char c2 = 'C';

        System.out.println(c1 == c2);
        System.out.println(c1 < c2);

        // 'a' and 'b' aren't the same, and it turns out 'a' is less than 'b'
        c1 = 'a';
        c2 = 'b';
        System.out.println(c1 == c2);
        System.out.println(c1 < c2);


        // if statements
        /// ////////////////////

        int age = 15;
        boolean hasLicense = false;
        boolean hasPermit = false;

        if (age < 16)
        {// we can nest if statements, or put any code we want in between the curly braces
            if (hasPermit == true) {
                System.out.println("You can drive with a permit");
            }
            else {
                System.out.println("Too young to drive!");
            }
        }
        else if (hasLicense == false)
        { // only if the condition in the if fails, we will check hasLicense
            // we can have several else if conditions
            System.out.println("Can't drive without a license");
        }
        else
        {   // if both conditions in the if and else if are fails, the code inside the else will run
            // it's not necessary to have an else, we could have just an if, just if and some else if's
            // but we cannot have an else or else if without first having an if
            // also we can only have one else, since that is what we do when all the other conditions are false
            System.out.println("Old enough to drive");
        }

        boolean oldEnough = age < 16; // comparisons like less than, greater than, etc. return a boolean true or false
        // if (oldEnough)   // you can use a boolean variable as the condition for an if
                            // typically it's easier to just do the comparison inside the parentheses like we do above

    }
}