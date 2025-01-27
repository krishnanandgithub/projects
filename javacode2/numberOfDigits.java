// WAP to calculate the number of digits in a given number.

import java.util.Scanner;
class numberOfDigits
{
public static void main(String[] args)
{

long num;
int sum=0;
System.out.print("Enter a no.:");
num = new Scanner(System.in).nextLong();
while(num!=0)
{
sum=sum+1;
num=num/10;

}
System.out.print("No. of digits: "+sum);
}

}