package secondaLezione.oops.eriditarieta;

import lombok.Data;

@Data
public class Prodotto {
    private int id;
    private String nome;
    private int prezzo;

    public Prodotto() {
    }

    public Prodotto(int id, String nome, int prezzo) {
        this.id = id;
        this.nome = nome;
        this.prezzo = prezzo;
    }


}
