class Box

{
    double width, height, depth;
    Box()
    {
        System.out.println("CONSTRUCTOR WITHOUT PARAMETER");
        width = height = depth = 10;
    }
    
    Box (double w, double h, double d)
    {
        System.out.println("CONSTRUCTOR WITH PARAMETER");
        width = w;
        height = h;
        depth = d;
    }
    
    double Volume()
    {
        return width*height*depth;
    }
    
}

class Boxdemo
{
    public static void main (String[] args)
    {
        Box Mybox1 = new Box();
        Box Mybox2 = new Box(3,6,9);
        double vol;
        vol = Mybox1.Volume();
        System.out.println("VOLUME IS "+ vol);
        vol = Mybox2.Volume();
        System.out.println("VOLUME IS "+ vol);
    }
}

