package primaLezione.conditionalStatements;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inserisci il numero di un mese");
        int mese = s.nextInt();
        s.close();
        String nomeMese = null;
        if (mese == 0) {
            System.out.println("... non credo esista un mese rappresentato da zero");
        } else if (mese < 0) {
            System.out.println("huh?");
        } else if (mese <= 12) {
            switch (mese) {
                case 1:
                    nomeMese = "Gennaio";
                    break;
                case 2:
                    nomeMese = "Febbraio";
                    break;
                case 3:
                    nomeMese = "Marzo";
                    break;
                case 4:
                    nomeMese = "Aprile";
                    break;
                case 5:
                    nomeMese = "Maggio";
                    break;
                case 6:
                    nomeMese = "Giugno";
                    break;
                case 7:
                    nomeMese = "Luglio";
                    break;
                case 8:
                    nomeMese = "Agosto";
                    break;
                case 9:
                    nomeMese = "Settembre";
                    break;
                case 10:
                    nomeMese = "Ottobre";
                    break;
                case 11:
                    nomeMese = "Novembre";
                    break;
                case 12:
                    nomeMese = "Dicembre";
                    break;

            }
            System.out.println(nomeMese);

        } else
            System.out.println("Esistono solo 12 mesi");
    }
}
