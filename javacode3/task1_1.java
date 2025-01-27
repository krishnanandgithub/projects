/* WAP to find the area and perimeter of a circle.
   Take radius as input from the users.
*/


import java.util.*;

class task1_1
{

public static void main(String[] args)

{
  Scanner s=new Scanner(System.in);

  System.out.print("Enter radius of circle:");
  
  double r=s.nextDouble();

  double a=3.14*r*r;
  double p=2*3.14*r;

System.out.println("Area of circle: "+a);
  System.out.println("Peremeter of circle: "+p);
  
  
  
}


}





