package InnerClassDemo;

/**
 * Created by SAMRAT on 7/30/2017.
 */

interface Showable{
    void show();
    interface Message{
        void msg();
    }
}
class TestNestedInterface1 implements Showable.Message {
    public void msg(){
        System.out.println("Hello nested interface");
    }

    public static void main(String[] args) {
        Showable.Message message = new TestNestedInterface1();//upcasting here
        message.msg();
    }


}
