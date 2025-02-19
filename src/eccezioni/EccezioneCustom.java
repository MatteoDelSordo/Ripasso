package eccezioni;

import java.util.Scanner;

public class EccezioneCustom {
    static void validateImput(int i) throws InvalidInputException {
        if (i > 100) {
            throw new InvalidInputException("Questa è un eccezione");
        }
        System.out.println("Input valido");
    }

    public static void main(String[] args) {
        boolean b = true;
        Scanner s = new Scanner(System.in);
        while (b) {
            System.out.println("Inserisci un numero minore di 100");
            int i = s.nextInt();
            try {
                validateImput(i);
                b = false;
            } catch (InvalidInputException e) {
                System.out.println("Non puoi inserire un numero piu grande di 100");
                b = true;
            }

        }
        s.close();
    }
}

class InvalidInputException extends Exception {
    public InvalidInputException(String eccezione) {
    }
}
