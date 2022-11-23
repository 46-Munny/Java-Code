class animal
{
    public void sound()
    {
        System.out.println("default sound");
    }
}
class dog extends animal
{
    public void sound()
    {
        System.out.println("Ghew");
    }
}
public class Overriding {

    public static void main(String[] args) {

    animal obj = new dog();
    obj.sound();
     }
 }


