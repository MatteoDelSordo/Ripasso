package primaLezione.conditionalStatements;

public class BreakStatement {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 40, 50};
        System.out.println("Ciclo l'array..");
        for (int num : a) {
            if (num == 40) {
                System.out.println("sono arrivato a 40");
                break;
            }
            System.out.println(num);
//            System.out.println("\n");

        }

    }
}
