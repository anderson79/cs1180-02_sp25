/**
 * For loop examples
 *
 * Examples for the plus-equals, minus-equals, increment and decrement operators
 * Simple example of for loops and nested loops
 * There's also an example of generating random numbers at the end
 */

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int counter = 0;
        System.out.println("initial counter: " + counter);
        //counter = counter + 1;
        counter += 1; // plus-equals operator, add one to counter
        System.out.println("counter += 1: " + counter);

        counter += 10; // add ten to counter
        System.out.println("counter += 10; " + counter);

        counter -= 3; // minus equals operator
        System.out.println("counter -= 3: " + counter);

        int before = counter++; // increment counter (post-increment) // counter = counter + 1
        System.out.println("counter: " + counter);
        System.out.println("before = counter++: " + before);

        int after = ++counter; // pre-increment
        System.out.println("counter: " + counter);
        System.out.println("after = ++counter: " + after);

        // this will print counter, then subtract one from counter
        System.out.println("counter--" + counter--);
        // print out the updated value of counter
        System.out.println("counter: " + counter);

        // this will subtract one from counter, print out the updated value
        System.out.println("--counter: " + --counter);
        // print out the updated value of counter
        System.out.println("counter: " + counter);

        // comparing a while-loop to a for-loop
        System.out.println();
        System.out.println("While loop printing 0 to 4:");

        int whileCounter = 0; // initialization
        while (whileCounter < 5) { // condition
            System.out.println(whileCounter); // statements to execute
            whileCounter++; // update
        }

        System.out.println();
        System.out.println("For loop printing 0 to 4");
     // for (initialization;     condition;      update)
        for (int forCounter = 0; forCounter < 5; forCounter++){
            System.out.println(forCounter); // statements to execute
        }

        System.out.println();
        System.out.println("For loop: count down from 5 to 1");
        // loop to count down from 5 to 1
        for (int forCounter = 5; forCounter > 0; forCounter--){
            System.out.println(forCounter);
        }

        // nested loops
        for (int i = 0; i < 15; i++) {
            System.out.println("Outer loop before inner: i = " + i);
            for (int j = 0; j < i; j++) {
                System.out.println("Inner loop: j = " + j);
              }
            System.out.println("Outer loop after inner: i = " + i);
            System.out.println();
        }

        // how many times does the inner loop run each time?
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // example for generating random numbers
        // generates 10 rando numbers between 0-4
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            // get a random number 0-4, excluding 5
            int myRando = rand.nextInt(0, 5);
            System.out.print(myRando);
            if (myRando == 0) {
                System.out.println(": You win!");
            } else {
                System.out.println(": Better luck next time!");
            }
        }
    }
}