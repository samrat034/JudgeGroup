package InnerClassDemo;

/**
 * Created by SAMRAT on 7/30/2017.
 */
public class LocalInner1 {
    private int data = 30; //Instance variable
    void display(){
        class Local{
            void msg(){
                System.out.println(data);
            }
        }

        Local l = new Local();
        l.msg();
    }

    public static void main(String[] args) {
        LocalInner1 obj = new LocalInner1();
        obj.display();
    }

}
