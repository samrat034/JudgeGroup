package InnerClassDemo;

/**
 * Created by SAMRAT on 7/29/2017.
 */
abstract class Person{
    abstract void eat();
}
public class TestAnonymousInner {
    public static void main(String[] args) {
        Person p = new Person() {
            @Override
            void eat() {
                System.out.println("Nice fruits");
            }

        };
        p.eat();
    }
}
