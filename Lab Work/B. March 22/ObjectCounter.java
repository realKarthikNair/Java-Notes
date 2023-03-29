// Number of objects created in a program

class CountObjects{
    static int count = 0;

    CountObjects(){
        count++;
    }

    static int getCount(){
        return count;
    }
}


class ObjectCounter{

public static void main(String[] args)
{
    CountObjects var1= new CountObjects();
    CountObjects var2= new CountObjects();
    System.out.println(CountObjects.getCount());
    }
}
// public class CountObjects {
//     private static int count = 0;

//     public CountObjects() {
//         count++;
//     }

//     public static int getCount() {
//         return count;
//     }
 

// [08:31, 29/03/2023] Priyanshiii: Maine note ni kiye the yrr
// [08:32, 29/03/2023] Priyanshiii: Ek constructor overload krne ka tha
// [08:32, 29/03/2023] Priyanshiii: Ek call by ref
// [08:32, 29/03/2023] Priyanshiii: Aur ek yad ni aara
// [08:32, 29/03/2023] Priyanshiii: Hn last me show krna tha no of objects created