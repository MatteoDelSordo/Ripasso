package generics.avanzati;

public class AcquaADV implements BevandaADV<AcquaADV> {

    int bicchieriDisponibili = 5;


    @Override
    public String toString() {
        return "Una bottiglia di acqua";
    }


}
