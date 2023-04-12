### 1.  Write a Java program to print all odd numbers between 1 to 10
```c

// This code prints odd numbers from 1 to n
// where n is the input for the program
public class aPrintOddNumbers{
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i+=2) {
                System.out.print(i+" ");
        }
        System.out.println();
    }
}


```

### 2.  Write a Java program  to find out factorial of a number through recursion
```c

// This is a recursive function which finds the factorial of an integer n.
// n is the input integer.
// The function returns the factorial of n.

class bFactorialThroughRecursion{
    static int factorial(int n){
        if (n == 0)
            return 1; // base case
        return n*factorial(n-1); // recursive call
    }
    public static void main(String[] args){
        int n = 7;
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }
}
```

### 3.  Write a Java program  to accept command line arguments & print them
```c

//This code displays the contents of an array of strings
//The array is passed to the main method as a command line argument
//The array is iterated through and the contents are displayed, one per line


class cCommandLineArgs{
    public static void main(String[] args){
        for (int i=0; i<args.length; i++)
            System.out.println(args[i]);
    }
}

```

### 4.  Write a Java program  to print fibonacci series using function
```c

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
```

### 5.  Write a Java program that creates a class accounts with following details:
### Instance variables: ac_no., name, ac_name, balance
### Methods: withdrawal (), deposit (), display ().use constructors to initialize members 
```c

class eAccounts{
    // instance variables
    int ac_no;
    String name, ac_name;
    double balance;
    // constructor
    eAccounts(int ac_no, String name, String ac_name, double balance){
        this.ac_no = ac_no;
        this.name = name;
        this.ac_name = ac_name;
        this.balance = balance;
    }
    // this method withdraws amount from balance
    void withdrawal(double amount){
        if (amount > balance)
            System.out.println("Insufficient balance");
        else
            balance -= amount;
    }
    // this method deposits amount to balance
    void deposit(double amount){
        balance += amount;
    }
    // this method displays account details
    void display(){
        System.out.println("Account number: " + ac_no);
        System.out.println("Name: " + name);
        System.out.println("Account name: " + ac_name);
        System.out.println("Balance: " + balance+"\n");
    }
    public static void main(String[] args) {
        // create object of eAccounts class
        eAccounts e = new eAccounts(123456, "John", "Savings", 10000);
        // before withdrawal
        System.out.println("Before withdrawal:");
        e.display();
        // withdraw 5000
        e.withdrawal(5000);
        // after withdrawal
        System.out.println("After withdrawal of 5000:");
        e.display();
        // deposit 1000
        e.deposit(1000);
        // after deposit
        System.out.println("After deposit of 1000:");
        e.display();
    }
}

```

### 6.  Write a Java program to implement constructor overloading
```c

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
```

### 7.  Write a Java program to count the no. of objects created in a program
```c

class CountObjects{
    static int count = 0;

    CountObjects(){
        // this function increments the count of objects created
        count++;
    }

    static int getCount(){
        // this function returns the count of objects created
        return count;
    }
}


class gObjectCounter{

public static void main(String[] args)
{
    // create two objects of CountObjects class
    CountObjects var1= new CountObjects();
    CountObjects var2= new CountObjects();
    // print the count of objects created using getCount() function
    System.out.println(CountObjects.getCount());
    }
}
```

### 8.  Write a Java program  to show call by value & call by reference
```c

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
```

### 9.  Write a Java program to implement method overriding & method overloading.
```c

class Book{
    void info(){
        System.out.println("This is a book");
    }
}


class Novel extends Book{
    // method overriding
    void info(){
        System.out.println("This is a novel");
    }
    // method overloading
    void info(int x){
        System.out.println("This is a novel with " + x + " chapters");
    }
}

class iMethodOverridingOverloading{
    public static void main(String[] args) {
        // parent class method is called
        Book obj1 = new Book();
        obj1.info();
        // child class method is called
        // method overriding
        Novel obj2 = new Novel();
        obj2.info();
        // method overloading
        obj2.info(10);
    }
}


```

### 10. Create a class box having height, width, depth as the instance variables & calculate its volume.
###  Implement constructor overloading in it. Create a subclass named box_new that has weight as an instance variable.
###   Use super in the box_new class to initialize members of the base class
###  
```c

class box{
    int height, width, depth;
    // constructor overloading
    box(){
        height = 0;
        width = 0;
        depth = 0;
    }
    box(int height, int width, int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    box(box obj){
        height = obj.height;
        width = obj.width;
        depth = obj.depth;
    }
    int volume(){
        return height*width*depth;
    }
}

class box_new extends box{
    // instance variable 
    int weight;
    box_new(){
        super();
        weight = 0;
    }
    box_new(int height, int width, int depth, int weight){
        super(height, width, depth);
        this.weight = weight;
    }
    box_new(box_new obj){
        super(obj);
        weight = obj.weight;
    }
    void print(){
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Depth: " + depth);
        System.out.println("Weight: " + weight);
        System.out.println("Volume: " + volume());
    }
}

class jQn10{
    public static void main(String[] args) {
        box_new obj1 = new box_new();
        box_new obj2 = new box_new(10, 20, 30, 40);
        box_new obj3 = new box_new(obj2);
        obj1.print();
        obj2.print();
        obj3.print();
    }
}
```

