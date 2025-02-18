package primaLezione.conditionalStatements;

public class NestedIf {
    public static void main(String[] args) {
        int n1 = 20, n2 = 70, n3 = -10, piuGrande;
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
