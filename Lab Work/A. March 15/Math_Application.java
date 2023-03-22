class operation
{
    static double mul(double x, double y)
    {
        return x*y;
    }
    static double divide(double x, double y)
    {
        return x/y;
    }
}

class Math_Application
{
    public static void main(String[] args)
    {
        double a = operation.mul(4.0, 5.0);
        double b = operation.divide(a, 2.0);
        System.out.println("b = "+b);
    }
}
