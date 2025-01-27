/*
WAP to find division of two numbers
*/

import java.util.*;

class ExDemo1 {
 
public static void main(String[]args) {

int x,y,z;
Scanner s=new Scanner(System.in);
try {
System.out.print("Enter first number: ");
x=s.nextInt();
System.out.print("Enter second number: ");
y=s.nextInt();
z=x/y;
System.out.println("Result="+z);
}

catch(InputMismatchException e1) {

System.out.println(e1);
System.out.println("Enter numbers only!");

}

catch(ArithmeticException e2) {

System.out.println(e2);
System.out.println("Are you trying to / be zero?");

}

finally {

System.out.print("This is finally block.");

} 
}

}