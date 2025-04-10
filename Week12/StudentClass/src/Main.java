public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setGPA(100);
        s1.setGPA(-100);
        s1.setGPA(2.5);
        Student s2 = new Student("James A", 45, 12345678, 4.0);

        s1.setAge(-1000);
        s1.setAge(45);

        String myName = s2.getName();
    }
}