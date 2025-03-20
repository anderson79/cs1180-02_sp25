/**
 * CS 1180
 * Example code for using arrays from in-class
 * 3/13/2025
 */

import java.util.Arrays;
import java.util.Scanner;

// myProg.exe option

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        arrayBasics();
//        arrayInitialization();
//        findMaxInArray();
//        accessArrayOutOfBounds();

        // input as array size
        //inputArraySize(input);

        arraysAsObjects();

        // useful array methods

        // pass array to method - reference

        // return array from method

        // resize array

        // array of Strings/objects

        // shuffle array elements

        // multiple arrays

        // multidimensional array

        // ArrayList
        doubleTheNums(5.0, 4);
    }

    public static void doubleTheNums(double start, int num) {
        // make array
        double[] myArray;
        myArray = new double[num];

        // put start at beginning of array
        myArray[0] = start;

        // loop through array starting at index 1
        for (int i = 1; i < num; i++) {
            // get element at index i - 1
            double previous = myArray[i - 1];
            // multiply by two

            double doubled = previous * 2;

            // put that into index (i)
            myArray[i] = doubled;
        }

        System.out.println(Arrays.toString(myArray));
    }

    public static void inputArraySize(Scanner input) {
        System.out.println("Enter how big your array will be ");
        int size;
        size = input.nextInt();

        char[] myArray;
        myArray = new char[size];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (char) ('a' + i);
        }
        System.out.println();
    }

    public static void arrayBasics() {

        // array declaration
        // syntax is
        //type[] arrayName;
        int[] nums;

        // we have to now create the array by saying how many elements we want it to hold
        // all the elements will have a default value, for ints that is 0
        // once we create this array, it's size will always be 5
        nums = new int[8531];

        // the array variable is a reference, so when we print it we get a memory address
        System.out.println(nums);

        // assign a value to the element at index 2 in the array
        nums[2] = 10;

        // access elements with nums[index]
        System.out.println("nums[0] " + nums[0]);
        System.out.println("nums[1] " + nums[1]);
        System.out.println("nums[2] " + nums[2]);
        System.out.println("nums[3] " + nums[3]);
        System.out.println("nums[4] " + nums[4]);

        // use expression for index
        // the index can be a variable
        int index = 3;
        System.out.println("Element at index " + index + " is " + nums[index]);
        System.out.println();

        // array.length will give us the size of the array
        // we can use that when looping through the entire array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (1 + i) * 10;
            System.out.println("Element at index " + i + " is " + nums[i]);
        }
    }

    public static void arrayInitialization() {
        // array initialization
        // if I know what values I want I can create the array with them initially
        int[] initVals = {4, 16, 15, 8, 42, 23};
        for (int i = 0; i < initVals.length; i++) {
            initVals[i] = initVals[i] * 2;
            System.out.print(initVals[i] + " ");
        }
        System.out.println();
    }

    // algorithm for finding the maximum value in an array
    // some other practice problems for looping through arrays
    // count negatives
    // compute sum
    public static void findMaxInArray() {
        int[] initVals = {4, 16, 15, 8, 42, 23};

        int max = initVals[0];

        // find maximum in array
        for (int i = 0; i < initVals.length; i++) {
            if (max < initVals[i]) {
                max = initVals[i];
            }
        }
        System.out.println("max: " + max);
    }

    // if I try to access the array with an index that is not in-bounds
    // an exception is thrown
    public static void accessArrayOutOfBounds() {
        int[] initVals = {4, 16, 15, 8, 42, 23};
        // accessing out-of-bounds
        System.out.println(initVals[6]);
    }

    // in this case, both initVals and anotherArray
    // are  both referencing the same array
    public static void arraysAsObjects() {
        int[] initVals = {4, 16, 15, 8, 42, 23};
        int[] anotherArray = initVals.clone();

        boolean same = Arrays.equals(initVals, anotherArray);
        System.out.println("same: " + same);

        Arrays.sort(initVals);
        System.out.println(Arrays.toString(initVals));
        same = Arrays.equals(initVals, anotherArray);
        System.out.println("same: " + same);

        anotherArray[2] = 1;
        System.out.println(initVals[2]);
        same = Arrays.equals(initVals, anotherArray);

        System.out.println("same: " + same);

        String initValsStr = Arrays.toString(initVals);
        System.out.println(initValsStr);
    }

}