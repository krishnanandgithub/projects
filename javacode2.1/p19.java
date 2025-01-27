// WAP to find the volume of cuboid using user defined method.

import java.util.Scanner;
class p19
{

int volume(int l,int b,int h)
{
int x=l*b*h;
return x;
}


public static void main(String[]args)
{

Scanner s=new Scanner(System.in);
System.out.print("Enter length: ");
int a=s.nextInt();
System.out.print("Enter breadth: ");
int b=s.nextInt();
System.out.print("Enter height: ");
int c=s.nextInt();
p19 obj=new p19();
System.out.print("Volume of Cuboid: "+obj.volume(a,b,c)); 
}
}