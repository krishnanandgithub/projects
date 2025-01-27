/*
WAP to overload the area() method to find the area of triangle, trapezium and rhombus.
*/

import java.util.Scanner;
class OverloadArea {

double area(double a, double b, double c) {

double s=(a+b+c)/2;
double ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
return ar;

}
double area(int a, int b, int height) {

double s=(a+b)/2;
return s*height;

}
double area(double diagonal1, double diagonal2) {

return (diagonal1*diagonal2)/2;

}
public static void main(String[]args) {
Scanner s=new Scanner(System.in);
while(true) {
System.out.println("1. To find Area of triangle.");
System.out.println("2. To find Area of trapezium.");
System.out.println("3. To find Area of rhombus.");
System.out.println("4. To Exit.");
System.out.println("Enter your choice: ");
int ch=s.nextInt();
OverloadArea o=new OverloadArea();
switch(ch) {

case 1: System.out.println("Enter the length of three sides of triangle: ");
        double a=s.nextDouble();
        double b=s.nextDouble();
        double c=s.nextDouble();
       System.out.println("Area of triangle: "+o.area(a,b,c));
break;

case 2: System.out.print("Enter the length of first parallel side of trapezium: ");
        int s1=s.nextInt();                
        System.out.print("Enter the length of second parallel side of trapezium: ");
        int s2=s.nextInt();
        System.out.print("Enter the height b/w the parallel sides of trapezium: ");
        int h=s.nextInt();
        System.out.println("Area of trapezium: "+o.area(s1,s2,h));      
break;

case 3: System.out.print("Enter the length of first diagonal of rhombus: ");
        int d1=s.nextInt(); 
        System.out.print("Enter the length of second diagonal of rhombus: ");
        int d2=s.nextInt();   
        System.out.println("Area of rhombus: "+o.area(d1,d2));
break;

case 4: System.exit(0);
break;

default : System.out.println("Invalid choice.!");


}


}
}

}