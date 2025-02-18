package conditionalStatements;
//prendi questa monnezza e falla funzionare
public class EsercizioNestedIf {
    public static void main(String[] args) {
        int n1 = 10, n2 = 30, n3 = -10, piuGrande;
        if (n1 >= n2) {
            if (n1 >= n3) {
                piuGrande = n1;
            } else {
                piuGrande = n3;
            }
        } else {
            if (n2 >= n3) {
                piuGrande = n2;
            } else {
                piuGrande = n3;
            }
        }
        System.out.println("Il numero piu grande è " + piuGrande);
    }
}
