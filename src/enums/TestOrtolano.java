package enums;

public class TestOrtolano {
    public static void main(String[] args) {

    Frutta[] f = Frutta.values();

        for (Frutta pippo: f){
            System.out.println(pippo + " : " +pippo.ordinal());
        }


        System.out.println("---Nuovo blocco---");


        Frutta f1,f2,f3,f4;
        f1 =Frutta.ARANCIA;
        f2 =Frutta.MIRTILLO;
        f3=Frutta.BANANA;
        f4=Frutta.MELA;

        if (f2.compareTo(f1)>0){

        }

    }
}
