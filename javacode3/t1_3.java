// WAP to check entered no. is vowel or consonent.

import java.util.*;
class t1_3
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.print("Enter a character.:");
char ch=s.next().charAt(0);

if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
{
System.out.println("Vowel");
}
else
{
System.out.println("Consonent");
}



}



}