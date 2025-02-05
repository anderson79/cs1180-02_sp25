/**
 * In-class code from 2/4/2025
 *
 * My partial solution of in-class activity printing letter grades
 * Introduction to logical operators
 * How to compare strings
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // my partial solution to the in class activity
        // which asks for a grade 0-100 and prints out the letter grade
        System.out.print("Enter your grade: (0-100): ");
        int grade = input.nextInt();

        // these two if's check if the grade is out of range
        if (grade > 100) {
            System.out.println("Max grade is only 100");
        }
        if (grade < 0) {
            System.out.println("grade can't be negative");
        }

        // I can say grade > 89
        // It's the same as grade >= 90
        if (grade > 89) {
            System.out.println('A');
        } else if (grade > 79) {
            System.out.println('B');
        } else if (grade >= 70) {
            System.out.println('C');
        } else if (grade >= 60) {
            System.out.println('D');
        } else { // I've exhausted all other possibilities, grade must be 'F'
            System.out.println('F');
        }

        // demo of conditionals combined with logical operators
        int x = 15;
        int y = 15;
        int z = 6;

        System.out.println((x > y) && (y > z));     // false and true == false
        System.out.println((x > y && y > z));       // same as above, > takes precedence over &&
        System.out.println(((x > y) || (y > z)));   // false or true == true
        System.out.println(!(x == 4));              // !(false) == true
        System.out.println(!(x < y));               // !(false) == true
        System.out.println(!(!(x < y)));            // !(!(false)) == false


        // string comparisons are different than ints and other primitives
        String s1 = "hello";
        String s2 = input.nextLine();
        System.out.println(s1 == s2);
        // to check if two strings are the same value we use the equals() method
        System.out.println(s1.equals(s2));

    }
}