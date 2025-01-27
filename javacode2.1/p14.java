// WAP to check given strings are equal or not.

import java.util.*;
class p14
{
public static void main(String[]args)
{
Scanner s = new Scanner(System.in);

String str1,str2;
System.out.print("Enter first string: ");
str1=s.nextLine();
System.out.print("Enter second string: ");
str2=s.nextLine();

if(str1.equals(str2))
{
System.out.println("Both strings are equal.");
}
else
{
System.out.println("Both strings are not equal.");
}
}


}