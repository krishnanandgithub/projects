/*
 WAP to check the given number is prime or not... 
*/

import java.util.Scanner;

class IsPrimeNumber {

public static void main(String args[])
{
System.out.print("Enter a number: ");
Scanner s=new Scanner(System.in);
int num=s.nextInt();

int c=0;
for(int i=2;i<num;i++)
{
if(num%i==0){
 c++;
}
}
if(c==0){
System.out.println(num+" is a prime number");
}
else{
System.out.println(num+" is not a prime number");
}
}

}