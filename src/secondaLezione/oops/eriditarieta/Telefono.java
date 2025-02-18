package secondaLezione.oops.eriditarieta;

import lombok.Data;

@Data
public class Telefono extends Prodotto {

    private String os;
    private int ram;
    boolean sdCard;


    public Telefono(int id, String nome, int prezzo, String os, int ram, boolean sdCard) {
        super(id, nome, prezzo);
        this.os = os;
        this.sdCard = sdCard;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return super.toString() + "Telefono{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", sdCard=" + sdCard +
                "} ";
    }
}
