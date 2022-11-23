import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String s1=input.next();
        String s2=input.next();
        String s3=input.next();
        String s,sub;
        int n,i,j,l1,l2;
        l1=s1.length();
        l2=s2.length();

       /* for(i=0;i<l1;i++)
        {
            if(l1>=i+l2)
            {
                sub= s1.substring(i,i+l2);
                //System.out.println(sub);
                if(s2.equals(sub))
                {
                   System.out.print(s1.replace(sub,s3));
                   i=i+l2-1;
                }
            }

        }*/
        sub= s1.substring(0,l2);
        System.out.print(s1.replace(sub,s3));


    }
}
