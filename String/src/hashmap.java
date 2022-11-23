import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,grade>hm=new HashMap<>();
        Student s1=new Student("ll","kk",1);
        Student s2=new Student("mm","kk",2);
        grade g1=new grade("A+");
        grade g2=new grade("A");
        hm.put(s1.id,g1);
        hm.put(s2.id,g2);
        //hm.remove(s1.id);
        for(Map.Entry m: hm.entrySet())
        {
            int key;
            grade value;
            key= (int) m.getKey();
            value= (grade) m.getValue();
            System.out.print(key+":");
            System.out.println(value.g);
        }


    }
}
