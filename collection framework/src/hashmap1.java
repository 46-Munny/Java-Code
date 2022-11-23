import java.util.HashMap;
import java.util.Map;

public class hashmap1 {
    public static void main(String[] args) {
        HashMap<Integer,employee>hm=new HashMap<Integer,employee>();
        employee e1=new employee(1,"munny",70000);
        employee e2=new employee(1,"honey",65000);
        employee e3=new employee(1,"Ripa",85000);
        hm.put(1,e1);
        hm.put(2,e2);
        hm.put(3,e3);

        for (Map.Entry<Integer,employee> m:hm.entrySet())
        {
            int id;
            employee e;
            id=(int) m.getKey();
             e = (employee) m.getValue();
            System.out.println(id);
           System.out.println(e.id+" "+e.name+" "+e.salary);

        }
    }
}
