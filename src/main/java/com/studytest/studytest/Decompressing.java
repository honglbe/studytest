package com.studytest.studytest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Decompressing {
    public static void main(String[] args) {
        try{
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream("/Users/honglibin/Downloads/hello.zip"));
            ZipEntry entry = zipInputStream.getNextEntry();

            while ((entry != null) && !entry.isDirectory()){
                File file = new File("/" + entry.getName());

                if(!file.exists()){
                    System.out.println("文件不存在");
                }

                System.out.println(file);
                zipInputStream.closeEntry();
                System.out.println("解压成功");
            }
            zipInputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
