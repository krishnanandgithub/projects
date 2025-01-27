// WAP to check whether inputed number is prime no. or not.

import java.util.*;
class checkPrime
{
public static void main(String[] args)
{
System.out.print("Enter a number:");
int n=new Scanner(System.in).nextInt();
int c=0,i;
for(i=1;i<=n;i++)
{
 if(n%i==0)
{
c++;
}
}
if(c==2)
{
System.out.print(n+" is prime");

}
else
{
System.out.print(n+" is not prime");
}
}
}
 