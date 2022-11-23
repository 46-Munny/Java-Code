import java.util.Arrays;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        String st=s.toUpperCase();
        int n=st.length();

        char c[]=st.toCharArray();
        char ch[];
        Arrays.sort(c);
        int i,j,cnt,k=0,ct;
        for(i=0;i<n;i++)
        {
            cnt=0;
            if(c[i]>='A'&&c[i]<='Z')
            {
                for(j=0;j<n;j++)
                {
                    if(c[i]==c[j])
                    {
                      cnt++;
                    }
                }
                System.out.println(c[i]+":"+" "+cnt);

            }
        }

    }
}
