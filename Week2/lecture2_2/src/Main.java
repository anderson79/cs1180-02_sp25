public class Main {
    public static void main(String[] args) {
        // multiplication
        int x = 4;
        int y = 6;
        int z = x * y;
        System.out.println(z);

        // division
        x = z / y;
        System.out.println(x);

        // modulus - remainder of division
        int i = 15 % 2;
        System.out.println(i);

        // unary minus
        int j = -9;
        System.out.println(j);

        // order of operations:
        // * / % left to right
        // + - left to right
        x = -4 + 4 % 3 * 13 + 2;
        System.out.println(x);

        // expression in parentheses evaluated first
        x = (2 + 3) * 4;
        System.out.println(x);

    }
}