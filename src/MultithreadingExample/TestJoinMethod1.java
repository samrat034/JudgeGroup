package MultithreadingExample;

/**
 * Created by SAMRAT on 7/31/2017.
 */
public class TestJoinMethod1 extends Thread {
    @Override
    public void run() {
        for(int i=1; i<=5; i++){
            try{
                Thread.sleep(500);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        TestJoinMethod1 t1 = new TestJoinMethod1();
        TestJoinMethod1 t2 = new TestJoinMethod1();
        TestJoinMethod1 t3 = new TestJoinMethod1();

        t1.start();
        try {
            t1.join();//join() methods waits for a thread to die
        }catch (Exception e){
            System.out.println(e);
        }

        t2.start();
        t3.start();
    }
}
