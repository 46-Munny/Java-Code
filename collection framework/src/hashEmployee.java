import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class  employee1
{
    private int id;
    private String name;

    public void getinput()
    {
        Scanner input=new Scanner(System.in);
        id=input.nextInt();
        name=input.next();
    }

    public employee1 getIdname() {
        employee1 em=new employee1();
        em.id=
    }


}

public class hashEmployee {
    public static void main(String[] args) {
        HashMap<Integer,employee1>hm=new HashMap<>();
        Scanner input=new Scanner(System.in);
        employee value,v;
        int key,k;
        int n=input.nextInt();
        for(int i=1;i<=n;i++)
        {
            employee1 e=new employee1();
            key=input.nextInt();
            e.getinput();
            //employee1 em=new employee1();

            hm.put(key,e.getId());
        }

        for(Map.Entry<Integer,employee1>m:EntryS)

    }
}
