package generics;

public class Bottiglia<T> {
    private T contenuto;

    public Bottiglia(T contenuto) {
        this.contenuto = contenuto;
    }


    public T getContenuto() {
        return contenuto;
    }
}
