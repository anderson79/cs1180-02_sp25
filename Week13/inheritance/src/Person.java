public class Person {
    protected String name;
    private int age;

//    Person() {
//        setName("INVALID NAME");
//        setAge(-1);
//    }

    Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
