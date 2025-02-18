package secondaLezione.oops.astrazione;

import lombok.Data;

@Data
public abstract class Persona {
    private String nome;
    private String genere;

    public Persona() {
    }

    public Persona(String genere, String nome) {
        this.genere = genere;
        this.nome = nome;
    }
public abstract void studia();


}
