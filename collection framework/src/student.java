import java.util.Scanner;

public class student {
    int id;
    String name;
    String cls;

    student()
    {
        id=1;
        name="mm";
        cls="8";

    }
    void getinput()
    {
        Scanner input=new Scanner(System.in);
        id=input.nextInt();
        name=input.next();
        cls=input.next();
    }
    void getoutput()
    {
        System.out.println(id+" "+name+" "+cls+" ");
    }
}
