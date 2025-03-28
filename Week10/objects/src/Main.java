public class Main {

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();

        // System.out.println("p1.x: " + p1.x);
        // System.out.println("p1.y: " + p1.y);

        p1.setX(40);
        p1.setX(-9);
        p1.setY(8);
        p1.color = "red";

        p2.setX(-15);
        p2.setY(16);
        p2.color = "blue";

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
        p1.color = "green";
        System.out.println("In anotherMethod: ");
        p1.display();

    }
}