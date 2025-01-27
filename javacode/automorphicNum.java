// WAP to check the given no. is an Automorphic number or not.

import java.util.Scanner;
class automorphicNum
{
public static void main(String[]args)
{
System.out.print("Enter a no.:");
int n=new Scanner(System.in).nextInt();
int num=n*n;
int d;
int n1=n;
double new_num;
for(d=0;n!=0;n/=10)
{
d=d+1;
}
new_num=num%(Math.pow(10,d));
if(new_num==n1)
{
System.out.print(n1+" is Automarphic no.");
}
else
{
System.out.print(n1+" is not Automarphic no.");
}
}
}