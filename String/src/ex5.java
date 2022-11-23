import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        String st[]=s.split(" ");
        int max=0,c=-1,tmp,ct=-1;
        int c1 = 0,c2 = 0;
        int min=6789;
        for(String str:st)
        {
            int l=str.length();
            c++;
            if(l<min)
            {
               tmp=l;
               l=min;
               min=tmp;
               c1=c;

            }
            
        }

        for(String str1:st)
        {
            int l1=str1.length();
            System.out.println("str1:"+str1);
            System.out.println("l1:"+l1);
            ct++;
            if(l1>max)
            {
                tmp=l1;
                l1=max;
                max=tmp;
                c2=ct;

            }

        }


        System.out.println(st[c1]);
        System.out.println(st[c2]);
    }
}
