package com.studytest.studytest;

import java.util.*;

public class UpdateStu implements Comparable<Object> {
    String name;
    String className;
    long id;
    public UpdateStu(String name, long id, String className){
        this.id = id;
        this.name = name;
        this.className = className;
    }

    public int compareTo(Object o){
        UpdateStu updateStu = (UpdateStu)o;
        int result = id > updateStu.id ? 1 : (id == updateStu.id ? 0 : -1);
        return result;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public static void main(String[] args) {
        UpdateStu stu1 = new UpdateStu("李同学", 1011, "高三一班");
        UpdateStu stu2 = new UpdateStu("洪同学", 1012, "高三二班");
        UpdateStu stu3 = new UpdateStu("陈同学", 1013, "高三三班");
        UpdateStu stu4 = new UpdateStu("陆同学", 1014, "高三四班");
        UpdateStu stu5 = new UpdateStu("周同学", 1015, "高三五班");
        TreeSet<UpdateStu> tree = new TreeSet<>();
        tree.add(stu1);
        tree.add(stu2);
        tree.add(stu3);
        tree.add(stu4);
        tree.add(stu5);
        Iterator<UpdateStu> it = tree.iterator();
        System.out.println("Set集合中的所有元素：");
        while (it.hasNext()){
            UpdateStu up = (UpdateStu) it.next();
            System.out.println(up.getClassName() + up.getName() + "的学号：" + up.getId() );
        }
        it = tree.headSet(stu2).iterator();
        System.out.println("截取前面部分的集合：");
        while (it.hasNext()){
            UpdateStu up = (UpdateStu) it.next();
            System.out.println(up.getClassName() + up.getName() + "的学号：" + up.getId());
        }
        it = tree.subSet(stu2, stu5).iterator();
        System.out.println("截取sub2 - sub5之间的集合：");
        while (it.hasNext()){
            UpdateStu up = (UpdateStu) it.next();
            System.out.println(up.getClassName() + up.getName() + "的学号：" + up.getId());
        }

        Map<Integer, String> map = new HashMap<>();
        map.put(900001, "小明");
        map.put(900002, "小红");
        map.put(900003, "小芳");
        map.put(900004, "小倩");
        map.put(900005, "小勇");
        map.put(900006, "小斌");
        Set<Integer> set = map.keySet();
        Iterator<Integer> mapIt = set.iterator();
        System.out.println("key集合中的元素：");
        while (mapIt.hasNext()){
            System.out.println(mapIt.next());
        }
        Collection<String> coll = map.values();
        Iterator<String> mapIt1 = coll.iterator();
        System.out.println("values集合中的元素：");
        while (mapIt1.hasNext()){
            System.out.println(mapIt1.next());
        }

    }
}
