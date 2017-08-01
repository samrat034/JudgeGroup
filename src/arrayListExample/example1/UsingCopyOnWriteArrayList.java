package arrayListExample.example1;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by SAMRAT on 7/25/2017.
 */
public class UsingCopyOnWriteArrayList {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<String>();
        //Adding elements to synchronized ArrayList
        al.add("Pen");
        al.add("Notebook");
        al.add("Ink");

        System.out.println("Displaying synchronized Elements: ");
        //Synchronized block is not required in this method

        Iterator<String> iterator = al.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
