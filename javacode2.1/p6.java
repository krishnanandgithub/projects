// WAP to find greatest no in two unequal numbers.

import java.util.Scanner;

class p6
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.print("Enter first no.:");
int a=s.nextInt();
System.out.print("Enter second no.:");
int b=s.nextInt();
int g=(a>b)?a:b;
System.out.print("Greatest no.:"+g);

}
}