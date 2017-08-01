package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by SAMRAT on 7/17/2017.
 */
public class Main {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        //foreach
        System.out.println("Using forEach loop");
        for(String lists : list){
            System.out.println(lists);
        }

        //Iterator
        System.out.println("From Iterator:");
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //lambda
        System.out.println("From Lambda:");
        list.forEach(l -> System.out.println(l));

        //Output Ajay
        System.out.println("Printing Ajay::");
        list.forEach(l->{
            if("Ajay".equals(l)){
                System.out.println(l);
            }
        });

        //stream and filter
        //output: Ravi
        System.out.println("Printing Ravi::");
        list.stream()
                .filter(l->l.contains("Ravi"))
                .forEach(System.out::println);


        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);

        for(Map.Entry<String, Integer> entry : items.entrySet()){
            System.out.println("Item: " +entry.getKey() + " Count :" +entry.getValue());
        }

        items.forEach((k,v) ->System.out.println("Item: " +k + " Count :" +v));

        items.forEach((k,v) -> {
            System.out.println("Item: " + k + "Count: " + v);
            if("E".equals(k)){
                System.out.println("Hello E");
            }
        });
    }
}
