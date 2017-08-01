package MapInterfaceDemo;

import java.awt.event.ItemEvent;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by SAMRAT on 7/26/2017.
 */
enum days{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumSetExample {
    public static void main(String[] args) {
        //Set<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);
        Set<days> set1 = EnumSet.allOf(days.class);
        System.out.println("Week Days:" +set1);
        //Traversing elements
        Iterator<days> iterator = set1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
