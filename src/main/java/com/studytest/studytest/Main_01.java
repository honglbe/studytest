package com.studytest.studytest;

import java.lang.reflect.Constructor;

public class Main_01 {
    public static void main(String[] args) {
        Example_01 exampleC = new Example_01("honglb", 1, 2, 3);
        Constructor[] declaredConstructors = exampleC.getClass().getDeclaredConstructors();
        for (int i = 0; i < declaredConstructors.length; i++) {
            Constructor constructor = declaredConstructors[i];
            System.out.println("查看是否有允许带有可变参数量的参数：" + constructor.isVarArgs());
        }

    }

}
