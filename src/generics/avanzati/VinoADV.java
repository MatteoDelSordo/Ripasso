package generics.avanzati;

public class VinoADV implements BevandaADV<VinoADV> {

    int bicchieriDisponibili = 6;

    @Override
    public String toString() {
        return "Una bottiglia di vino";
    }
}
