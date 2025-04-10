public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student.studentCount++;
        s1.setGPA(100);
        s1.setGPA(-100);
        s1.setGPA(2.0);

        Student s2 = new Student("James A", -45, 12345678, 4.0);
        Student.studentCount++;
        s2.setAge(-1000);
        s2.setAge(45);
        System.out.println("s2.isAlumni(): " + s2.isAlumni());

        String myName = s2.getName();

        System.out.println("s1.canGraduate(): " + s1.canGraduate());
        System.out.println("s2.canGraduate(): " + s2.canGraduate());

        System.out.println("s1.isAlumni(): " + s1.isAlumni());
        System.out.println("s2.isAlumni(): " + s2.isAlumni());

        int myInt = 7;
        System.out.println(myInt);
        String myString = "hello";
        System.out.println(myString.toString());

        System.out.println(s1);
        System.out.println(s2);

    }
}