package com.company;

import java.util.Scanner;

public class prb2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n,i,j;

         String s =input.nextLine();
         n=s.length();

         for(i=0;i<n;i++)
         {
             for(j=0;j<=i;j++)
             {
                 System.out.print(s.charAt(j));
             }
             System.out.println();
         }

    }
}
