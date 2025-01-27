// WAP to initialize instance variable of a class using constructor.

import java.util.Scanner;
class Rectangle
{
int length;
int breadth;
Rectangle(int l, int b)
{
length=l;
breadth=b;
}
void area()
{
System.out.println("Area: "+(length*breadth));
}
}
class ClassDemo3
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.print("Enter length: ");
int a=s.nextInt();
System.out.print("Enter breadth: ");
int b=s.nextInt();
Rectangle r=new Rectangle(a,b);
r.area();
}
}    