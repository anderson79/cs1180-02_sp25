/**
 * LetterGradeApp
 * Extension of the in-class exercise asking user for assignment
 * grades and printing out the letter grades
 *
 * The methods have examples of JavaDoc, which can be auto-generated
 * if you type /** then press enter
 */

import java.util.Scanner;


public class LetterGradeApp {
    // our methods go inside of this class
    // typically you have the main method first
    // and the others below
    // but the order they are in does not matter

    /**
     * main method where the program begins
     *
     * @param args arguments passed into the program
     */
    public static void main(String[] args) {
        // example of calling the sum method
        int num1 = 4;
        int num2 = 8;
        int sumResult = sum(num1, num2);
        System.out.println("sumResult: " + sumResult);

        // start of the LetterGradeApp
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your grade for the first assignment: (0-100): ");
        int inputGrade1 = input.nextInt();
        System.out.print("Enter your grade for the second assignment: (0-100): ");
        int inputGrade2 = input.nextInt();
        System.out.print("Enter your grade for the third assignment: (0-100): ");
        int inputGrade3 = input.nextInt();

        char letterGrade1 = intGradeToLetterGrade(inputGrade1);
        char letterGrade2 = intGradeToLetterGrade(inputGrade2);
        char letterGrade3 = intGradeToLetterGrade(inputGrade3);

        System.out.println("Letter grade for " + inputGrade1 + ": " + letterGrade1);
        System.out.println("Letter grade for " + inputGrade2 + ": " + letterGrade2);
        System.out.println("Letter grade for " + inputGrade3 + ": " + letterGrade3);

        // method overloads
        double absOf = Math.abs(15.6);
        double anotherAbs = Math.abs(-2);

        String javaDocTestResult = javaDocTest(9.8);

        int castTest = 9;
        int anotherTest = testMethod(9, castTest);
    }

    /**
     * Given an integer grade, return the letter grade of
     * either A, B, C, D, or F
     *
     * @param grade the integer value of the grade
     * @return the letter grade as a char of the input grade integer
     */
    public static char intGradeToLetterGrade(int grade) {
        char result = 'F';
        if (grade > 89) {
            result = 'A';
        } else if (grade > 79) {
            result = 'B';
        } else if (grade >= 70) {
            result = 'C';
        } else if (grade >= 60) {
            result = 'D';
        }
        // since result is set to 'F' by default, if none of the other conditions were met
        // we don't need to set result to 'F' in an else
//        } else { // I've exhausted all other possibilities, grade must be 'F'
//            //System.out.println('F');
//        }
        return result;
    }

    /**
     * calculate the sum of two numbers
     *
     * @param num1 first integer to be summed
     * @param num2 second integer to be summed
     * @return the sum of num1 and num2
     */
    public static int sum(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    /**
     * calculate the difference of two numbers
     *
     * @param num1 the number to subtract from
     * @param num2 the amount to subtract
     * @return the difference of num1 and num2
     */
    public static int diff(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    /**
     * calculate the difference of two numbers
     *
     * @param num1 the number to subtract from
     * @param num2 the amount to subtract
     * @return the difference of num1 and num2
     */
    public static double diff(double num1, int num2) {
        double result = num1 - num2;
        return result;
    }

    /**
     * javaDocTests takes a double value and returns a string
     * stating what the value is
     *
     * @param theValue double to be added to a string
     * @return a String like: "The value is: " + the value
     */
    public static String javaDocTest(double theValue) {
        String result = ""; // method stub
        if (result.equals("hello")) {
            int j = 10;
            if (true) {
                j = 9;
            }
            System.out.println(result);
        }
        //System.out.println(j);
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println(i);
        return result;
    }

    /**
     * scopeTest demonstrates how variables can be accessed and where they are out of scope
     *
     * @param param param is local to scopeTest, it cannot be accessed outside this method
     */
    public static void scopeTest(int param) {
        String result = ""; // result is local to scopeTest, it can be used anywhere in this method
        if (result.equals("hello")) {
            int j = 10; // j cannot be accessed outisde of this if
            if (true) {
                j = 9; // this if is within the scope of the outer if, so can access j
            }
            System.out.println(result);
        }
        //System.out.println(j); // cannot access j from here
        int i; // can declare loop counter outside of for loop
        for (i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println(i); // because i was created outside of for loop, can access outside loop
    }

    /**
     * example of method overloading
     * both methods are named testMethod, but they take different parameters
     * they can also take different numbers of parameters
     *
     * @param i integer, first parameter
     * @param j double, second parameter
     * @return methods cannot be overloaded based soley on return type
     */
    public static int testMethod(int i, double j) {
        return i;
    }

    /**
     * second overload of testMethod takes one double parameter
     *
     * @param i double, single parameter
     * @return double, if both test methods took the same type parameters
     * they cannot be distinguished soley on return type
     */
    public static double testMethod(double i) {
        return i;
    }

}