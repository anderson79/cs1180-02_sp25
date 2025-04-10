public class Main {

    public static void main(String[] args) {
        onePoint();
        twoPoints();
        pointConstructors();
        pointSetters();
        pointGettersSetter();
        pointConstructors();
    }

    /**
     * onePoint tests creating a new point
     */
    public static void onePoint() {
        Point p1; // declare a Point named p1
        p1 = new Point(); // initialize p1 to a new Point

//        p1.x = 40;
//        p1.y = 8;
//        p1.color = "red";
        // once we made x, y, and color private we needed to use the setters
        p1.setX(40);
        p1.setY(8);
        p1.setColor("red");
        System.out.println("p1:");
        p1.display();
    }

    /**
     * tests creating two points that are independent
     */
    public static void twoPoints() {
        Point p1 = new Point();
        p1.setX(40);
        p1.setY(8);
        p1.setColor("red");

        Point p2 = new Point();
        p2.setX(15);
        p2.setY(16);
        p2.setColor("Blue");

        System.out.println("p1:");
        p1.display();
        System.out.println("p2:");
        p2.display();
    }

    /**
     * test the mutator (setter) methods
     * the setters constrain what valid values can be given
     */
    public static void pointSetters() {
        Point p1 = new Point();

        p1.setX(40); // 40 is valid for x
        p1.setY(-9); // -9 is invalid for y
        p1.setColor("Blue"); // setColor will make sure the color is correct (lower case)

        System.out.println("p1:");
        p1.display();
    }

    public static void pointGettersSetter() {
        Point p1 = new Point();
        p1.setX(40);
        p1.setY(8);
        p1.setColor("red");

        System.out.println("p1.getX(): " + p1.getX());
        System.out.println("p1.getY(): " + p1.getY());
        System.out.println("p1.getColor(): " + p1.getColor());
    }

    public static void pointConstructors() {
        // p1 uses the default constructor
        Point p1 = new Point();
        System.out.println("p1 using default constructor:");
        p1.display();

        p1.setX(40);
        p1.setY(9);
        p1.setColor("blue");

        // p2 uses the parameterized constructor, passing in the values for x, y, and color
        // constructor uses the setter methods to correctly set the parameters
        Point p2 = new Point(10000, 12, null);
        System.out.println("p2 using parameterized constructor:");
        p2.display();
    }
}