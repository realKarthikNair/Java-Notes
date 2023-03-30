public class ExceptionHandling {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;

        try {
            int result = x / y;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e);
        }

        System.out.println("Program continues...");
    }
}

