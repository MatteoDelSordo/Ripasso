package generics.avanzati;

public class BottigliaADV<T extends BevandaADV> {

    private T contenuto;

    int bicchieriDisponibili = 5;

    public BottigliaADV(T t) {
        this.contenuto = t;
    }

    public T getContenuto() {
        return contenuto;
    }
}
