package primaLezione.conditionalStatements;

import java.util.Scanner;

public class IfElseLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digita un numero intero");
        int i = s.nextInt();
        s.close();
        if (i%2==0 ) {
            System.out.println("Il numero è pari");
        }else
            System.out.println("Il numero è dispari");


    }
}
