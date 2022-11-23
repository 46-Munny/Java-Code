package com.company;
class point2d
{
    private float x;
    private float y;
    point2d()
    {
        x=0.0f;
        y=0.0f;
    }
    point2d(float m,float n)
    {
        x=m;
        y=n;

    }

    public float getX() {
        return x;
    }
    public void setX(float x)
    {
        this.x=x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y)
    {
        this.x=x;
        this.y=y;
    }
    public float[] getXY()
    {
        float arr[]=new float[2];
        arr[0]=x;
        arr[1]=y;
        return arr;
    }

    public String toString() {
        String s1=String.valueOf(getX());
        String s2=String.valueOf(getY());
        String s=s1+","+s2;
        return s;
    }
}

public class ex1 {
    public static void main(String[] args) {
      point2d obj=new point2d();
      obj.setXY(65.5f,97.6f);
      float crr[]=obj.getXY();
      for(int i=0;i<crr.length;i++)
        {
            System.out.println(crr[i]);
        }
      String st=obj.toString();
        System.out.println(st);

    }
}
