import java.util.Scanner;

public class StringFormat3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input String1:");
        String s1 = input.nextLine();
        System.out.println("Input string2:");
        String s2 = input.next();
        System.out.println("Input string3:");
        String s3 = input.next();
        System.out.println("use replace:");
        String s4 = s1.replace(s2, s3);
        System.out.println(s4);
    }
}
