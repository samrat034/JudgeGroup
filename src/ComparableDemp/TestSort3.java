package ComparableDemp;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by SAMRAT on 7/26/2017.
 */
public class TestSort3 {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(101, "Vijay", 23));
        al.add(new Student(102, "Ajay", 23));
        al.add(new Student(105, "Jai", 21));

        Collections.sort(al);
        for(Student st : al){
            System.out.println(st.rollno+ " "+st.name+" " +st.age);
        }
    }
}
