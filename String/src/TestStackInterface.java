public class TestStackInterface {
    public static void main(String[] args) {
        datastructures obj=new stacks(6);
        obj.push(5);
        obj.push(8);
        obj.push(3);
        obj.pop();
        obj.pop();


        System.out.println(obj.topelement());


    }
}
interface datastructures
        {
            public  abstract void push(int value);
            public  abstract void pop();
            public  abstract int topelement();
        }
        class stacks implements datastructures
        {
            private int arr[];
            private int size;
            private int top;
            stacks()
            {
                size=0;
                top=-1;
            }
            stacks(int size)
            {
                arr=new int [size];
                this.size=size;
            }
            public  void push(int value)
            {
                top++;
                arr[top]=value;
            }
            public  void pop()
            {
                top--;
            }
            public int topelement()
            {
                return arr[top];
            }
        }
