package com.studytest.studytest;

public class BubbleSort {

    public static void main(String[]args){
        int[] a= {55, 44, 99, 5, 1};
        BubbleSort bubbleSort = new BubbleSort();
        //bubbleSort.bubbleSort(a);
        //bubbleSort.selectSort(a);
        //bubbleSort.reverseSort(a);
        /*for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }*/
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    public void bubbleSort(int a[]){
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a.length - i; j++) {
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    public void selectSort(int a[]){
        int index;
        for (int i = 1; i < a.length; i++) {
            index = 0;
            for (int j = 1; j < a.length - i; j++) {
                if(a[j] > a[index]){
                    index = j;
                }
            }
            int temp = a[a.length - i];
            a[a.length - i] = a[index];
            a[index] = temp;
        }
    }

    public void reverseSort(int a[]){
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
    }
}
