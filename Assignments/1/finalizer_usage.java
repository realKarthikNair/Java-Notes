public class finalizer_usage {
    private String name;
 
    public finalizer_usage(String name) {
       this.name = name;
    }
 
    public void finalize() {
       System.out.println("Object " + name + " is being garbage collected.");
    }


    public static void main(String[] args) {
        finalizer_usage obj1 = new finalizer_usage("Object 1");
        finalizer_usage obj2 = new finalizer_usage("Object 2");
  
        // dereference obj1 and obj2 to make them eligible for garbage collection
        obj1 = null;
        obj2 = null;
  
        // call the garbage collector explicitly
        System.gc();
  
        // wait for a moment to allow the garbage collector to run
        try {
           Thread.sleep(1000);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
     }
  }
 
 


