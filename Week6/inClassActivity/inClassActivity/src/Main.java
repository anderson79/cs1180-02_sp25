/**
 * In-class activity from 2/20/2025
 * Create a method that calculates the average of three grades
 */
public class Main {
    /**
     * main uses gradeAverage to get the average of three grades
     * @param args
     */
    public static void main(String[] args) {
        double average = gradeAverage(98.7, 87.6, 76.5);
        System.out.println("Grade average: " + average);

        // this is a separate example of using doubles as loop counters
        // basically, don't use doubles as loop counters
        double value = 0.0;
        while (value <= 1.2) {
            System.out.println(value);
            value = value + 0.1;
            if (value == 1.0){
                System.out.println("This line probably doesn't happen");
            }
        }
    }

    /**
     * Given three grades, calculate the average
     *
     * @param grade1 first grade
     * @param grade2 second grade
     * @param grade3 third grade
     * @return the average of all three grades
     */
    public static double gradeAverage(double grade1, double grade2, double grade3){
        double sum = grade1 + grade2 + grade3;
        double average = sum / 3.0;
        return average;
    }
}