package com.company;

import java.io.File;

public class file3 {
    public static void main(String[] args) {
        File  dir=new File("C:\\Users\\Lenovo\\Desktop\\person1");
        //dir.mkdir();
        String dirloc=dir.getAbsolutePath();
        String[] contains =dir.list();
        System.out.println();

        for(int i=0;i<contains.length;i++)
        {
            System.out.println(contains[i]);
        }
    }
}
