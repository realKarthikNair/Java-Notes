class Box
{
    double width, height, depth; 
    Box(double w,double h,double d)
    {
        width = w;
        height = h;
        depth = d;
    }
    
    Box()
    {
        width = height = depth = -1;
    }
    
    Box(double len)
    {
        width = height = depth = len;
    }
    
    double volume()
    {
        return width*height*depth;
    }
}

class Overload_Constructor
{
    public static void main(String[] args)
    {
        Box Mybox1 = new Box (10, 20, 15);
        Box Mybox2 = new Box();
        Box Mybox3 = new Box(7);
        double vol1, vol2, vol3;
        vol1= Mybox1.volume();
        vol2= Mybox2.volume();
        vol3= Mybox3.volume();
        System.out.println("VOLUME OF MYBOX1 IS "+vol1);
        System.out.println("VOLUME OF MYBOX2 IS "+vol2);
        System.out.println("VOLUME OF MYBOX3 IS "+vol3);
    }
}
