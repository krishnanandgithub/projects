// WAP to find sum and avg of 10 no. using array.


import java.util.*;
class p10
{
public static void main(String[] args)
{
float sum=0;
float avg;
int [] list =new int[10];
Scanner s=new Scanner(System.in);
System.out.println("Enter 10 no. in array");

for(int i=0;i<10;i++)
{
list[i]=s.nextInt();
sum=sum+list[i];
}
System.out.println("Results... :");
avg=sum/10;
System.out.println("SUM: "+sum);
System.out.println("AVG: "+avg);
}
}