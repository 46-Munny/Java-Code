import java.util.Scanner;

public class for2 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N,i,a,b;
        N= input.nextInt();


        for(i=0;i<N/2;i++)
        {
            a=i+1;
            b=N-i;

            System.out.print(a +" "+b+" ");
        }


    }
}

