// Write a Java program  to accept command line arguments & print them

//This code displays the contents of an array of strings
//The array is passed to the main method as a command line argument
//The array is iterated through and the contents are displayed, one per line


class cCommandLineArgs{
    public static void main(String[] args){
        for (int i=0; i<args.length; i++)
            System.out.println(args[i]);
    }
}
