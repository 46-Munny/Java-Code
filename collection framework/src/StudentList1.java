import java.util.LinkedList;
import java.util.Scanner;

class student1
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

public class StudentList1 {
    public static void main(String[] args) {
        LinkedList<student1>lt=new LinkedList<student1>();
        student1 s[]=new student1[100];
        int i,j;
        Scanner input1=new Scanner(System.in);
        int n=input1.nextInt();
        for(i=1;i<=n;i++)
        {
            s[i].getinput();
            lt.add(s[i]);
        }

        for (student1 s1:lt)
        {
            System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getCg());
        }

    }
}
