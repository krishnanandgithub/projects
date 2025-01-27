// WAP to check given alphabate is in uppercase or lowercase.

import java.util.*;

class t1_4
{
public static void main(String[] args)
{
System.out.print("Enter an Alphabet:");
Scanner s=new Scanner(System.in);
char ch=s.next().charAt(0);
if(ch>='A' && ch<='Z')
{
System.out.print(ch+" is a Capital letter.");
}
else if(ch>='a' && ch<='z')
{
System.out.print(ch+" is a Small letter.");
}
else
{
System.out.print("Not an Alphabet!");
}
}

} 