package com.studytest.studytest;

import lombok.Synchronized;

public class ThreadSafeTest implements Runnable{
    int num = 10;
    public void run() {
        while (true){
            synchronized(""){
                if(num > 0){
                    try {
                        Thread.sleep(100);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    System.out.println("tickets" + num--);
                }
            }
        }
    }

    public static void main(String[] args) {
        ThreadSafeTest threadSafeTest = new ThreadSafeTest();
        Thread xA = new Thread(threadSafeTest);
        Thread xB = new Thread(threadSafeTest);
        Thread xC = new Thread(threadSafeTest);
        Thread xD = new Thread(threadSafeTest);
        xA.start();
        xB.start();
        xC.start();
        xD.start();

    }
}
