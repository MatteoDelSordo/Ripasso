package serialization;

import java.io.Serializable;

public class Dipendente implements Serializable {


    private static final long serialVersionUID = 1L;
    int id;
    String name;

    public Dipendente(int id,
                      String name) {
        this.id = id;
        this.name = name;
    }
}
