import java.util.ArrayList;
import java.util.Scanner;

public class arraylist1 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter no of elements:");
        int n=input.nextInt();
        ArrayList<Integer>num=new ArrayList<>();
        int i,number;
        for(i=1;i<=n;i++)
        {
           number=input.nextInt();
           num.add(number);
        }

        System.out.println(num);

    }
}
