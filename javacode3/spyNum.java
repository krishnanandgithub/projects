// WAP to check given no. is Spy number or not.

import java.util.Scanner;

class spyNum
{
public static void main(String[]args)
{
System.out.print("Enter a no.:");
int n=new Scanner(System.in).nextInt();
int sum=0;
int mul=1;
int num=n;
for(int i=0;n!=0;n/=10)
{
sum=sum+n%10;
mul=mul*n%10;
}
if(sum==mul)
{
System.out.print(num+" is an SPY no.");
}
else
{
System.out.print(num+" is not an SPY no.");
}
}
}