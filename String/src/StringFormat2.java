import java.util.Scanner;

public class StringFormat2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input String1:");
        String s = input.nextLine();

        System.out.println("Input char1:");
        char c1 = input.next().charAt(0);

        System.out.println("Input char2:");
        char c2 = input.next().charAt(0);

        System.out.println("use replace:");
        String s4 = s.replace(c1, c2);

        System.out.println(s4);
    }
}
