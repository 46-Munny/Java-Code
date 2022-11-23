import java.util.Scanner;

public class StringFormat {
    public static void main(String[] a){
        Scanner input=new Scanner(System.in);
        System.out.println("Input String:");
        String s=input.nextLine();
        System.out.println("use charAt:");
        System.out.println(s.charAt(3));
        System.out.println("Substring:");
        String sub=s.substring(4);
        System.out.println(sub);
        System.out.println("Substring:");
        String subst=s.substring(4,8);
        System.out.println(subst);
        System.out.println("Use contains:");
        String subs=input.next();
        boolean b=s.contains(subs);
        System.out.println(b);

    }
}
