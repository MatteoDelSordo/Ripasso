package Thread;

public class Test {
    public static void main(String[] args) {
        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Mainnnnnnnnn");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(5);
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().isAlive());


        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("You are done");
        System.out.println("----------------------");
        MioThread mioT = new MioThread();
        System.out.println(mioT.isAlive());
        mioT.run();
        System.out.println(mioT.isAlive());
        mioT.setDaemon(true);
        mioT.start();
        System.out.println(mioT.isAlive());
        System.out.println(Thread.activeCount());
        System.out.println(mioT.getName());
        mioT.setName("Pippo");
        System.out.println(mioT.getName());
        System.out.println(mioT.isDaemon());
        System.out.println(mioT.isDaemon());


    }
}
