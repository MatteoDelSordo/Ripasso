package primaLezione.eccezioni;

public class EccezioneArrayDivisione {
    public static void main(String[] args) {
        int array[] = {10, 20, 30};
        int num1 = 15, num2 = 0;
        int risultato = 0;

        try {
            risultato = num1/num2;
            System.out.println("Il risultato è " + risultato);

            for (int i = 2; i >=0; i--) {
                System.out.println("il valore dell array è " + array[i]);
            }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("l'array è ''out of  bound'' ");
        }catch (ArithmeticException e){
            System.out.println("non si puo dividere per 0");
        }





    }
}
