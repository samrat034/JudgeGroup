package collectionexample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by SAMRAT on 7/18/2017.
 */
public class BeforeJava8 {
    public static void main(String[] args) {
        List<Staff> staff = Arrays.asList(
                new Staff ("Samrat", 30, new BigDecimal(10000)),
                new Staff("Ram", 40, new BigDecimal(20000)),
                new Staff("Shyam", 35, new BigDecimal(30000))

        );

        List<StaffPublic> result = convertToStaffPublic(staff);
        System.out.println(result);


    }

    private static List<StaffPublic> convertToStaffPublic(List<Staff> staff){
        List<StaffPublic> result = new ArrayList<>();
        for(Staff temp: staff){

            StaffPublic obj = new StaffPublic();
            obj.setName(temp.getName());
            obj.setAge(temp.getAge());
            if("Samrat".equals(temp.getName())){
                obj.setExtra("This field is for mkyongonly");
            }

            result.add(obj);



        }
        return result;
    }
}
