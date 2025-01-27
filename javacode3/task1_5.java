/* WAP to find the area and perimeter of a rectangle.
   Take length and breadth as input from the user.
*/

import java.util.Scanner;
class task1_5
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the length and breadth of a rectangle respectively:");
double l=s.nextInt();
double b=s.nextInt();
double a=l*b;
double p=2*(l+b);
System.out.printf("Area is %f and Perimeter is %f",a,p);
}

}