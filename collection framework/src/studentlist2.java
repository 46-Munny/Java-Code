import java.util.LinkedList;
import java.util.Scanner;

class student2
{
    private int id;
    private String name;
    private  float cg;

    public  void getinput()
    {
        Scanner input=new Scanner(System.in);
        id=input.nextInt();
        name=input.next();
        cg=input.nextFloat();
    }

    public int getId() {
        return id;
    }
    public String getName()
    {
        return name;
    }

    public float getCg() {
        return cg;
    }
}

public class studentlist2 {
    public static void main(String[] args) {
        LinkedList<student2>lt=new LinkedList<>();
       // student1 s[]=new student1[100];
        int i,j;
        Scanner input1=new Scanner(System.in);
        int n=input1.nextInt();
        for(i=1;i<=n;i++)
        {
            student2 s=new student2();
            s.getinput();
            lt.add(s);
        }

        for (student2 s1:lt)
        {
            System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getCg());
        }

    }
}

