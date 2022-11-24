package com.studytest.studytest;

import java.util.*;

public class ZuoYe {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new TreeSet<>();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        for (int j = 0; j < list.size(); j++) {
            if(list.get(j) % 10 == 0){
                list.remove(j);
            }
        }

        System.out.println(list);
        System.out.println("------------------------------------------------------------------------");
        set1.add("A");
        set1.add("a");
        set1.add("C");
        set1.add("c");
        set1.add("a");

        set2.add("A");
        set2.add("a");
        set2.add("C");
        set2.add("c");
        set2.add("a");

        list1.add("A");
        list1.add("a");
        list1.add("C");
        list1.add("c");
        list1.add("a");

        list2.add("A");
        list2.add("a");
        list2.add("C");
        list2.add("c");
        list2.add("a");

        System.out.print(set1);
        System.out.println();
        System.out.print(set2);
        System.out.println();
        System.out.print(list1);
        System.out.println();
        System.out.print(list2);
    }
}