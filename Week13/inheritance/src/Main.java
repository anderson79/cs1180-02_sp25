import java.util.ArrayList;

public class Main {
    public static double randomMethod(int i) {
        System.out.println("randomMethod(int) " + i);
        return i;
    }

    public static int randomMethod(double d) {
        System.out.println("randomMethod(double) " + d);
        return (int) d;
    }

    public static void overloadExample() {
        System.out.println("method overloading example");
        int myInt = 7;
        float myDouble = 42.8f;

        double result1 = randomMethod(myInt);
        int result2 = randomMethod(myDouble);
        System.out.println();
    }

    public static void printPerson(Person p) {

        if (p instanceof Student) {
            if (p instanceof UndergradStudent) {
                System.out.println("p is UndergradStudent");
            } else {
                System.out.println("p is Student");
            }
        } else {
            System.out.println("p not Student");
        }
        if (p instanceof Instructor) {
            System.out.println("p is Instructor");
        } else {
            System.out.println("p not Instructor");
        }
        System.out.println(p);
        System.out.println();
    }

    public static void testPersonSubclasses() {
        System.out.println("test person subclasses");
        Student s1 = new Student("James", 45, 123456, 4.0);
        Instructor i1 = new Instructor("Clarissa", 30, "CS", "Russ 432", 3);
        System.out.println(s1);
        System.out.println(i1);
        System.out.println();
    }

    public static void testArrayListObjects() {
        System.out.println("test ArrayList of Objects");
        Student s1 = new Student("James", 45, 123456, 4.0);
        Instructor i1 = new Instructor("Clarissa", 30, "CS", "Russ 432", 3);

        ArrayList<Object> myList = new ArrayList<>();
        myList.add(s1);
        myList.add(i1);
        myList.add("a string");
        System.out.println(myList);

        ArrayList<Person> myPersons = new ArrayList<>();
        myPersons.add(s1);
        myPersons.add(i1);
        //myPersons.add("a string"); // String isn't a Person, can't add
        System.out.println(myPersons);
        System.out.println();

    }

    public static void testPolymorphism() {
        System.out.println("test polymorphism");
        Person aPerson = new Person("Person A. People", 123);
        printPerson(aPerson);

        Person personInstructor = new Instructor("person", 99, "people", "office", 9);
        printPerson(personInstructor);

        Student s1 = new Student("James", 45, 123456, 4.0);
        printPerson(s1);

        Instructor i1 = new Instructor("Clarissa", 30, "CS", "Russ 432", 3);

        printPerson(i1);

        UndergradStudent ug1 = new UndergradStudent("bill", 54, "CS", "CEG");
        printPerson(ug1);

        System.out.println("call canGraduate with UndergradStudent: " + ug1.canGraduate());
    }

    public static void main(String[] args) {
        overloadExample();
        testPersonSubclasses();
        testArrayListObjects();
        testPolymorphism();
    }
}