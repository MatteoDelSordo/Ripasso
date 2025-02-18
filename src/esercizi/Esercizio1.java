package esercizi;

import java.util.ArrayList;
import java.util.Collections;

/*dati numeri trova il piu grande*/
public class Esercizio1 {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            int randomNum = (int) (Math.random() * 1001);
            a.add(randomNum);

        }

        Collections.sort(a);
        System.out.println(a.get(a.size() - 1));


    }


}



