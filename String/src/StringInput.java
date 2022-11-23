import  java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner input = new Scanner("hello cse 27");
        while (input.hasNext()) {
            System.out.println(input.next());

        }
    }
}
