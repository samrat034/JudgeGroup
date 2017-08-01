package MultithreadingExample;

/**
 * Created by SAMRAT on 7/31/2017.
 */
public class Multi3Runnable implements Runnable {
    @Override
    public void run() {
        System.out.println("THread is Running by using Runnable Interface");
    }

    public static void main(String[] args) {
        Multi3Runnable m1 = new Multi3Runnable();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}
