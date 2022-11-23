package com.company;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        try
        {
            FileInputStream sourcefile=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\person1\\student1.txt");
            FileOutputStream targetfile=new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\person1\\student1.txt");
            int a;
            while ((a=sourcefile.read())!=-1)
            {
                targetfile.write(a);
                sourcefile.close();
                targetfile.close();
                System.out.println("file copied");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
