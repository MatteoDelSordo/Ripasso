package generics.avanzati;

public class BraccioAutomaticoADV {

    private BottigliaADV<? extends BevandaADV> bottiglia;

    public <T extends BottigliaADV<? extends BevandaADV>> BraccioAutomaticoADV(T bottiglia) {

        this.bottiglia = bottiglia;
        System.out.println(this.bottiglia.getContenuto());

    }

    public void prendiBottiglia() {
        System.out.println(STR."Ho preso \{bottiglia.getContenuto()}");
    }


    public void versaBevanda() {
        if (bottiglia != null && bottiglia.bicchieriDisponibili > 0) {
            System.out.println("versa " + bottiglia.getContenuto().toString());

        } else {
            System.out.println("La bottiglia è vuota");
        }
    }


}
