abstract class datastructure
{
private  int arr[];
private int top;
private int size;

datastructure()
{
    size=0;
    top=-1;
}
datastructure(int s)
{
    arr =new int[s];
    size=s;
}

public  void getpush(int a)
{
    top++;
    if(top>size)
    {
        System.out.println("Overflow");
    }
    arr[top]=a;
}
public void getpop()
{
    top--;
    if(top<0)
    {
        System.out.println("Underflow");
    }
}
public int gettop()
{
    return  arr[top];
}
public abstract void push(int b);
public abstract void pop();
public abstract int topelement();
}

class stack extends datastructure
{
    stack()
    {
        super();
    }
    stack(int sz)
    {

        super(sz);

    }
   public void push(int b)
    {
     getpush( b);
    }

    public void pop()
    {
        getpop();
    }

    @Override
    public int topelement() {
        return gettop();
    }
}
public class classStack {
    public static void main(String[] args) {
     datastructure obj=new stack(7);
     obj.push(7);
     obj.push(8);
     obj.push(6);
     obj.pop();
        System.out.println(obj.topelement());

    }
}
