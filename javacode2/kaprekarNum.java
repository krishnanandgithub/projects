// WAP to check the given no. is Kaprekar no. or not.

import java.util.Scanner;
class kaprekarNum
{
public static void main(String[] args)

{
System.out.print("Enter a no.:");
int n=new Scanner(System.in).nextInt();
int num=n*n;
int nn=n;
int d;
for(d=0;n!=0;n/=10)
{
d=d+1;
} 
System.out.println("Total Digits: "+d);
int r=(int)(num%Math.pow(10,d));
int l=(int)(num/Math.pow(10,d));

if(l+r==nn)
{
System.out.print(nn+" is Kaprekar no.");
}
else
{
System.out.print(nn+" is not Kaprekar no.");
}
}
}