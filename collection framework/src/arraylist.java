import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {
    public  static void  main(String s[])
    {
        ArrayList<Integer>num=new ArrayList<>();
        num.add(10);
        num.add(20);
        int n;
        num.add(1,70);
        System.out.println(num);
        int k=num.get(1);
        System.out.println(k);
        //ArrayList<Integer>num1=new ArrayList<>();
        ArrayList<Integer>num1=(ArrayList<Integer>)num.clone();
        System.out.println(num1);



    }

}
