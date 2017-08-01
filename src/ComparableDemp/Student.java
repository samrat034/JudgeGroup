package ComparableDemp;

/**
 * Created by SAMRAT on 7/26/2017.
 */
public class Student implements Comparable<Student>{
    int rollno;
    String name;
    int age;

    public Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        int comp;
        if(this.age==o.age)
            comp= 0;
        else if(age>o.age)
            comp= 1;
        else
            comp= -1;

        if(comp==0){
            return this.name.compareTo(o.name);
        }else {
            return comp;
        }
    }

    /*@Override
    public int compareTo(Student st) {
        if(age==st.age)
            return 0;
        else if(age>st.age)
            return 1;
        else
            return -1;
    }*/



}
