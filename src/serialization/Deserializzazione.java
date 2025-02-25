package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Deserializzazione {
    public static void main(String[] args) {
        try {
            Dipendente dipendente1 = new Dipendente(00, "Pippo");
            Dipendente dipendente2 = new Dipendente(01, "Franco");
            Dipendente dipendente3 = new Dipendente(02, "Giorgio");
            Dipendente dipendente4 = new Dipendente(03, "Rosario");
            Dipendente dipendente5 = new Dipendente(04, "Enzo");
            Dipendente dipendente6 = new Dipendente(05, "Antonio");

            FileOutputStream fout = new FileOutputStream("output.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(dipendente1);
            out.writeObject(dipendente2);
            out.writeObject(dipendente3);
            out.writeObject(dipendente4);
            out.writeObject(dipendente5);
            out.writeObject(dipendente6);

            out.flush();
            out.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
