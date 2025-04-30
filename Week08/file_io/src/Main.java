import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        //fileInputStreamReadTwoInts();
        fileInputStreamReadAllInts();
        //fileOutputStreamExample();
    }

    public static void fileOutputStreamExample() throws IOException {
        //FileOutputStream fileStream = new FileOutputStream("hello.txt", true); // true means to append to the file instead of replacing everything
        try {
            FileWriter fileWriter = new FileWriter("hello.txt", true);
            PrintWriter fileOut = new PrintWriter(fileWriter);

            fileOut.println("Hello world again!");
            fileOut.close(); //
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public static void fileInputStreamReadAllInts() throws FileNotFoundException {
        //FileInputStream fileInputStream = new FileInputStream("numFile.txt");
        try {
            File myFile = new File("numFile1.txt");

            Scanner fileInput = new Scanner(myFile);

            int num;
            int count = 0;

            while (fileInput.hasNextInt()) {
                count++;
                num = fileInput.nextInt();
                //System.out.println("num" + count + ": " + num);
            }
            System.out.println("There are " + count + " integers");
        } catch (FileNotFoundException e) {
            System.out.println("Caught an exception");
            System.out.println(e);
        } finally {
            System.out.println("And finally...");
        }

        // System.out.println("after try/catch");
    }

    public static void fileInputStreamReadTwoInts() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("numFile.txt");
        Scanner fileInput = new Scanner(fileInputStream);

        int num1;
        int num2;

        num1 = fileInput.nextInt();
        num2 = fileInput.nextInt();

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

    }

    public static void uniqueLetters() {
        String test = "abcacdaplap";

        String result = "";
        for (int i = 0; i < test.length(); i++) {
            String currentChar = test.substring(i, i + 1);
            if (!result.contains( currentChar ) ){
                result += test.charAt(i);
                result += ' ';
            }
        }
        System.out.println(result);
    }
}