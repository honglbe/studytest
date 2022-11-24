package com.studytest.studytest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Muster {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("楚天科技");
        list.add("300358");
        list.add("涨起来");
        list.add("5个点");
        for (int i = 0; i < list.size(); i++) {
            String output = list.get(i);
            System.out.println(output);
        }

    }
}
