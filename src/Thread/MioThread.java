package Thread;

public class MioThread extends Thread {


    @Override
    public void run() {
        String str = "il thread è partito";
        System.out.println(str);
    }
}




