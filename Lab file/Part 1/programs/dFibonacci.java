// Write a Java program  to print fibonacci series using function

class dFibonacci{
    // This function prints the fibonacci series
    // n is the input for the function
    static void fibonacci(int n){
        int a = 0, b = 1, c;
        System.out.print(a+" "+b+" ");
        for (int i=2; i<n; i++){
            c = a + b; // next term
            System.out.print(c+" ");
            a = b; // update a
            b = c; // update b
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n = 10;
        if (n > 0)
            fibonacci(n);
        else if (n == 0) // exceptional case
            System.out.println("0");
        else // exceptional case
            System.out.println("Invalid input");
    }
}