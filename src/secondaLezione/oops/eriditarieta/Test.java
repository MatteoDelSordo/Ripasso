package secondaLezione.oops.eriditarieta;

public class Test {
    public static void main(String[] args) {
        Prodotto p1 = new Prodotto(1,"iphone scemo",1099);
        System.out.println(p1);
        Prodotto p2 = new Telefono(2,"iphone sciocco",1099,"ios",8,false);
        System.out.println(p2);

    }

}
