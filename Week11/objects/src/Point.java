public class Point {
    // fields
    private int x;
    private int y;
    private String color; // initialzied to null

    // default constructor
    Point() {
        this.x = 0;
        this.y = 0;
        this.color = "NO COLOR";
    }

    Point(int newX, int y, String color) {
        setX(newX);
        setY(y);
        setColor(color);
    }

    // methods
    public void display() {
        int z = this.color.length();
        System.out.println("{" + x + ", " + y + "}: " + color + " color.length(): " + z);
    }

    /**
     * helper method to make sure value is between 0 and max
     *
     * @param value value to check if is in range
     * @param max   the max the value should be
     * @return true if value is within range, false otherwise
     */
    private boolean inRange(int value, int max) {
        boolean result = false;
        if (value > max) {
            result = false;
        } else if (value < 0) {
            result = false;
        } else {
            result = true;
        }
        return result;
    }

    /**
     * mutator (setter) method to change x field
     * x must be between 0 and 100
     *
     * @param newX the new value of x
     */
    public void setX(int x) {
        boolean isInRange = inRange(x, 100);
        if (isInRange == true) {
            this.x = x;
        }
    }

    /**
     * mutator (setter) method to change y field
     *
     * @param newY the new value of y
     */
    public void setY(int newY) {
        if (inRange(newY, 80)) {
            this.y = newY;
        }
    }

    public void setColor(String newColor) {
        if (newColor == null) {
            this.color = "NO COLOR";
        } else {
            this.color = newColor.toLowerCase();
        }
    }

    /**
     * accessor (getter) method for x
     *
     * @return value of x
     */
    public int getX() {
        return this.x;
    }

    /**
     * accessor (getter) method for y
     *
     * @return the value of y
     */
    public int getY() {
        return this.y;
    }

    public String getColor() {
        return this.color;
    }

} // end of Point class