// WAP to check given number is palindrom number or not.

import java.util.*;
class palindromNum 
{
public static void main(String[]args)
{ 
System.out.print("Enter a number:");
int num=new Scanner(System.in).nextInt();
int n=num;
int num1;
for(num1=0;num!=0;num/=10)
{
num1=10*num1+num%10;
}
if(num1==n)
{
System.out.print(n+" is a palindrom number.");
}
else
{
System.out.print(n+" is not a palindro number!");
}
}
}
