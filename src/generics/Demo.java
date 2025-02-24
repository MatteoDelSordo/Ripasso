package generics;

public class Demo {
    public static void main(String[] args) {

        Bottiglia<Vino> bottiglia1 = new Bottiglia<>(new Vino());
        Bottiglia<Acqua> bottiglia2 = new Bottiglia<>(new Acqua());
        BraccioAutomatico braccio = new BraccioAutomatico();
        braccio.prendiBottiglia(bottiglia1);
        braccio.prendiBottiglia(bottiglia2);


    }
}
