class Student{
    int rollno;
    void getNumber(int n)
    {
        rollno = n;
    }
    void putNumber()
    {
        System.out.println("Roll Number: "+rollno);
    }   
}

class Test extends Student{
    float Part1, Part2; 
    void getMarks(float m1,float m2)
    {
        Part1 = m1;
        Part2 = m2;
    }

    void putMarks()
    {
        System.out.println("Marks Obtained: ");
        System.out.println("Part1 = "+Part1);
        System.out.println("Part2 = "+Part2);
    }
}

interface sports
{
    float sportwt = 6.0F;
    void putwt();
}

class Result extends Test implements sports 
{
    float total;
    public void putwt()
    {
        System.out.println("Sport wt = "+sportwt);
    }
    void display()
    {
        total = Part1 + Part2 + sportwt;
        putNumber();
        putMarks();
        putwt();
        System.out.println("Total Score = "+ total);
    }
}

public class MultipleInheritance {
    public static void main(String[] args)
    {
        Result student1 = new Result();
        student1.getNumber(1234);
        student1.getMarks(27.5F, 33.0F);
        student1.display();
    }
}
