package arrayListExample.example1;

import java.util.*;

/**
 * Created by SAMRAT on 7/25/2017.
 */
public class UsingSyncronizedList {
    public static void main(String[] args) {
        List<String> syncal = Collections.synchronizedList(new ArrayList<String>());

        //Adding elements to synchronized Arraylist
        syncal.add("Pen");
        syncal.add("NoteBook");
        syncal.add("Ink");

        System.out.println("Iterating synchronized ArrayList: ");
        //Iterator should be in synchronized block in this type of synchronization
        synchronized (syncal){
            Iterator<String> iterator = syncal.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
    }
}
