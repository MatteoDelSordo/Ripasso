package conditionalStatements;

import java.util.Scanner;
//crea un programma che continua in loop finche non scegli un numero diverso da 4 o 5
public class EsercizioLoopObbligato {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Scegli cosa vuoi per pranzo, digita 1 per un panino, 2 per un piatto di pasta, 3 per una bistecca o 4 se non hai fame.");
        int scelta;
        do {
            scelta = s.nextInt();

            if (scelta == 1) {
                System.out.println("Il panino sta arrivando");
            } else if (scelta == 2) {
                System.out.println("Arriva la pasta");
            } else if (scelta == 3) {
                System.out.println("Ecco la bistecca");
            } else if (scelta == 4) {
                System.out.println("Dovresti mangiare qualcosa senno svieni");
            } else System.out.println("La scelta non esiste");
        } while (scelta != 4);

    }
}

