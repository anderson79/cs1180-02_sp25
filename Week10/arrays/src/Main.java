/**
 * CS 1180
 * Example code for using arrays from in-class
 * 3/25/2025
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// myProg.exe option

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

//        arrayBasics();
//        arrayInitialization();
//        findMaxInArray();
//        accessArrayOutOfBounds();

        // input as array size
        //inputArraySize(input);

        // useful array methods
        // arraysAsObjects();

        // in-class activity
        // doubleTheNums(9.0, 6);

        // forEachLoop();

        // pass array to method - reference
        //char[] myChars = {'a', 'e', 'i', 'o', 'u'};
        //System.out.println(Arrays.toString(myChars));
        //passingArray(myChars);
        //System.out.println(Arrays.toString(myChars));
//        char[] returnResult = returnArray(myChars);
//
//        System.out.println(Arrays.toString(myChars));
//        System.out.println(Arrays.toString(returnResult));

        // ArrayList
        // arrayListDemo();
        // readFileToArrayList();
        //arrayListInteger();

        // array of Strings/objects
        // resize array
        // stringArray();

        // shuffle array elements
        // shuffleString();

        // multidimensional array
        multiArray();
        // multiple arrays
    }

    /**
     * Example of a 2-dimension array
     */
    public static void multiArray() {
        double[][] myArray = new double[4][2];
        myArray[2][1] = 100.0;

        for (int i = 0; i < myArray.length; i++) {
            // System.out.println(Arrays.toString(myArray[i]));
            for (int j = 0; j < myArray[i].length; j++) {
                //System.out.print(myArray[i][j] + " ");
                myArray[i][j] = 5.0 + i + j;
            }
            System.out.println(Arrays.toString(myArray[i]));
            //System.out.println();
        }

        //System.out.println(Arrays.toString(myArray));
    }

    /**
     * Code for shuffling a string
     */
    public static void shuffleString() {
        String original = "abcdefg";
        char[] charArray = original.toCharArray();

        System.out.println(Arrays.toString(charArray));

        boolean isShuffled = false;
        Random rng = new Random();
        int numSwaps = 7;

        while (!isShuffled) {
            int firstIdx = Math.abs(rng.nextInt()) % charArray.length;
            int secondIdx = Math.abs(rng.nextInt()) % charArray.length;
//            System.out.println(firstIdx);
//            System.out.println(secondIdx);

            if (firstIdx != secondIdx) {
                char first = charArray[firstIdx];
                char second = charArray[secondIdx];
                // swap
                charArray[secondIdx] = first;
                charArray[firstIdx] = second;
                numSwaps--;
                if (numSwaps <= 0) {
                    isShuffled = true;
                }
            }

        }
        System.out.println(Arrays.toString(charArray));

        String result = String.valueOf(charArray);
        System.out.println(result);

        for (char c : result.toCharArray()) {
            System.out.print(c + "      ");
        }
    }

    /**
     * example of using an array of Strings
     */
    public static void stringArray() {
        String[] strings = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        //strings = new String[5];
        strings[1] = "ninety";
        int aLength = strings[0].length();
        System.out.println(aLength);
        System.out.println(Arrays.toString(strings));

        String[] resized = doubleArraySize(strings);
        System.out.println(Arrays.toString(resized));

        strings = resized;

        resized[3] = "twelve";

        System.out.println(Arrays.toString(strings));
    }

    /**
     * example of doubling the size of an array by creating a new array
     * and copying everything from the original into the new array
     *
     * @param originalArray the array to be copied from
     * @return a String array with space for twice as many Strings as originalArray
     * with all of the Strings from originalArray copied into the new array
     */
    public static String[] doubleArraySize(String[] originalArray) {
        String[] resized = new String[originalArray.length * 2];
        System.out.println(Arrays.toString(resized));
        for (int i = 0; i < originalArray.length; i++) {
            resized[i] = originalArray[i];
        }
        return resized;
    }

    /**
     * Reads all the words from "words.txt" into an ArrayList
     *
     * @throws FileNotFoundException make sure "words.txt" is in the root
     *                               directory of your project, not in the src directory
     */
    public static void readFileToArrayList() throws FileNotFoundException {
        ArrayList<String> strings;
        strings = new ArrayList<>();
        File wordFile = new File("words.txt");
        Scanner wordScan = new Scanner(wordFile);

        while (wordScan.hasNext()) {
            String nextWord = wordScan.next();
            strings.add(nextWord);
        }

        System.out.println(strings);
        System.out.println(strings.size());
    }

    /**
     * Examples of various ArrayList methods
     */
    public static void arrayListDemo() {
        ArrayList<String> strings;
        strings = new ArrayList<>();

        // add(element) appends the element to the end of the list
        strings.add("one");
        strings.add("two");
        strings.add("three");

        System.out.println(strings);

        // add(index, element) inserts the element at the index and pushes
        // everything else in the list down one slot
        strings.add(1, "four");
        System.out.println(strings);

        // set(index, element) modifies the element at the given index
        strings.set(2, "five");
        System.out.println(strings);

        // remove(element) removes the first instance of element it finds
        // since we're adding "one" to the end, this remove should remove the "one"
        // at the beginning of the list
        strings.add("one");
        strings.remove("one");
        System.out.println(strings);

        // remove the last element in the list
        strings.removeLast();
        System.out.println(strings);

        // get(index) gives us the element at that index
        String atIndexOne = strings.get(1);
        System.out.println(atIndexOne);

        // addFirst() prepends (puts at beginning) the element to the list
        strings.addFirst("eight");
        System.out.println(strings);

        // if we want an ArrayList of a primitive like int, char, boolean, double
        // we must use the Class version, Integer, Character, Boolean, Double
        ArrayList<Integer> myInts = new ArrayList<>();
        Integer testInteger = 7;
        ArrayList<Boolean> myBooleans = new ArrayList<>();
    }

    /**
     * example of returning an array from a method
     *
     * @param chars a char array, gets copied
     * @return copy of chars, index 3 is changed to 'z'
     */
    public static char[] returnArray(char[] chars) {
        // clone gives us a copy of chars, meaning result and chars reference different arrays
        char[] result = chars.clone();
        result[3] = 'z';
        return result;
    }

    /**
     * example of passing an array to a method
     * since arrays are passed as reference, if we update anything in the array,
     * we are also updating things in the original array that we passed in
     *
     * @param chars a char array, passed by reference, meaning the array that is
     *              passed in will have a 'z' at index 3
     */
    public static void passingArray(char[] chars) {
        //System.out.println(Arrays.toString(chars));
        chars[3] = 'z';

        // now chars is a different array than the one that was passed in, modifying
        // it now doesn't affect the one passed in
        chars = new char[3];
        chars[0] = 'y';

        System.out.println(Arrays.toString(chars));
    }

    /**
     * example of the enhanced for-each loop
     * unlike using indexes to access elements, you cannot update elements in the array
     * using the for-each loop
     */
    public static void forEachLoop() {
        int[] initVals = {4, 16, 15, 8, 42, 23};
        for (int value : initVals) {
            value = value + 1;
            System.out.println(value);
        }
        System.out.println(Arrays.toString(initVals));
    }

    /**
     * from in-class activity, creates an array filled with doubling values
     *
     * @param start starting value in the array
     * @param num   size of array
     */
    public static void doubleTheNums(double start, int num) {
        // make array
        double[] myArray;
        myArray = new double[num];

        // put start at beginning of array
        myArray[0] = start;

        // approach 1: use the previous value in the array
        // and double it for the current value
        // loop through array starting at index 1
        for (int i = 1; i < num; i++) {
            // get element at index (i - 1)
            int prevIndex = i - 1;
            double previous = myArray[prevIndex];

            // multiply by two
            double doubled = previous * 2;

            // put that into index (i)
            myArray[i] = doubled;
        }

        System.out.println(Arrays.toString(myArray));
        int lastIndex = myArray.length - 1;
        System.out.println("end of myArray: " + myArray[lastIndex]);

        // approach 2: use a variable to keep track of the current value
        // which gets doubled each loop
        double[] takeTwo = new double[num];
        double currentValue = start;
        for (int i = 0; i < num; i++) {
            takeTwo[i] = currentValue;
            currentValue = currentValue * 2;
        }
        System.out.println(Arrays.toString(takeTwo));
    }

    /**
     * creates array with a user input size
     *
     * @param input Scanner to get user input
     */
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

    /**
     * examples of creating an array, accessing and modifying elements of the array,
     * and using a loop to traverse all the elements
     */
    public static void arrayBasics() {

        // array declaration
        // syntax is
        //type[] arrayName;
        int[] nums;

        // we have to now create the array by saying how many elements we want it to hold
        // all the elements will have a default value, for ints that is 0
        // once we create this array, it's size will always be 5
        nums = new int[5];

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

    /**
     * example of creating an array with initial values
     */
    public static void arrayInitialization() {
        // array initialization
        // if I know what values I want I can create the array with them initially
        int[] initVals = {4, 16, 15, 8, 42, 23};
        boolean foundEight = false;
        for (int i = 0; (i < initVals.length && !foundEight); i++) {
            initVals[i] = initVals[i] * 2;
            System.out.print(initVals[i] + " ");

            if (initVals[i] == 8) {
                foundEight = true;
            }
        }

        System.out.println();
    }

    /**
     * algorithm for finding the maximum value in an array
     * some other practice problems for looping through arrays
     * count negatives
     * compute sum
     */
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

    /**
     * if I try to access the array with an index
     * that is not in-bounds an exception is thrown
     */
    public static void accessArrayOutOfBounds() {
        int[] initVals = {4, 16, 15, 8, 42, 23};
        // accessing out-of-bounds
        System.out.println(initVals[6]);
    }

    /**
     * in this case, both initVals and anotherArray are
     * both referencing the same array
     */
    public static void arraysAsObjects() {
        int[] initVals = {4, 16, 15, 8, 42, 23};
        int[] anotherArray = initVals;

        /*if I use the clone method, anotherArray will not
        be referencing initVals, but be a unique copy */
        // int[] anotherArray = initVals.clone();

        // equals checks that both arrays have the same values
        boolean same = Arrays.equals(initVals, anotherArray);
        System.out.println("same: " + same);

        /* if I sort initVals, it no longer equals anotherArray,
            although they have the same elements, they are
            now in a different order
         */
        Arrays.sort(initVals);
        System.out.println(Arrays.toString(initVals));
        same = Arrays.equals(initVals, anotherArray);
        System.out.println("same: " + same);

        /* changing an element also makes them not equal */
        anotherArray = initVals;
        anotherArray[2] = 1;
        System.out.println(initVals[2]);
        same = Arrays.equals(initVals, anotherArray);

        System.out.println("same: " + same);

        String initValsStr = Arrays.toString(initVals);
        System.out.println(initValsStr);
    }

}