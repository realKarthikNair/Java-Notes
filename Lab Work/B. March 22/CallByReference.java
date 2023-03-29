class Test{
    int a, b;
    Test (int i, int j)
    {
        a = i; 
        b = j;
    }


void math(Test ob)
{
    ob.a*=2;
    ob.b/=2;
}
}

public class CallByReference {
    public static void main(String[] args)
    {
        Test ob = new Test (15, 20);
        System.out.println("Before call: "+ob.a+" "+ob.b);
        ob.math(ob);
        System.out.println("After call: "+ob.a+" "+ob.b);
    }
}
