/* WAP to create two methods dtor() and rtod(). dtor() method convert currency from dollar to rupees and rtod() method convert currency
   from rupees to dollar. Now test these methods with use of switch. 

*/
import java.util.*;
class currency 
{
double r,d;
Scanner s=new Scanner(System.in);
void rtod()
{
System.out.print("Enter Rupee: ");
r=s.nextDouble();
System.out.println("Dollar equivalent: "+(r/82.95));
}
void dtor()
{
System.out.print("Enter Dollar: ");
d=s.nextDouble();
System.out.println("Rupee equivalent: "+(d*82.95));
}
}
class classWork3
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
currency c=new currency();
System.out.println("Enter 1 to convert from rupee to dollar.");
System.out.println("Enter 2 to convert from dollar to rupee.");
int ch=s.nextInt();
switch(ch)
{
case 1: c.rtod();
break;
case 2: c.dtor();
break;
default: System.out.println("Invalid choice!");
}

}
}