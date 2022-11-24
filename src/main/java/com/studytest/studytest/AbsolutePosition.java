package com.studytest.studytest;

import javax.swing.*;
import java.awt.*;

public class AbsolutePosition extends JFrame {
    public AbsolutePosition(){
        setTitle("本窗体使用绝对布局");
        setLayout(null);
        setBounds(0, 0, 200, 150);
        Container container = getContentPane();
        JButton jButton = new JButton("确定");
        JButton jButton1 = new JButton("取消");
        jButton.setBounds(10,30,80,30);
        jButton1.setBounds(60,70,100,20);
        container.add(jButton);
        container.add(jButton1);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new AbsolutePosition();
    }
}
