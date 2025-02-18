package primaLezione.astrazione;

import java.util.Scanner;

public class Studente extends Persona implements Matematica{
    private int idStudente;
    public Studente(String nome, String genere) {
        super(nome, genere);
    }

    public Studente(String nome, String genere, int idStudente) {
        super(nome, genere);
        this.idStudente = idStudente;
    }

    @Override
    public void studying() {
        if (idStudente % 2 == 0 ) {
            System.out.println("Lo studente ha lezione nei giorni pari");
        }else
            System.out.println("Lo studente ha lezione nei giorni dispari");
    }

    @Override
    public void addizione() {
        Scanner s = new Scanner(System.in);
        System.out.println("Dammi due interi da sommare..");
        int a = s.nextInt();
        int b = s.nextInt();
        int somma= a+b;
        System.out.println("la somma degli interi "+ a +" e "+ b + " è uguale a " + somma);
        s.close();

    }

    @Override
    public void sottrazione() {
//ugaule a sopra ma con la sottrazione
    }

    @Override
    public void divisione() {
//uguale a sopra ma con la divisione
    }

    @Override
    public void moltiplicazione() {
//uguale a sopra ma con la moltiplicazione
    }
}
