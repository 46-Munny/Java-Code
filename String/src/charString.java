import java.io.IOException;
import java.util.Scanner;

public class charString {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            int n1 = input.nextInt();
            char c1[] = new char[n1];
            int n2 = input.nextInt();
            char c2[] = new char[n2];
            for (int i = 0; i < n1; i++) {
                c1[i] = (char) System.in.read();
            }

            for (int j = 0; j < n2; j++) {
                c2[j] = (char) System.in.read();
            }

            String s1=new String(c1);
            String s2=new String(c2);
            System.out.println(s1);
            System.out.println(s2);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
