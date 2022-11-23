package com.company;

import java.io.File;
import java.io.IOException;

public class file2 {
    public static void main(String[] args) {
        File dir=new File("C:\\Users\\Lenovo\\Desktop\\person1");
        dir.mkdir();
        String dirloc=dir.getAbsolutePath();
        File file1=new File(dirloc+"//student1.txt");
        File file2=new File(dirloc+"//student2.txt");
        File file3=new File(dirloc+"//student3.txt");

        try
        {
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        file2.delete();
        if(file2.exists())
        {
            System.out.println("file2 exists");
        }

        else
        {
            System.out.println("file2 not exists");
        }

    }
}
