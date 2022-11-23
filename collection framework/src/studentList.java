import java.util.LinkedList;

public class studentList {
    public static void main(String[] args) {
        LinkedList<student>lt=new LinkedList<student>();
        student s1 = new student();
        student s2=new student();
        student s3=new student();
        s1.getinput();
        s2.getinput();
        s3.getinput();
       // s1.getoutput();

        lt.add(s1);
        lt.add(s2);
        lt.add(s3);
        for(student s:lt)
        {
            System.out.println(s.id+" "+s.name+" "+s.cls);
        }

    }
}
