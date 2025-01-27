// WAP to find greatest number in two unequal numbers

import java.util.*;
class p5
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.print("Enter first number:");
int x=s.nextInt();
System.out.print("Enter second number:");
int y=s.nextInt();
if(x>y)
{
System.out.println("Greatest no.:"+x);
}
else
{
System.out.println("Greatest no.:"+y);
}
}

}