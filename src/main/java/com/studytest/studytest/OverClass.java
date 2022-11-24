package com.studytest.studytest;

public class OverClass<T> {
    private T over;
    public T getOver(){
        return over;
    }

    public void setOver(T over) {
        this.over = over;
    }

    public static void main(String[] args) {
        OverClass<Boolean> b = new OverClass<>();
        OverClass<Float> f = new OverClass<>();
        OverClass<Integer> i = new OverClass<>();
        b.setOver(true);
        f.setOver(24.24f);
        i.setOver(24);
        Boolean br = b.getOver();
        Float fr = f.getOver();
        Integer ir = i.getOver();
        System.out.println(br);
        System.out.println(fr);
        System.out.println(ir);
    }
}
