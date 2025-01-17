/**
 * @author James
 * This file demonstrates printing of various types
 */

// Scanner is from the Java library
// some things like System.out.print are also from Java library but we get them
// by default for the others we need to specifically import them
import java.util.Scanner;

// classes are containers for a portion of a design
public class Main {
    /*
        Example of a block comment
        This is the main method
        It is where our program begins
     */
    public static void main(String[] args) {
        // Example of a single line comment
        System.out.print("Hello, World! ");
        System.out.println("Next line");

        // printing 5 and 6 to demonstrate printing literals
        System.out.println(5);
        System.out.println(6);

        // this prints out 7.5
        System.out.println(7.5);

        // prints c
        System.out.println('c');

        int myInteger; // declare an integer variable named myInteger
        myInteger = -54321; // assign the value of -54321 to myInteger

        int anotherInteger;
        anotherInteger = myInteger; // we can assign a variable the value of another variable

        double myDouble = 0.0;  // declaring a double variable and assigning it
                                // the value of 0.0

        char myChar = 'c';  // declare a character variable
                            // characters have single quotes '
                            // strings have double quotes "

        // myChar = myDouble; // can't do this types must match
        // myChar = 97; // can we do this? uncomment and print out myChar

        // input is an object
        // input's type is Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Type a line: ");
        // nextLine() reads an entire line of text up until you press the enter key
        String answer = input.nextLine();

        System.out.println("Type an integer: ");
        // you can read specific data types with methods like nextInt(), nextDouble(),
        int intAnswer = input.nextInt();

        System.out.println(answer);
        System.out.println(intAnswer);

        // printf prints a formatted string
        // the %f means we want to print the number after the comma 3.14159
        // the .2 means we want exactly two numbers after the decimal point
        // if we say .3, the value will be round up to 3.142
        System.out.printf("Pi starts with %.2f\n", 3.14159);

        // the \ is called the escape character
        // some characters like ", ', and even \ have a special meaning so to
        // print them, we need to tell our program to treat those characters
        // like they are normal
        // \n is useful if you want to print a new line (like we did above with printf)
        char slash = '\"';
        System.out.println("\"");
    }
}