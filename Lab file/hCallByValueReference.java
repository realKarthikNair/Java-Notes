// Write a Java program  to show call by value & call by reference

class CalcByValue{
    // this function increments the value of a by 1 using value
    void increment(int a){
        a++;
    }
}

class CalcByReference{
    // this function increments the value of a by 1 using reference
    int a;
    CalcByReference(int i){
        a = i;
    }

    void increment(CalcByReference obj){
        obj.a++;
    }
}

class hCallByValueReference{
    public static void main(String[] args) {
        // call by value
        int a = 10;
        System.out.println("Call by value");
        CalcByValue obj1 = new CalcByValue();
        System.out.println("Before incrementing a = " + a);
        obj1.increment(a);
        System.out.println("After incrementing a = " + a);
        // call by reference
        System.out.println("Call by reference");
        CalcByReference obj2 = new CalcByReference(10);
        System.out.println("Before incrementing a = " + obj2.a);
        obj2.increment(obj2); // passing the reference of obj2 to the function 
        System.out.println("After incrementing a = " + obj2.a);
    }
}