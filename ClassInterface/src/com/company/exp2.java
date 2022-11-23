package com.company;

abstract class Shape{
    protected  String color;
    protected boolean filled;
    Shape(){
        this.color="green";
        this.filled= true;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor()
    {
        return color;
    }

    public boolean isFilled()
    {
        return filled;
    }

    @Override
    public String toString() {
        String s, str;
        if(filled==true)
        {
            s="filled";
        }
        else
        {
            s="Not filled";
        }
        str= "A shape with color of "+color+" and "+s;
        return str;
    }

    abstract  public double getArea();
    abstract  public double getPerimeter();
}

class Circle extends  Shape{
    double r;
    Circle()
    {
        super();
        r=1.0;
    }

    public void setR(double r)
    {
        this.r=r;
    }

    public double getArea()
    {
        double ar;
        ar=3.1416*r*r;
        return ar;
    }
    public double getPerimeter()
    {
        double pr;
        pr=2*3.1416*r;
        return pr;
    }

    public String toString() {
        String s;
        s="A circle with radius="+r+" which is a subclass of"+super.toString();
        return s;
    }
}


class Rectangle extends  Shape{
    double l,w;
    Rectangle()
    {
        super();
        l=1.0;
        w=1.0;
    }

    public void setL(double l)
    {
        this.l=l;
    }

    public void setW(double w)
    {
        this.w=w;
    }

    public double getArea()
    {
        double ar;
        ar=l*w;
        return ar;
    }
    public double getPerimeter()
    {
        double pr;
        pr=2*(l+w);
        return pr;
    }

    public String toString() {
        String s;
        s="A rectangle with width="+w+" and length="+l+" which is a subclass of"+super.toString();
        return s;
    }
}

public class exp2 {
    public static void main(String[] args){
        Circle cobj= new Circle();
      // Circle cobj=new Circle();
       cobj.setR(4.6);
       cobj.setColor("Blue");
       cobj.setFilled(false);
       String cs = cobj.toString();
       double car= cobj.getArea();
        double cpr= cobj.getPerimeter();
        String cfs= "Citrcle area is "+car+" and perimeter is "+cpr;
        System.out.println(cs+" "+cfs);

        Rectangle robj=new Rectangle();
        robj.setL(4.0);
        robj.setW(3.0);
        String rs = robj.toString();
        double rar= robj.getArea();
        double rpr= robj.getPerimeter();
        String rfs= "Rectangle area is "+rar+" and perimeter is "+rpr;
        System.out.println(rs+" "+rfs);


    }
}
