package com.studytest.studytest;

import java.util.*;

public class MapText {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Emp emp = new Emp("100001", "少男");
        Emp emp1 = new Emp("100002", "少女");
        Emp emp2 = new Emp("100003", "儿童");
        map.put(emp.getId(), emp.getName());
        map.put(emp1.getId(), emp1.getName());
        map.put(emp2.getId(), emp2.getName());
        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
        System.out.println("HashMap类实现的map无序集合：");
        while (iterator.hasNext()){
            String id = (String) iterator.next();
            String name = map.get(id);
            System.out.println(id + " " + name);
        }
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.putAll(map);
        Iterator<String> it = treeMap.keySet().iterator();
        System.out.println("TreeMap类实现的map有序集合：");
        while (it.hasNext()){
            String id = (String) it.next();
            String name = treeMap.get(id);
            System.out.println(id + " " + name);
        }
    }
}
