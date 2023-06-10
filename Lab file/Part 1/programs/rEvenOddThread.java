// Write a Java program  to show even & odd numbers by thread

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