import java.util.Scanner;

public class for1 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,i;
        a= input.nextInt();
        b= input.nextInt();

        for(i=a;i<=b;i++)
        {
            if(i%3==0 & i%5!=0)
            {
                System.out.println(i);
            }
            else if(i%5==0 & i%3!=0)
            {
                System.out.println(i);
            }
        }


    }
}
