package esercizi;

import java.util.Scanner;

//crea un programma che continua in loop finche non scegli un numero diverso da 4 o 5


public class EsercizioLoopObbligato {
    public static void main(String[] args) {


        System.out.println("Scegli cosa vuoi per pranzo, digita 1 per un panino, 2 per un piatto di pasta, 3 per una bistecca o 4 se non hai fame.");


        ClasseDiAppoggio.sceltaDelPasto();


    }
}


class ClasseDiAppoggio {
    public static void sceltaDelPasto() {
        Scanner s = new Scanner(System.in);
        while (true) {
            int scelta = s.nextInt();
            if (scelta == 1) {
                System.out.println("Il panino sta arrivando");
                break;
            } else if (scelta == 2) {
                System.out.println("Arriva la pasta");
                break;
            } else if (scelta == 3) {
                System.out.println("Ecco la bistecca");
                break;
            } else if (scelta == 4) {
                System.out.println("Dovresti mangiare qualcosa senno svieni");
            } else System.out.println("La scelta non esiste, riprova");

        }
    }
}
