/**
 * LetterGradeApp
 * Extension of the in-class exercise asking user for assignment
 * grades and printing out the letter grades
 * <p>
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
    }

    /**
     * Given an integer grade, return the letter grade of
     * either A, B, C, D, or F
     *
     * @param grade the integer value of the grade
     * @return the letter grade of the input grade integer
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


}