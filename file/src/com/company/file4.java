package com.company;

import java.io.FileNotFoundException;
import java.util.Formatter;

public class file4 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            Formatter ft=new Formatter("C:\\Users\\Lenovo\\Desktop\\person1\\student1.txt");
                   ft.format("%s %s\n","1","Munny");
                   ft.format("%s %s\n","2","Honey");
                   ft.close();
                }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
            }
        }

    }

