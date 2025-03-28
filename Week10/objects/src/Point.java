public class Point {
    // fields
    private int x;
    private int y;
    public String color;

    // methods
    public void display() {
        int z = 12;
        System.out.println("{" + x + ", " + y + "}: " + color);
    }

    /**
     * helper method to make sure value is between 0 and max
     * @param value value to check if is in range
     * @param max the max the value should be
     * @return true if value is within range, false otherwise
     */
    private boolean inRange(int value, int max) {
        boolean result = false;
        if (value > max) {
            result = false;
        } else if (value < 0){
            result = false;
        } else {
            result = true;
        }
        return result;
    }

    /**
     * mutator method to change x field
     * @param newX the new value of x
     */
    public void setX(int newX) {
        if (inRange(newX, 100)) {
            x = newX;
        }
    }

    /**
     * mutator method to change y field
     * @param newY the new value of y
     */
    public void setY(int newY) {
        if (inRange(newY, 80)) {
            y = newY;
        }
    }

    /**
     * accessor method for x
     * @return value of x
     */
    public int getX() {
        return x;
    }

    /**
     * accessor method for y
     * @return the value of y
     */
    public int getY() {
        return y;
    }
} // end of Point class