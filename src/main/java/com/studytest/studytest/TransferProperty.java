package com.studytest.studytest;

public class TransferProperty {
    int a =47;
    public void call(){
        System.out.println("调用call()方法");
        for (int i = 1; i < a; i++) {
            System.out.print(i + " ");
            if(i % 10 == 0){
                System.out.println("\n");
            }
        }
    }

    public TransferProperty(){
        System.out.println("这是构造方法1");
    }

    public TransferProperty(String i){
        System.out.println("这是构造方法2");
    }

    public TransferProperty(int i, int j){
        int k = i +j;
        System.out.println("这是构造方法3"+ "结果是：" + k);
    }

    public static void main(String[] args) {
        TransferProperty t = new TransferProperty();
        TransferProperty t1 = new TransferProperty();
        TransferProperty t2 = new TransferProperty("aaaa");
        TransferProperty t3 = new TransferProperty(11, 22);
        t.a = 60;
        System.out.println("第一个实例对象调用变量a的结果：" + t.a++);
        t.call();
        System.out.println("第一个实例对象调用变量a的结果：" + t1.a++);
        t1.call();
    }

}
