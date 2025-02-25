package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SE {
    public static void main(String[] args) {

        try {
            //Creazione stream per leggere l'oggetto
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("output.txt"));
            Dipendente d1 = (Dipendente) in.readObject();
            Dipendente d2 = (Dipendente) in.readObject();
            Dipendente d3 = (Dipendente) in.readObject();

            //Stampa dei dati dell oggetto serializzato
            System.out.println(STR."\{d1.id} \{d1.name}");
            System.out.println(STR."\{d2.id} \{d2.name}");
            System.out.println(STR."\{d3.id} \{d3.name}");


        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
