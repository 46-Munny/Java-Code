import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input String1:");
        String s1 = input.nextLine();
        String s=s1.toUpperCase();
        char ch[]=s.toCharArray();
        char a[ ]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int i,j,c;
        for (i=0;i<a.length;i++)
        {
            c=0;
            for (j=0;j<ch.length;j++) {
                if (a[i] == ch[j]) {
                    c++;
                }
            }
               if(c>=1)
               {
                   System.out.print(a[i]);
                   System.out.print(":");
                   System.out.println(c);
               }

        }
    }
}
