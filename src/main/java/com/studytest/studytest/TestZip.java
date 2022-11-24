package com.studytest.studytest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class TestZip {
    private void fileToZip(String srcFile, String destFile) throws IOException{
        File file  = new File(srcFile);
        String fileName = file.getName();
        FileInputStream fi = new FileInputStream(file);
        ZipOutputStream zop = new ZipOutputStream(new FileOutputStream(destFile));
        zop.putNextEntry(new ZipEntry(fileName));
        int temp = 0;
        while((temp = fi.read()) != -1){
            zop.write(temp);
        }
        fi.close();
        zop.close();
    }
    public static void main(String[] args) {
        TestZip book = new TestZip();
        try{
            book.fileToZip("/Users/honglibin/Downloads/test.png","/Users/honglibin/Downloads/hello.zip");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
