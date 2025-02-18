package secondaLezione.oops.astrazione;

import lombok.Data;

@Data
public class Studente extends Persona {
    private int idStudente;

    public Studente(String genere, String nome, int idStudente) {
        super(genere, nome);
        this.idStudente = idStudente;
    }

    @Override
    public void studia() {
        System.out.println("Lo studente sta studiando");
    }

    @Override
    public String toString() {
        return "Studente{" +
                "idStudente=" + idStudente +
                "} " + super.toString();
    }
}
