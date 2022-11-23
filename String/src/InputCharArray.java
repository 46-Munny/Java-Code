import java.util.Scanner;

public class InputCharArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input String:");
        String s=input.next();
        System.out.println("Input CharArray:");
        char a[]=input.next().toCharArray();
        System.out.println("Output String:");
        System.out.println(s);
        System.out.println("Output CharArray:");
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }
}
