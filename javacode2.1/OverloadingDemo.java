// WAP to demonstrate concept of method overloading.

import java.util.*;

class figure
{
int area(int s)
{
return s*s;
}
int area(int l, int b)
{
return l*b;
}
}
class OverloadingDemo
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
figure f=new figure();
System.out.print("Enter side of square: ");
int a=s.nextInt();
System.out.println("Area of square: "+f.area(a));
System.out.println("Enter length & breadth of rectangle: ");
int l=s.nextInt();
int b=s.nextInt();
System.out.println("Area of rectangle: "+f.area(l,b));
}
}