package com.company;

import java.io.File;
import java.util.Scanner;

public class writeFile {
    public static void main(String[] args) {
        try
        {
            File file=new File("C:\\Users\\Lenovo\\Desktop\\person1\\student1.txt");
            Scanner input=new Scanner(file);
            String id,name;
            while (input.hasNext())
            {
                id=input.next();
                name=input.next();
                System.out.println(id+" "+name);
            }
            input.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
