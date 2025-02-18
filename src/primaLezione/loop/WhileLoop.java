package primaLezione.loop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int n1 = s.nextInt();
        int n2 = 2;
        boolean b = false;
        while (n2 <= n1 / 2) {
            if (n1 % n2 == 0) {
                b = true;
                break;
            }
            ++n2;

        }
        if (!b) {
            System.out.println(n1 + " è un numero primo");
        } else
            System.out.println(n1 + " non è un numero primo");

    }
}
