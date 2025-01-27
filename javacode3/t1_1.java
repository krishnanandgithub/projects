//WAP to enter a choice in number and print its corresponding month.

import java.util.*;
class t1_1
{
public static void main(String[] args)

{
Scanner s=new Scanner(System.in);
System.out.print("Enter your choice:");
int ch=s.nextInt();
switch(ch)
{
case 1: System.out.print("January");
break;

case 2: System.out.print("February");
break;

case 3: System.out.print("March");
break;

case 4: System.out.print("April");
break;

case 5: System.out.print("May");
break;

case 6: System.out.print("June");
break;

case 7: System.out.print("July");
break;

case 8: System.out.print("August");
break;

case 9: System.out.print("Septmber");
break;

case 10: System.out.print("October");
break;

case 11: System.out.print("November");
break;

case 12: System.out.print("December");
break;

default :System.out.print("Involid choice");


}


}
}