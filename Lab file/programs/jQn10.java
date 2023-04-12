/*Create a class box having height, width, depth as the instance variables & calculate its volume.
 Implement constructor overloading in it. Create a subclass named box_new that has weight as an instance variable.
  Use super in the box_new class to initialize members of the base class
 */

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