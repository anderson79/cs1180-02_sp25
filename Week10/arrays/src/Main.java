/**
 * CS 1180
 * Example code for using arrays from in-class
 * 3/13/2025
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

    public static void multiArray() {
        double[][] myArray = new double[4][2];
        myArray[2][1] = 100.0;

        for (int i = 0; i < myArray.length; i++)
        {
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
                if (numSwaps <= 0){
                    isShuffled = true;
                }
            }

        }
        System.out.println(Arrays.toString(charArray));

        String result = String.valueOf(charArray);
        System.out.println(result);

        for (char c: result.toCharArray()) {
            System.out.print(c + "      ");
        }
    }

    public static void stringArray() {
        String[] strings = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        //strings = new String[5];
        strings[1] = "ninety";
        int aLength = strings[0].length();
        System.out.println(aLength);
        System.out.println(Arrays.toString(strings));

        String[] resized = new String[strings.length * 2];
        System.out.println(Arrays.toString(resized));
        for (int i = 0; i < strings.length; i++) {
            resized[i] = strings[i];
        }
        System.out.println(Arrays.toString(resized));

        strings = resized;

        resized[3] = "twelve";

        System.out.println(Arrays.toString(strings));
    }

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

    public static void arrayListDemo() {
        ArrayList<String> strings;
        strings = new ArrayList<>();

        strings.add("one");
        strings.add("two");
        strings.add("three");

        System.out.println(strings);

        strings.add(1, "four");
        System.out.println(strings);

        strings.set(2, "five");
        System.out.println(strings);
        strings.add("one");
        strings.remove("one");
        System.out.println(strings);

        strings.removeLast();
        System.out.println(strings);

        System.out.println(strings.get(1));
        strings.addFirst("eight");
        System.out.println(strings);

        ArrayList<Integer> myInts = new ArrayList<>();
        Integer testInteger = 7;
        ArrayList<Boolean> myBooleans = new ArrayList<>();
    }

    public static char[] returnArray(char[] chars) {
//        char[] result = new char[chars.length];
//        for (int i = 0; i < chars.length; i++) {
//            result[i] = chars[i];
//        }
        char[] result = chars.clone();
        result[3] = 'z';
        return result;
    }

    public static void passingArray(char[] chars) {
        //System.out.println(Arrays.toString(chars));
        chars[3] = 'z';

        chars = new char[3];
        chars[0] = 'y';

        System.out.println(Arrays.toString(chars));
    }

    public static void forEachLoop() {
        int[] initVals = {4, 16, 15, 8, 42, 23};
        for (int value : initVals) {
            value = value + 1;
            System.out.println(value);
        }
        System.out.println(Arrays.toString(initVals));
    }


    public static void doubleTheNums(double start, int num) {
        // make array
        double[] myArray;
        myArray = new double[num];

        // put start at beginning of array
        myArray[0] = start;

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


        double[] takeTwo = new double[num];
        double currentValue = start;
        for (int i = 0; i < num; i++) {
            takeTwo[i] = currentValue;
            currentValue = currentValue * 2;
        }
        System.out.println(Arrays.toString(takeTwo));
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