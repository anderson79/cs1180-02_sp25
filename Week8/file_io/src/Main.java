import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        //fileInputStreamReadTwoInts();
        //fileInputStreamReadAllInts();
        fileOutputStreamExample();
    }

    public static void fileOutputStreamExample() throws FileNotFoundException {
        FileOutputStream fileStream = new FileOutputStream("hello.txt");
        PrintWriter fileOut = new PrintWriter(fileStream);

        fileOut.println("Hello world!");
        fileOut.close(); //
    }
    public static void fileInputStreamReadAllInts() throws FileNotFoundException {
        //FileInputStream fileInputStream = new FileInputStream("numFile.txt");
        File myFile = new File("numFile.txt");

        Scanner fileInput = new Scanner(myFile);

        int num;
        int count = 0;

        while (fileInput.hasNextInt()) {
            count++;
            num = fileInput.nextInt();
            System.out.println("num" + count + ": " + num);
        }
        System.out.println("There are " + count + " integers");
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
}