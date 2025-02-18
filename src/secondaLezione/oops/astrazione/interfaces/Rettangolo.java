package secondaLezione.oops.astrazione.interfaces;

import java.util.Scanner;

public class Rettangolo implements Forma {

    @Override
    public void draw() {
        System.out.println("Hai disegnato il rettangolo");
    }

    @Override
    public double area() {
        Scanner s = new Scanner(System.in);

        System.out.println("dammi la base del rettangolo");
        double base = s.nextDouble();

        System.out.println("Dammi l'altezza del rettangolo");
        double altezza = s.nextDouble();
        s.close();
        double risultato;

        return risultato = base * altezza;

    }
}
