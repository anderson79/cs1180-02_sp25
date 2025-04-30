/**
 * Code from class examples for lecture4_2
 * Examples of casting int to double and integer division
 * My solution for the in-class calculator exercise
 * Example of a while loop
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // examples of casting
        int anInt = (int)9.8; // int: 32-bit double: 64-bit
        System.out.println(anInt);

        double aDouble = anInt;
        System.out.println(aDouble);

        int anotherInt = 2;
        aDouble = anInt / (double) anotherInt;
        System.out.println(aDouble);

        // calculator in class exercise
        int first = 4;
        int second = 412;
        String operator = "+";

        System.out.println("Enter an addition or subtraction problem: ");
        first = input.nextInt();
        operator = input.next();
        second = input.nextInt();

        System.out.println("first: " + first);
        System.out.println("operator: " + operator);
        System.out.println("second: " + second);

        if ((first < 0) || (second < 0)) {
            System.out.println("Cannot do that operation");
        } else if ((first >= 100) || (second >= 100)) {
            System.out.println("Cannot do that operation");
        } else if (operator.equals("+")) {
            System.out.println("Addition Result: " + (first + second));
        } else if (operator.equals("-")) {
            System.out.println("Subtraction Result: " + (first - second));
        }

        // while loop
        // the loop runs as long as the condition is true
        // and stops once the condition is false
        int num = 0;
        while (num < 5) {
            System.out.println("num: " + num);
            num = num + 1;
        }

        System.out.println("after while loop num: " + num);
    }
}