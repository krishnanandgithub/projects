/* 
  WAP to store five names in an array. Now display names in alphabetical order. 

*/

import java.util.*;
class p11
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
String [] name=new String[5];
System.out.println("Enter five names:");
for(int i=0;i<5;i++)
{
name[i]=s.nextLine();
}
Arrays.sort(name);

System.out.println("Shorted names :");

for(String n : name)
{
System.out.print("  "+n);
}

}

}