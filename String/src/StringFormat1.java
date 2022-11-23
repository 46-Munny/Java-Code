import java.util.Scanner;

public class StringFormat1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input String1:");
        String s1 = input.nextLine();
        System.out.println("Input String2:");
        String s2 = input.nextLine();
        System.out.println("use concate:");
        String s3=s1.concat(s2);
        System.out.println(s3);
        System.out.println("use join:");
         String s=String.join("/","you","are","good");
        System.out.println(s);

    }
}
