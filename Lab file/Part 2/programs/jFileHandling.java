// Write a Java program  to implement file handling(both reading & writing to a file)

import java.io.*;

public class jFileHandling {
    public static void main(String[] args) {
        try {
            File file = new File("res/temp.txt");
            FileWriter writer = new FileWriter(file);
            writer.write("Hello World! This line was added to the file");
            writer.close();
            System.out.println("Data written into file successfully.");
            System.out.println("Reading file...");
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}