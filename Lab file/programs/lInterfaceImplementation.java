/*Write a Java program to implement interface. Create an interface named shape having area () & perimeter () as its methods.
 Create three classes circle, rectangle & square that implement this interface */

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

