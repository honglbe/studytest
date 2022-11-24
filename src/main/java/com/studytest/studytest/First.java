package com.studytest.studytest;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class First {
    static String s1 = "您好";
    public void test(){
        String s2 = "Java";
    }
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();

        /*
        Scanner reader = new Scanner(System.in);
        double sum =0;
        double t = 1;
        Date date = new Date();
        String s = String.format("%te", date);
        String year = String.format("%tY", date);
        String month = String.format("%tB", date);
        String day = String.format("%td", date);
        String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
        String str1 = "aaa@";
        String str2 = "aaaaa";
        String str3 = "1111@111ffyu.dfg.com";
        if(str1.matches(regex)){
            System.out.println(str1 + "是一个合法的E-mail地址");
        }
        if(str2.matches(regex)){
            System.out.println(str2 + "是一个合法的E-mail地址");
        }
        if(str3.matches(regex)){
            System.out.println(str3 + "是一个合法的E-mail地址");
        }
        int x = reader.nextInt();
        if(x % 2 == 0){
            System.out.println(x+"是偶数！");
        }else {
            System.out.println(x+"是奇数！");
        }
        for (int i = 1; i <=20; i++) {
            t*=i;
            sum += 1/t;
        }
        System.out.println(sum);
        System.out.println(s);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);

        long startTime = System.currentTimeMillis();
        String st = "";
        for (int i = 0; i < 10000; i++) {
            st += i;
        }
        long endTime = System.currentTimeMillis();
        long useTime = endTime - startTime;

        long sTime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("");
        for (int i = 0; i < 10000; i++) {
            builder.append(i);
        }
        long eTime = System.currentTimeMillis();
        builder.insert(5, "t");
        System.out.println(builder);
        long uTime = eTime - sTime;
        System.out.println("String连接字符花费时间" + useTime);
        System.out.println("StringBuilder连接字符花费时间" + uTime);

        Random random = new Random();
        int []arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }
        for (int i = 0; i < arr.length; i++) {
            while (i % 10 == 0){
                System.out.println();
                break;
            }
            System.out.print(arr[i]+ " 、");
        }
        long kaishiTime = System.currentTimeMillis();
        Arrays.sort(arr);
        long jiesuTime = System.currentTimeMillis();
        long usedTime = jiesuTime - kaishiTime;
        System.out.println("消耗时间：" + usedTime);

        System.out.print("-------------------------------------------------------");
        for (int i = 0; i < arr.length; i++) {
            while (i % 10 == 0){
                System.out.println();
                break;
            }
            System.out.print(arr[i]+ " 、");
        }

        */
        int[] a = {10, 11, 20, 19, 88, 99, 100, 10000, 666};
        //Arrays.sort(a);
        int index = Arrays.binarySearch(a, 0, 9, 666);
        System.out.println(index);


    }
}