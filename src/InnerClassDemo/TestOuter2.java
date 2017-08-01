package InnerClassDemo;

/**
 * Created by SAMRAT on 7/30/2017.
 */
public class TestOuter2 {
    static int data = 30;
    static class Inner{
        static void msg(){
            System.out.println("Data is :" +data);
        }
    }

    public static void main(String[] args) {
        TestOuter2.Inner.msg();//No need to create the instance of static nested class
    }
}
