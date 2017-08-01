package MultithreadingExample;

/**
 * Created by SAMRAT on 7/31/2017.
 */
public class TestThreadTwice1 extends Thread {
    @Override
    public void run() {
        System.out.println("running....");
    }

    public static void main(String[] args) {
        TestThreadTwice1 t1 = new TestThreadTwice1();
        t1.start();
        t1.start();//No we cannot start a thread twice, If you do so,
        //IllegalThreadStateException is thrown
    }
}
