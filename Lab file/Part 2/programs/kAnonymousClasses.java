// Write a Java program on anonymous classes

public class kAnonymousClasses {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("Hello from an anonymous class!");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}