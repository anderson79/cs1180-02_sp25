/**
 * CS 1180
 * 28 Jan 2025
 * In-class code examples
 *
 * This code shows examples of overflow, integer division, type casting
 * as well as many useful String methods
 */

public class Main {
    public static void main(String[] args) {

        int anInt = 2147483647; // 2147483647 is the largest value an integer can store
        System.out.println(anInt);
        int aOne = 1;
        anInt = anInt + aOne; // if I add 1 to anInt, it will overflow and become the smallest negative number
        System.out.println(anInt);

        // 9 and 3 are integers, but we get the correct answer because there is no remainder
        double answer = 9 / 3;
        System.out.println(answer);

        // although the answer should be 4.5, the .5 part is removed because 9 and 2 are integers
        answer = 9 / 2;
        System.out.println(answer);

        // if I add .0 to either the 9 or 2, it turns into a double, so floating point division is done
        answer = 9.0 / 2;
        System.out.println(answer);


        int nine = 9;
        int two = 2;
        // if I have int variables I want to divide, I can cast them to a double so floating point division occurs
        answer = (double) nine / two;
        System.out.println(answer);

        // even though I cast nine to a double, the variable nine is still an integer
        // the type of a variable cannot change, once it is declared an int it will be an int for the entire program
        System.out.println(nine);
        System.out.println(two);

        // nine is an int which is 4 byes
        // answer is a double which is 8 bytes
        // I can put a value with a smaller variable size into one with a larger variable size, Java will automatically
        // turn nine into a double
        answer = nine;
        nine = (int) answer; // if I want to go from a larger data type to a smaller one, I need to cast the larger one

        //
        // String method examples
        //
        String myStr = "James is cool beans";

        // myStr.charAt(2) will be 'M' since it is at index 2
        // String indexes start with 0
        char aChar = myStr.charAt(2);
        System.out.println(aChar);

        // contains can check if a substring can be found in another String
        System.out.println(myStr.contains("name"));

        // indexOf will give me the first index where the character is found
        System.out.println(myStr.indexOf('s'));
        // if I ask for the indexOf a character that is not in the String I get -1
        System.out.println(myStr.indexOf('z'));
        // lastIndexOf gives me the index of the last occurrence of the character
        System.out.println(myStr.lastIndexOf('s'));

        // isEmpty checks if the String has anything in it
        System.out.println(myStr.isEmpty());
        String emptyStr = "";
        // an empty String is: ""
        System.out.println(emptyStr.isEmpty());

        // length() gives us how many characters are in our string
        // it counts everything including spaces
        System.out.println(myStr.length());

        // replaces gives us a String with all occurrences of the first char we give it replaced with the second char
        System.out.println(myStr.replace('s', 'Z'));
        System.out.println(myStr);

        myStr = "JaMes Is cOol bEaNs"; // myStr.replace doesn't change myStr, but I can assign myStr to another string

        // substring will give us a string that has the characters starting at the first index we give it
        // and we get everything up until the last index we give it
        // the character that is at the last index is not included in the substring
        // so this will give us "Is cOo"
        System.out.println(myStr.substring(6, 12));

        // toUpperCase and toLowerCase give us a new string with all the characters either upper or lower case
        System.out.println(myStr.toUpperCase());
        System.out.println(myStr.toLowerCase());
        // like replace, toUpperCase and toLowerCase don't change our original string
        System.out.println(myStr);
    }
}