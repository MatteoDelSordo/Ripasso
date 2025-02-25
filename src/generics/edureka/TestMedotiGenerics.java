package generics.edureka;

public class TestMedotiGenerics {

    static <T> void genericDisplay(T element) {
        System.out.println(STR."\{element.getClass().getName()}=\{element}");


    }

    public static void main(String[] args) {
        genericDisplay(3333);
        genericDisplay("O mamma mia");
        genericDisplay(8969.2f);


    }

}
