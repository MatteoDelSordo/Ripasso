package primaLezione.conditionalStatements;

import java.util.Scanner;

public class OperatoreTernario {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Immetti il primo valore numerico");
        int n1 = s.nextInt();
        System.out.println("Immetti il secondo valore numerico");
        int n2= s.nextInt();
        s.close();
        int maggiore = (n1>n2)? n1:n2;
        System.out.println(maggiore);




    }
}
