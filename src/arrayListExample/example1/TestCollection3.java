package arrayListExample.example1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by SAMRAT on 7/18/2017.
 */
public class TestCollection3 {
    public static void main(String[] args) {
        //Creating user-defined class objects
        Student s1= new Student(101, "Sonoo", 23);
        Student s2= new Student(102, "Ravi", 21);
        Student s3= new Student(103, "Hanumat", 25);

        //Creating Arraylist
        ArrayList<Student> arrayList = new ArrayList<Student>();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);

        //Getting Iterator
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            Student student = (Student) iterator.next();
           // System.out.println(student.getRollno()+" "+student.getName()+" "+ student.getAge());
            System.out.println(student);
        }

    }
}
