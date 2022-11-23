import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String>hm=new HashMap<Integer, String>();
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int i;
        int key,k;
        String value,v;
        for(i=1;i<=n;i++)
        {
            key=input.nextInt();
            value=input.next();
            hm.put(key,value);
        }
        for(Map.Entry m:hm.entrySet())
        {
            k= (int) m.getKey();
            v= (String) m.getValue();
            System.out.println(k+":"+v);

        }
       // hm.remove(2);
        System.out.println(hm);
    }
}
