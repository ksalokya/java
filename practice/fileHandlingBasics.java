import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandlingBasics {
    public static void main(String[] args) {

        // create new file
        File newFile = new File("test.txt");
        try {
            newFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // write to a file
        try {
            FileWriter fileWriter = new FileWriter("test.txt");
            fileWriter.write("Hello World!");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // reading a file
        File myFile = new File("test.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // delete a file
        File delFile = new File("test.txt");
        if (delFile.delete()) {
            System.out.println("Deleted : " + delFile.getName() + " from " + delFile.getAbsolutePath());
        } else {
            System.out.println("Error occured.");
        }

    }
}