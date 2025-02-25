package gestioneFIle;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\Users\\m.delsordo\\IdeaProjects\\File\\File3.txt");
            if (myObj.createNewFile()) {
                System.out.println(STR."Nuovo file creato: \{myObj.getName()} nella posizione \{myObj.getAbsolutePath()}");
            } else {
                System.out.println("Il file era gia esistente");
            }

        } catch (IOException e) {
            System.out.println("Errore");
            e.printStackTrace();
        }
    }
}
