public class Student {
    // fields
    private String name;
    private int uid;
    private int age;
    private double gpa;

    // constructors
    // no-arg default constructor
    Student() {
        this.name = "INVALID STUDENT";
        this.age = -1;
        this.uid = -1;
        this.gpa = -1.0;
    }

    // parameterized constructor
    Student(String name, int age, int uid, double gpa) {
        this.name = name;
        this.age = age;
        this.uid = uid;
        this.gpa = gpa;
    }

    // getters/setters
    public void setGPA(double newGpa) {
        if (newGpa <= 0.0) {
            this.gpa = 0.0;
        } else if (newGpa >= 4.0) {
            this.gpa = 4.0;
        } else {
            this.gpa = newGpa;
        }
    }

    public void setAge(int newAge) {
        if (newAge > 0) {
            this.age = newAge;
        }
    }

    public String getName() {
        return name;
    }

} // end class Student