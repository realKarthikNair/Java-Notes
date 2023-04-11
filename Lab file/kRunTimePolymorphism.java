// Write a Java program to implement run time polymorphism

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