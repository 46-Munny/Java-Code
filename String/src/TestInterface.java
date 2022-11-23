public class TestInterface {
    public static void main(String[] args) {

        first obj=new third();
        second obj1=new third();

        obj.sound();
        obj1.cook();

    }
}
interface  first
{
    public  void sound();
}
interface  second
{
    public  void cook();
}
class third implements first,second
{

    public void sound() {
        System.out.println("sounding...");
    }


    public void cook() {
        System.out.println("cooking...");
    }
}
