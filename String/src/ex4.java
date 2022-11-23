import java.util.Arrays;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        int n=s.length();
        int a[]=new int[n];
        String st;
        int i=0;
        Scanner input1=new Scanner(s);
        Scanner input2=new Scanner(s);
        Scanner input3=new Scanner(s);
        //input1.useDelimiter(" ");
        while (input1.hasNext())
        {
            st=input1.next();
            a[i]=st.length();
            i++;
        }


        int max=0;
        int min=23456;
        for(int j=0;j<i;j++)
        {
            if(a[j]>=max)
            {
                max=a[j];
            }
            if(a[j]<min)
            {
                min=a[j];
            }
        }
        System.out.println(max+" "+min);

        int l;
        while (input2.hasNext())
        {
            st=input2.next();
            l=st.length();
            if(min==l)
            {
                System.out.println("smallest world:"+st);
                break;
            }

        }
        while (input3.hasNext())
        {
            st=input3.next();
            l=st.length();
            if(max==l)
            {
                System.out.println("smallest world:"+st);
                break;
            }

        }

    }
}
