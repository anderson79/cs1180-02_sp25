public class Student {
    // fields
    private String name;
    private int uid;
    private int age;
    private double gpa;
    private boolean alumni;

    // static fields are shared by all instances of the class
    public static int studentCount;

    // constructors
    // no-arg default constructor
    Student() {
        this.name = "INVALID STUDENT";
        this.age = -1;
        this.uid = -1;
        this.gpa = -1.0;
        this.alumni = false;
    }

    // parameterized constructor
    Student(String name, int age, int uid, double gpa) {
        this.name = name;
        this.setAge(age);
        this.uid = uid;
        this.setGPA(gpa);
        this.canGraduate();
    }

    public boolean isAlumni() {
        return alumni;
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
        } else {
            this.age = -1;
        }
    }

    public String getName() {
        return name;
    }

    public boolean canGraduate() {
        if (this.gpa >= 2.5) {
            this.alumni = true;
            return this.alumni;
        }

//        if (gpa >= 2.5) {
//            return true;
//        } else {
//            return false;
//        }

//        if (gpa >= 2.5) {
//            return true;
//        }
        return false;
    }

    public String toString() {
        String result = "Student: " + name + " UID: " + uid + " GPA: " + gpa + " age: " + age + " alumni: " + alumni + " studentCount: " + studentCount;
        return result;
    }

} // end class Student