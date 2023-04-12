// Write a Java program to implement method overriding & method overloading.

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

