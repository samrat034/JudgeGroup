package MapInterfaceDemo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by SAMRAT on 7/26/2017.
 */
public class MapInterfaceExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, null);
        map.put(104, null);
        map.put(105, null);
        map.put(106, "Rahul");
        map.put(107, "Amit");
        map.put(108, "Vijay");
        map.put(109, "Rahul");
        map.put(null, "samrat");

        map.remove(null);
      //  map.put(null, null);

        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
