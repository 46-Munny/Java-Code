
abstract class shape
{
    protected String color;

    protected  boolean filled;

    shape()
    {
        color="green";
        filled=true;
    }

    shape(String color,boolean filled)
    {
        this.color=color;
        this.filled=filled;
    }

    public  void setColor(String color)
    {
        this.color=color;
    }
    public void setFilled(boolean filled)
    {
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    @Override
    public String toString() {
        String s;
        if(filled==true)
        {
            s="filled";
        }
        else
        {
            s="not filled";
        }

        String str;
        str="A shape with color of "+color+"and"+s;
        return str;
    }

    abstract public double getArea();
    abstract public double getPerimeter();
}

class rectangle extends shape{
   private double l;
   private double w;
   rectangle()
   {
       super();
       l=1.0;
       w=1.0;
   }
   rectangle(double l,double w)
   {
       this.l=l;
       this.w=w;
   }

    public void setL(double l) {
        this.l = l;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getL() {
        return l;
    }

    public double getW() {
        return w;
    }

    @Override
    public String toString() {
        String s;
        s="A rectangle with width="+w+" and length="+l+" which is a subclass of"+super.toString();
        return s;
    }
    public double getArea()
    {
        double a;
        a=l*w;
        return a;

    }

    @Override
    public double getPerimeter() {
        double p;
        p=2*(l+w);
        return p;
    }
}
public class exa2 {
    public static void main(String[] args) {

      rectangle obj=new rectangle();
      obj.setColor("white");
      obj.setFilled(true);
      obj.setL(6.0);
      obj.setW(4.0);
      String st;
      st=obj.toString();
      double ar=obj.getArea();
      double pr=obj.getPerimeter();
        System.out.println(ar);
        System.out.println(pr);
        System.out.println(st);


    }
}
