// WAP to chech inputed no. is perfect number or not.

import java.util.*;
class perfectNum
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.print("Enter a number: ");
int num=s.nextInt();
int sum=0;
for(int i=1;i<num;i++)
{
  if(num%i==0)
    {
      sum=sum+i;

    }

}
if(sum==num )
{
System.out.print(num+" is a perfect no.");
}
else
{
System.out.print(num+" is not a perfect no.");
}
}

}