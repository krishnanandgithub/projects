// 

import java.util.*;

class Shape
{
int side;
public void setValue(int s)
{
side=s;
}
}
class Square extends Shape
{
public int area()
{
return side*side;
}
}
class Cube extends Shape
{
public int volume()
{
return side*side*side;
}
}
class InDemo2
{
public static void main(String[]args)
{
int x;
Scanner s=new Scanner(System.in);
Square sq=new Square();
System.out.print("Enter side of square: "); 
x=s.nextInt();
sq.setValue(x);
System.out.println("Area of Square: "+sq.area());
Cube cu=new Cube();
System.out.print("Enter the side of cube: ");
x=s.nextInt();
cu.setValue(x);
System.out.println("Volume of cube: "+cu.volume());
}
}