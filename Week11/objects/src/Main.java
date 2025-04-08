public class Main {

    public static void main(String[] args) {
       testPoint();
    }

    public static void testPoint() {
//        String nullString = null;
//        nullString.toCharArray();

        // declaring myPoint
        Point myPoint;
        //myPoint.display();

        // assigning myPoint
        myPoint = new Point();
        myPoint.display();

        // declare and initialize in one statement
        Point p1 = new Point(10000, 12, null);

        //Point p1 = new Point();
        Point p2 = new Point();
        p1.display();// causes program to crash if color has not been initialized

        String s = "hello"; // strings are immutable
        String toUpper = s.toUpperCase();
        s = s.toUpperCase(); // reassign to change a string
        System.out.println(s);
        System.out.println(toUpper);

        s = "world";
        System.out.println(s);

        // System.out.println("p1.x: " + p1.x);
        // System.out.println("p1.y: " + p1.y);

        p1.setX(40);
        p1.setX(-9);
        p1.setY(8);
        p1.setColor(null);

        p2.setX(-15);
        p2.setY(16);
        p2.setColor("Blue");

        System.out.println("p1.x: " + p1.getX());
        // System.out.println("p1.y: " + p1.y);
        // System.out.println("p1.color: " + p1.color);

        System.out.println("In main method: ");
        p1.display();
        p2.display();

        anotherMethod();

        System.out.println("In main method: ");
        p1.display();
        p2.display();
    }

    public static void anotherMethod() {
        Point p1 = new Point();
        p1.setX(23);
        p1.setY(42);
        p1.setColor("green");
        System.out.println("In anotherMethod: ");
        p1.display();

    }
}