package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fcopy {

        public static void main(String args[]) {
            try {
                FileReader fr=new FileReader("C:\\Users\\Lenovo\\Desktop\\person1\\student1.txt");
                FileWriter fw=new FileWriter("C:\\Users\\Lenovo\\Desktop\\person1\\student1.txt");
                int c=fr.read();
                while(c!=-1) {
                    fw.write(c);
                }
                fr.close();
                fw.close();
            } catch(IOException e) {
                System.out.println(e);
            }
        }
    }

