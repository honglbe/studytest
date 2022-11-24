package com.studytest.studytest;

public class Example_01 {
    String s;
    int i;
    int j;
    int k;
    private Example_01(){

    }

    protected Example_01(String s, int i, int j, int k){
        this.s = s;
        this.i = i;
        this.j = j;
        this.k = k;
    }

    public Example_01(String...Strings) throws NumberFormatException{
        if(0 < Strings.length){
            i = Integer.valueOf(Strings[0]);
        }
        if(1 < Strings.length){
            j = Integer.valueOf(Strings[1]);
        }
        if(2 < Strings.length){
            k = Integer.valueOf(Strings[2]);
        }
    }

    public void print(){
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
    }
}
