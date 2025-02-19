package eccezioni;

/**/
public class SampleException {
    public static void main(String[] args) {
        String str = null;
        try {

            try {
                int a = 30, b = 0;
                int c = a / b;
                System.out.println(c);
            } catch (ArithmeticException e) {
                System.out.println("non puoi dividere per zero");
            }
            try {
                int num = Integer.parseInt("bhozzi");
                System.out.println(num);
            } catch (NumberFormatException e) {
                System.out.println("number format exception");

            }
            try {
                int[] a = new int[5];
                a[7] = 9;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bound");
            }
            int[] a = new int[5];
            a[7] = 9;
            System.out.println("lo gestisci?");
        } catch (Exception e) {
            System.out.println("Gestito");

        } finally {
            // Prova a commentare i catch sopra, lancera gli errori ma questo blocco sotto
            // verra sempre eseguito
            System.out.println("Questo blocco viene sempre eseguito.");
        }
        try {

            SampleExceptionDue.avg();

        } finally {
            System.out.println("Gestita");
        }

        System.out.println("-----Nuovo blocco di prova-----");
        try {

            throw new Exception();


        } catch (Exception e) {
            System.out.println("E");
        }
        System.out.println("-----Nuovo blocco di prova-----");
        try {
            throw new MiaEccezione(1);
        } catch (Exception e) {
            System.out.println(e);

        }


    }
}

class MiaEccezione extends Exception {
    int a;

    MiaEccezione(int b) {
        a = b;

    }

    public String toString() {
        return ("Numero eccezione = " + a);
    }


}

class SampleExceptionDue {
    static void avg() throws ArithmeticException {
        try {
            System.out.println("Dentro il metodo avg ");
            throw new ArithmeticException("prova");
        } catch (ArithmeticException e) {
            System.out.println("eccezione gestita con successo");
        }

    }


}
