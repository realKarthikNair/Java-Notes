// Write a Java program to implement exception handling. Use try, catch & finally

public class nTryCatchFinally{
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            // runs the code that may throw an exception
            int c = a/b;
            System.out.println("The result is: "+c);
        }
        catch(ArithmeticException e){
            // handles the exception
            System.out.println("Arithmetic Exception occured");
        }
        finally{
            // executes the code regardless of the exception
            System.out.println("Operation completed");
        }
    }
}