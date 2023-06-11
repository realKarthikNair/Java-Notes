// Write a Java program  in Java to implement the concept of ‘synchronization’ using thread

class Incrementer {
    private int count = 0;
    public synchronized void increment() {
        count++;
        System.out.println("Count is now " + count);
    }
}

class MyThread implements Runnable {
    private Incrementer Incrementer;
    private String name;

    public MyThread(Incrementer Incrementer, String name) {
        this.Incrementer = Incrementer;
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            Incrementer.increment();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class eSynchronizationUsingThread {
    public static void main(String[] args) {
        Incrementer Incrementer = new Incrementer();
        Thread thread1 = new Thread(new MyThread(Incrementer, "Thread 1"));
        Thread thread2 = new Thread(new MyThread(Incrementer, "Thread 2"));
        thread1.start();
        thread2.start();
    }
}