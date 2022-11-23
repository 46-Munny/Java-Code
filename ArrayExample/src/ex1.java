import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int a[]=new int[n];
        int i,j,max=0;
        for (i=0;i<n;i++)
        {
            a[i]=input.nextInt();
        }
        for(j=0;j<n;j++)
        {
            if(a[j]>max)
            {
                max=a[j];
            }
        }
        int c[]=new int[max+1];
        for (i=0;i<=max;i++)
        {
            c[i]=0;
        }
        for (j=0;j<n;j++)
        {
            c[a[j]]=c[a[j]]+1;
        }
        for (j=0;j<=max;j++)
        {
            if(c[j]>1)
            {
                System.out.println(j+" "+c[j]);
            }
        }
    }
}
