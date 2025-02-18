package esercizi;

import java.util.ArrayList;

public class EsercizioTestTempo {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i > -1; i++) {
            long startTime = 0;
            long elapsedTime = System.currentTimeMillis() - startTime;
            a.add(1);

            if (i == 10000988) {
                System.out.println(a);
                long timeTillNextDisplayChange = 1000 - (elapsedTime % 1000);
                System.out.println(timeTillNextDisplayChange);
                break;
            }
        }
    }


}

class TempClass {
    long startTime;


}
