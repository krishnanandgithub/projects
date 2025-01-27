/*
WAP to find greatest no. in three unequal no. using ternary operator.
*/


import java.util.*;
class classWork4
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter three nos.: ");
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int n=(a>b)?((a>c)?a:c):((b>c)?b:c);
System.out.println("The greatest no. is: "+n);
}
}