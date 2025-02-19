package eccezioni;

import java.text.SimpleDateFormat;
import java.util.*;

public class EccezioneData {

    static void convertDateFormat(String inputDate) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
            Date d = sdf.parse(inputDate);
            SimpleDateFormat outputSdf = new SimpleDateFormat("yyyy/mm/dd");
            String outputDate = outputSdf.format(d);
            System.out.println("Questo è il risultato: " + outputDate);
        } catch (java.text.ParseException e) {
            System.out.println("C'è stata un eccezione durante il cambio data, riprova");

        }


    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inserisci la data con formato dd/mm/yyyy");
        String inputDate = s.nextLine();
        convertDateFormat(inputDate);

    }


}
