package com.studytest.studytest;

import javax.swing.*;
import java.awt.*;

public class DrawIcon implements Icon {
    private int width;
    private int height;
    public int getIconWidth(){
        return this.width;
    }

    public int getIconHeight(){
        return this.height;
    }

    public DrawIcon(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void paintIcon(Component args0, Graphics args1, int x, int y){
        args1.fillOval(x, y , width, height);
    }

    public static void main(String[] args) {
        DrawIcon drawIcon = new DrawIcon(15, 15);
        JLabel jLabel = new JLabel("test", drawIcon, SwingConstants.CENTER);
        JFrame jFrame = new JFrame();
        Container container = jFrame.getContentPane();
        container.add(jLabel);
        //设置容器的背景颜色
        container.setBackground(Color.white);
        //设置窗体可视
        jFrame.setVisible(true);
        //设置窗体大小
        jFrame.setSize(200, 150);
        //设置窗体关闭方式
        jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}
