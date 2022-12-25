package writeFromJavaToTxt;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            FileReader fileReader = new FileReader("C:/Users/Admin/Desktop/SashkewichAndroid/Home works/HW 26 - Reading and writing files/src/writeFromJavaToTxt/Worker.java");
            FileWriter fileWriter = new FileWriter("C:/Users/Admin/Desktop/SashkewichAndroid/Home works/HW 26 - Reading and writing files/src/writeFromJavaToTxt/classWorker.txt");
            Scanner sc = new Scanner(fileReader);

            int i = 1;

            while (sc.hasNextLine()) {
                fileWriter.write(sc.nextLine() + "\n");
                i++;
            }

            fileWriter.close();
            fileReader.close();
        }

        catch (IOException ex) {
            System.out.println(ex);
        }
    }
}