### 11.  Write a Java program to implement run time polymorphism
```c

class Book{
    void info(){
        System.out.println("This is a book");
    }
}

class Novel extends Book{
    // info is overridden
    void info(){
        System.out.println("This is a novel");
    }
}

class kRunTimePolymorphism{
    public static void main(String[] args) {
        Book book0= new Novel();
        // calling the run method by the reference variable of the parent class
        book0.info();
    }
}
```

### 12. Write a Java program to implement interface. Create an interface named shape having area () & perimeter () as its methods.
###  Create three classes circle, rectangle & square that implement this interface 
```c

interface shape{
    // abstract methods
    void area();
    void perimeter();
}
// circle, rectangle and square classes implement the shape interface

class circle implements shape{
    int r;
    circle(int r){
        this.r = r;
    }
    public void area(){
        System.out.println("Area of circle is: "+(3.14*r*r));
    }
    public void perimeter(){
        System.out.println("Perimeter of circle is: "+(2*3.14*r));
    }
}

class rectangle implements shape{
    int l,b;
    rectangle(int l,int b){
        this.l = l;
        this.b = b;
    }
    public void area(){
        System.out.println("Area of rectangle is: "+(l*b));
    }
    public void perimeter(){
        System.out.println("Perimeter of rectangle is: "+(2*(l+b)));
    }
}

class square implements shape{
    int s;
    square(int s){
        this.s = s;
    }
    public void area(){
        System.out.println("Area of square is: "+(s*s));
    }
    public void perimeter(){
        System.out.println("Perimeter of square is: "+(4*s));
    }
}

class lInterfaceImplementation{
    public static void main(String[] args) {
        // create objects of circle, rectangle and square and call their methods
        circle c = new circle(5);
        c.area();
        c.perimeter();
        rectangle r = new rectangle(5,6);
        r.area();
        r.perimeter();
        square s = new square(5);
        s.area();
        s.perimeter();
    }
}


```

### 13.  Write a Java program to show multiple inheritance
```c

// in java, multiple inheritance is not supported
// but it can be achieved using interfaces

interface Animal{
    // abstract methods
    public void eat();
    public void move();
}
 
interface Mammal{
    // abstract method
    public void giveBirth();
}
 
class Dog implements Animal, Mammal{
    // multiple inheritance is achieved using interfaces
    public void eat(){
        System.out.println("The dog is eating.");
    }
    public void move(){
        System.out.println("The dog is moving.");
    }
    public void giveBirth(){
        System.out.println("The dog is giving birth.");
    }
}
 
public class mMultipleInheritance {
    public static void main(String[] args){
        Dog dog0 = new Dog();
        dog0.eat();
        dog0.move();
        dog0.giveBirth();
    }
}

 

```

### 14.  Write a Java program to implement exception handling. Use try, catch & finally
```c

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
```

### 15.  Write a Java program  to implement matrix multiplication by 2d array
```c

public class oMatrixMul {
    public static void main(String[] args) {
        // create 2d arrays and multiply them
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int c[][] = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                // multiply the matrices
                c[i][j] = 0;
                for(int k=0;k<3;k++){
                    // add the products of the elements of the matrices
                    c[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        // print the result
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}

```

### 16.  Create a user defined exception named “nomatchexception” that is fired when the string entered by the user is not “india”
```c

// import the required packages and classes to use the Scanner class
import java.util.Scanner;

// create a user defined exception
class nomatchexception extends Exception{
    nomatchexception(String s){
        super(s);
    }
}

public class pUserDefinedException{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        // read the string from the user 
        String s = sc.nextLine();
        sc.close();
        try{
            // check if the string entered is india 
            if(s.equals("india")){
                System.out.println("The string entered is: "+s);
            }
            else{
                // throw the exception if the string is not india
                throw new nomatchexception("The string entered is not india");
            }
        }
        // catch the exception and print the message 
        catch(nomatchexception e){
            System.out.println(e);
        }
    }
}
```

### 17.  Write a Java program  to show even & odd numbers by thread
```c

class Even extends Thread{
    // initialize n
    int n;
    Even(int n){
        this.n = n;
    }
    // override run method
    public void run(){
        for (int i=0; i<=n; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}

class Odd extends Thread{
    // initialize n
    int n;
    Odd(int n){
        this.n = n;
    }
    // override run method
    public void run(){
        for (int i=1; i<=n; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}

class rEvenOddThread{
    public static void main(String[] args) {
        // create object of Even class
        Even e = new Even(10);
        // create object of Odd class
        Odd o = new Odd(10);
        // start thread
        e.start();
        o.start();
    }
}
```

### 18.  Write a Java program  to demonstrate the use of equals(), trim() ,length() , substring(), compareto()  of string class
```c

public class uQn21 {
    public static void main(String[] args) {
        String str1 = "    Some Text   ";
        String str2 = "some text";
        String str3 = "Some text";
        String str4 = "text";
        
        // equals() method returns true if the string is equal to the given string
        System.out.println(str1.equals(str2)); // false
        System.out.println(str2.equals(str3)); // true
        
        // trim() method removes the leading and trailing spaces
        System.out.println(str1.trim()); // "hello world"
        
        // length() method returns the length of the string
        System.out.println(str2.length()); // 11
        
        // substring() method returns the substring of the string
        System.out.println(str2.substring(6));
        
        // compareTo() method returns the difference of the ascii values of the first unmatched character
        System.out.println(str2.compareTo(str3));
        System.out.println(str2.compareTo(str4));
        System.out.println(str3.compareTo(str2));
    }
}


```

