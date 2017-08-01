package arrayListExample.example1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by SAMRAT on 7/18/2017.
 */
public class TestCollection4 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");

        ArrayList<String> al2= new ArrayList<>();
        al2.add("Sonoo");
        al2.add("Hanumat");
        //Adding second list in first list
         al.addAll(al2);
       // al.removeAll(al);

        al.retainAll(al2);

        Iterator iterator = al.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
