package com.company;

interface datastructure{

    public  void push(int value);
    public  void pop();
    public  int frontelement();

}

class queue implements datastructure
{
    int f;
    int r;
    int size;
    int q[];
    queue()
    {
        f=1;
        r=-1;
        size=0;
    }
    queue(int size)
    {
        q=new int[size];
        this.size=size;
    }

    public void push(int value)
    {
        r++;
        q[r]=value;
    }

    public  void pop()
    {
        f++;
    }

    public int frontelement()
    {
        return q[f];
    }

}

public class interfaceQueue {
    public static void main(String[] args) {
       queue obj=new queue(7);
       obj.push(6);
        obj.push(7);
        obj.push(16);
        obj.push(9);
       obj.pop();
       obj.pop();
       obj.pop();

        System.out.println(obj.frontelement());
    }
}
