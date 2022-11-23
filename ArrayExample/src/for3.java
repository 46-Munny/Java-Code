import java.util.Scanner;

public class for3 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n1,n2,i,ln,ln3;

        String sn;
        n1=input.nextInt();
        n2=input.nextInt();
        for (i=n1;i<=n2;i++)
        {
            sn=String. valueOf(i) ;
            ln=sn.length();
            //System.out.println(ln);
            if(ln%2!=0)
            {
               ln3=(ln-1)/2;
                //System.out.println(ln3);
              if(sn.charAt(ln3)=='0')
              {
                  System.out.println(sn);
              }

            }
        }

    }
}
