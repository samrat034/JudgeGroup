package collectionexample;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

/**
 * Created by SAMRAT on 7/18/2017.
 */
public class arraylist1 {
    public static void main(String[] args) {
        List<String> alpha = asList("a", "b", "c", "d");

        //Before java8

        List<String> alphaUpper = new ArrayList<>();
        for(String s : alpha){
            alphaUpper.add(s.toUpperCase());
        }

        System.out.println(alpha);
        System.out.println(alphaUpper);

        //java8
        List<String> collect = alpha.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(collect);

        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> collect1 = num.stream()
                                    .map(n->n*2)
                                    .collect(Collectors.toList());
        System.out.println(collect1);



    }
}
