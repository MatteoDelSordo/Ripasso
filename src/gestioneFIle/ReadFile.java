package gestioneFIle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {

        try {
            File obj = new File("C:\\Users\\m.delsordo\\IdeaProjects\\File\\File1.txt");
            Scanner s = new Scanner(obj);
            while (s.hasNextLine()) {
                String data = s.nextLine();
                System.out.println(data);
            }
            s.close();
        } catch (FileNotFoundException e) {
            System.out.println("errore");
            e.printStackTrace();
        }


    }
}
