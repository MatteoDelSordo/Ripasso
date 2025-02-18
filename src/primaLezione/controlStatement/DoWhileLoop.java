package primaLezione.controlStatement;

//l'unica differenza tra questo e il ciclo while è che il dowhile viene eseguito almeno una volta
public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 20;

        do {
            System.out.println(i);
            i++;
        } while (i <= 20);
        System.out.println(i);
/* questo è un primalezione.loop infinto
        int i =20;

        do {
            System.out.println(i);
            i++;
        }while (i>=20);
*/
    }
}
