public class Student extends Person {
    // fields
    private int uid;
    private double gpa;
    private boolean alumni;

    // static fields are shared by all instances of the class
    public static int studentCount;

    // constructors
    // no-arg default constructor
    Student() {
        super("INVALID STUDENT", -1);
        this.uid = -1;
        this.gpa = -1.0;
        this.alumni = false;
    }

    // parameterized constructor
    Student(String name, int age, int uid, double gpa) {
        super(name, age);
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

//    public void setAge(int newAge) {
//        setAge(newAge);
//    }

    public String getName() {
        return super.getName();
    }

    public boolean canGraduate() {
        if (this.gpa >= 2.5) {
            this.alumni = true;
            return this.alumni;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + " Student{" +
                "uid=" + uid +
                ", gpa=" + gpa +
                ", alumni=" + alumni +
                '}';
    }
} // end class Student