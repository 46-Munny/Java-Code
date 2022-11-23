package com.company;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        char c[]=s.toCharArray();
        char ch[]=new char[100];
        int n1=0;
        int i,j;
        char tmp;
        for(char a:c)
        {
           ch[n1]=a;
           n1++;
        }

        for(i=0;i<n1;i++)
        {
            for(j=0;j<n1;j++)
            {
                if(ch[j]>ch[j+1])
                {
                    tmp=ch[j];
                    ch[j]=ch[j+1];
                    ch[j+1]=tmp;
                }
            }
        }

     for(char cj:ch)
     {
         System.out.print(cj);
     }




    }
}
