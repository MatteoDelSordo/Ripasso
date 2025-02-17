package eriditarieta;

public class ClasseFiglia extends ClasseMadre {


    @Override
    public void tiraLaCiavatta() {
//  super.tiraLaCiavatta(); Se non si commenta questa riga viene stampato il syso del metodo di ClasseMadre
        System.out.println("Non sai tirare bene la ciavatta come mamma");
    }

    @Override
    public void vieniQuiCheNonTiFaccioNiente() {
        super.vieniQuiCheNonTiFaccioNiente();
    }
}
