package primaLezione.loop;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Double a, somma = 0.0;
        do {
            System.out.println("Inserisci un numero da sommare o zero per uscire ");
            a = s.nextDouble();
            somma += a;
        } while (a != 0);
        System.out.println("La somma dei numeri è " + somma);
    }
}
