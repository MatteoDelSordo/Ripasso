package eccezioni;

public class SampleException {
    public static void main(String[] args) {
        String str = null;
//        System.out.println(str.length());
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
            int a[] = new int[5];
            a[7] = 9;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound");
        }


    }
}
