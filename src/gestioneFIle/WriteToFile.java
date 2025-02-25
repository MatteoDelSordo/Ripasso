package gestioneFIle;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {


        try {
            FileWriter fw = new FileWriter("C:\\Users\\m.delsordo\\IdeaProjects\\File\\File2.txt");
            fw.write("Questo file è stato scritto tramite intellij");
            fw.close();
            System.out.println("Il file è stato scritto con successo");
        } catch (IOException e) {
            System.out.println("quacosa è andato storto");
            e.printStackTrace();
        }
    }
}
