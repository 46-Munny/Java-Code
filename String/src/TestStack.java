import java.sql.SQLOutput;

public class TestStack {
    public static void main(String[] args) {
        datastructure obj=new stack(6);
        obj.push(5);
        obj.push(8);
        obj.push(3);
        obj.pop();
        obj.pop();


        System.out.println(obj.topelement());

   }
}
abstract class datastructure
{
    private int arr[];
    private int size;
    private int top;

   datastructure()
    {
        size=0;
        top=-1;
    }
    datastructure(int size)
    {
        arr=new int[size];
        this.size=size;
    }
    void getvalue(int value)
    {
        top++;
        if(top>size)
        {
            System.out.println("Overflow");
        }
        arr[top]=value;

    }
    void getpop()
    {
        top--;
        if(top<0)
        {
            System.out.println("Underflow");
        }
    }
    int gettop()
    {
        return arr[top];
    }


    public  abstract void push(int value);
    public  abstract void pop();
    public  abstract int topelement();
}
class stack extends datastructure
{
    stack()
    {
        super();
    }
    stack(int size)
    {
        super(size);
    }
    public void push(int value)
    {
        getvalue(value);

    }
    public void pop()
    {
        getpop();
    }
    public int topelement()
    {
       return  gettop();
    }
}
