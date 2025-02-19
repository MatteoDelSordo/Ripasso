package enums;

import java.util.ArrayList;
import java.util.EnumSet;

public enum Semaforo {
    GIALLO("Aspetta"), ROSSO("Stop"), VERDE("Vai");
    private String azione;

    Semaforo(String messaggio) {
        this.azione = messaggio;
    }


    private void segnaleDiTraffico(String azione) {
        this.azione = azione;
    }

    public String getAzione() {

        return this.azione;
    }

}

class ClasseTest {

    public static void main(String[] args) {
        EnumSet<Semaforo> all = EnumSet.allOf(Semaforo.class);
        ArrayList<Semaforo> pippo = new ArrayList<>();
        for (Semaforo s : all) {
            pippo.add(s);
        }
        System.out.println(pippo);
        for (Semaforo s : pippo) {
            System.out.println("Il " + s + " Si trova all indice " + s.ordinal());
            System.out.println(s.name() + ": " + s.getAzione());
        }

        Semaforo vai = Semaforo.ROSSO;

        System.out.println();

        if (vai == Semaforo.ROSSO) {
            System.out.println("Tu non puoi passare");
        } else if (vai == Semaforo.GIALLO) {
            System.out.println("Dovresti sbrigarti");
        } else {
            System.out.println("Corri Forrest");
        }


    }

}
