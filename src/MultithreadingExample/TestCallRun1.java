package MultithreadingExample;

/**
 * Created by SAMRAT on 7/31/2017.
 */
public class TestCallRun1 extends Thread {
    @Override
    public void run() {
        System.out.println("running....");
    }

    public static void main(String[] args) {
        TestCallRun1 t1 = new TestCallRun1();
        t1.run(); //fine, but doesn't start as a separate call stack
    }

    //There is no context switching because here t1 and t2 will be treated as normal object not thread object.
}
