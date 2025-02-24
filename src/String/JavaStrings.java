package String;

public class JavaStrings {
    public static void main(String[] args) {


        String str = "hello";
        String str2 = "hello";


        if (str == str2) {
            System.out.println("1 e 2 Sono uguali");
        } else {
            System.out.println("1 e 2 Non sono uguali");
        }

        String str3 = new String("hello");
        String str4 = new String("hello");

        if (str3 == str4) {
            System.out.println("3 e 4 Sono uguali");
        } else {
            System.out.println("3 e 4 Non sono uguali");
        }

        if (str3.equals(2)) {
            System.out.println("2 e 3 Sono uguali");
        } else {
            System.out.println("2 e 3 Non sono uguali");
        }

        StringBuffer sb = new StringBuffer("hello");

        sb.append("world");

        System.out.println("Buffer is " + sb);



    }
}
