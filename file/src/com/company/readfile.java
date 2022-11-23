package com.company;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class readfile {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            Formatter ft=new Formatter("C:\\Users\\Lenovo\\Desktop\\person1\\student3.txt");
            Scanner input=new Scanner(System.in);
            int n=input.nextInt();

            for(int i=1;i<=n;i++)
            {
                String id=input.next();
                String name=input.next();

                ft.format("%s %s\n",id,name);
            }
            ft.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
    }

}
