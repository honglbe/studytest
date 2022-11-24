package com.studytest.studytest;

import java.io.*;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("world.txt");
        if(file.exists()){
            file.delete();
            System.out.println("文件已删除！");
            try{
                file.createNewFile();
                System.out.println("文件已创建！");
            } catch (Exception e){
                e.printStackTrace();
            }
        }else {
            try{
                file.createNewFile();
                System.out.println("文件已创建！");
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        String path = file.getAbsolutePath();
        System.out.println("文件所在位置：" + path);
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("helloWorld.txt");
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.writeUTF("使用writeUTF()方法以写入");
            dataOutputStream.writeChars("writeChars()方法以写入");
            dataOutputStream.writeBytes("writeBytes()方法以写入");
            dataOutputStream.close();
            FileInputStream fileInputStream = new FileInputStream("helloWorld.txt");
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            System.out.println(dataInputStream.readUTF());
            System.out.println(dataInputStream.readChar());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
