// WAP to check given number is neon number or not.

import java.util.Scanner;

class neonNum
{
public static void main(String[]args)
{
System.out.print("Enter a no.:");
int n=new Scanner(System.in).nextInt();
int num=n*n;
int sum;
for(sum=0;num!=0;num/=10)
{
sum=sum+num%10;
}
if(sum==n)
{
System.out.print(n+" is a NEON number.");
}
else
{
System.out.print(n+" is not a NEON number");
}

}

}