package com.studytest.studytest;

import javax.swing.*;
import java.awt.*;

public class Example1 extends JFrame {
    public void createJFrame(String title){
        JFrame jf = new JFrame(title);
        Container container = jf.getContentPane();
        JLabel jl = new JLabel("这是一个JFrame窗体");
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jl);
        jf.setVisible(true);
        jf.setSize(200,300);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Example1().createJFrame("创建一个JFrame窗体");
    }
}
