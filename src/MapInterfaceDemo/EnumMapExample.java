package MapInterfaceDemo;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by SAMRAT on 7/26/2017.
 */
public class EnumMapExample {
    //create an enum
    public enum Days{
        Monday, Tuesday, Wednesday, Thursday
    }

    public static void main(String[] args) {
        EnumMap<Days, String> map = new EnumMap<Days, String>(Days.class);
        map.put(Days.Monday, "1");
        map.put(Days.Tuesday, "2");
        map.put(Days.Wednesday,"3");
        map.put(Days.Thursday, "4");

        //Print the map;
        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+"  " +m.getValue());
        }
    }
}