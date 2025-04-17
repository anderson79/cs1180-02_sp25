public class UndergradStudent extends Student {
    private String major;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMinor() {
        return minor;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

    private String minor;

    UndergradStudent(String name, int age, String major, String minor) {
        super.name = name;
        super.setAge(age);
        this.major = major;
        this.minor = minor;
    }

    @Override
    public String toString() {
        return super.toString() + " UndergradStudent{" +
                "major='" + major + '\'' +
                ", minor='" + minor + '\'' +
                '}';
    }
}
