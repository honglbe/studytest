package com.studytest.studytest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyJDialog extends JDialog {
    public MyJDialog(){
        //super(frame, "第一个dialog窗体", true);
        Container container = getContentPane();
        JLabel jl = new JLabel("这是一个对话框");
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jl);
        setBounds(300, 300, 300 ,300);
    }
}

public class MyFrame extends JFrame {
    public static void main(String[] args) {
        new MyFrame();
    }

    public MyFrame(){
        JFrame jf = new JFrame();
        Container container = jf.getContentPane();
        jf.setVisible(true);
        jf.setSize(500,600);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        container.setLayout(null);
        JLabel jl = new JLabel("这是一个JFrame窗体");
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jl);
        JButton jb = new JButton("弹出对话框");
        jb.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jb);
        jb.setBounds(10,10,100,21);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyJDialog().setVisible(true);
            }
        });
        container.add(jb);
    }

}
