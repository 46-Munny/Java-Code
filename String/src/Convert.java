import java.util.Scanner;

public class Convert {
    public static void  main(String[] args) {


            Scanner input=new Scanner(System.in);
            System.out.println("Input String:");
            String s=input.nextLine();
            char a[]=s.toCharArray();
            System.out.println("Output CharArray:");
            for (int i=0;i<a.length;i++)
            {
                System.out.println(a[i]);
            }
    }
}
