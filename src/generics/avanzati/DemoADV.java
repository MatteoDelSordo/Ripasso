package generics.avanzati;

public class DemoADV {
    public static void main(String[] args) {

        BottigliaADV<AcquaADV> bottiglia1 = new BottigliaADV<>(new AcquaADV());
        BottigliaADV<VinoADV> bottiglia2 = new BottigliaADV<>(new VinoADV());
        BraccioAutomaticoADV braccio1 = new BraccioAutomaticoADV(bottiglia1);
        braccio1.prendiBottiglia();
        braccio1.versaBevanda();

    }
}
