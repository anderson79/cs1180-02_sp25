public class Instructor extends Person {

    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public int getNumClassesTeaching() {
        return numClassesTeaching;
    }

    public void setNumClassesTeaching(int numClassesTeaching) {
        this.numClassesTeaching = numClassesTeaching;
    }

    private String office;
    private int numClassesTeaching;

    Instructor(String name, int age, String department, String office, int numClassesTeaching) {
        super(name, age);
        this.department = department;
        this.office = office;
        this.numClassesTeaching = numClassesTeaching;

        super.name = "NAME";
    }

    @Override
    public String toString() {
        return super.toString() + " Instructor{" +
                "department='" + department + '\'' +
                ", office='" + office + '\'' +
                ", numClassesTeaching=" + numClassesTeaching +
                '}';
    }
}
