/* WAP to find the volume and surface area of cuboid.
   Take height, length and breadth as input from the users.
*/


import java.util.Scanner;

class task1_2
{

public static void main(String[] args)

{
  Scanner s=new Scanner(System.in);

  System.out.print("Enter Length, Height and Breadth of a cuboid respectively:");
  
  double l=s.nextDouble();
  double h=s.nextDouble();
  double b=s.nextDouble();


  double v=l*h*b;
  double sa=2*(l*b+b*h+l*h);

System.out.println("Volume of cuboid is "+v+" and surface area of cuboid is "+sa);
  
}


}





