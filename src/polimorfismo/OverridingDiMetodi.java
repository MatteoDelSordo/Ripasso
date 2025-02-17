package polimorfismo;

public class OverridingDiMetodi {
}
 class Animale{

    public void muoviti(){
        System.out.println("L'animale si muove");
    }

    class Cane extends Animale {
        @Override
        public void muoviti() {
//            super.muoviti();
            System.out.println("Il cane si muove e abbaia");
        }
    }
class Mucca extends Animale{
    @Override
    public void muoviti() {
//        super.muoviti();
        System.out.println("La mucca si muove e muggisce");
    }
}

 }