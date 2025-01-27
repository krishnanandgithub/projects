// WAP to check wether inputed no. is binary or not.

import java.util.Scanner;
class practice1
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter your no.:");
int num=s.nextInt();
int d;
int n=num;
int c;
int a=num;

for(d=0;n!=0;n/=10)
{
d=d+1;
}
System.out.println("Digits: "+d);

for(c=0;num!=0;num/=10)
{
   if(num%10==0 || num%10==1)
      {
          c++; 
      }    
}
if(d==c)
{
System.out.print(a +" is a binary no.");
}
else
{
System.out.print(a+" is not a binary number!"); 
}
}
}