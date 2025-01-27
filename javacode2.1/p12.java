/*
  WAP to create a list of 10 no., now input a number and check that entered number is in list or not.
 
*/

import java.util.*;
class p12
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
int [] list=new int[10];
int num,f=0,i;
System.out.println("Enter ten numbers to the list:");
for(i=0;i<10;i++)
{
list[i]=s.nextInt();
}
System.out.print("Enter no. to search in list:");
num=s.nextInt();
//code for search
for(i=0;i<10;i++)
{
if(num==list[i])
{
f=1;
break;
}
}
if(f==1)
{
System.out.printf("Number %d is found at location %d\n",num,i+1);
}
else
{
System.out.printf("Number %d not found!",num);
}

}
}