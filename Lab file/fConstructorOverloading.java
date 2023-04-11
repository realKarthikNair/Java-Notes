// Write a Java program to implement constructor overloading

class fConstructorOverloading{
    int a, b;
    // This is the default constructor
    fConstructorOverloading(){
        a = 0;
        b = 0;
    }
    // This is the parameterized constructor
    fConstructorOverloading(int x, int y){
        a = x;
        b = y;
    }
    // This is the copy constructor
    fConstructorOverloading(fConstructorOverloading obj){
        a = obj.a;
        b = obj.b;
    }
    // This function prints the values of a and b
    void print(){
        System.out.println("a = " + a + " b = " + b);
    }
    public static void main(String[] args) {
        fConstructorOverloading obj1 = new fConstructorOverloading();
        fConstructorOverloading obj2 = new fConstructorOverloading(10, 20);
        fConstructorOverloading obj3 = new fConstructorOverloading(obj2);
        obj1.print();
        obj2.print();
        obj3.print();
    }
}