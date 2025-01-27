// WAP to take coordinates of a point as input and find its quadrant.

import java.util.*;
class p7
{
public static void main(String[] args)
{
int x,y;
Scanner s= new Scanner(System.in);
System.out.print("Enter value for Abssisa (x):");
x=s.nextInt();
System.out.print("Enter value for Ordinate (y):");
y=s.nextInt();
if(x>0 && y>0)
{
System.out.printf("The point (%d,%d) is in First Quadrant",x,y);

}
else if(x<0 && y>0)
{
System.out.printf("The point (%d,%d) is in Second Quadrant",x,y);

}
else if(x<0 && y<0)
{
System.out.printf("The point (%d,%d) is in Third Quadrant",x,y);

}
else if(x>0 && y<0)
{
System.out.printf("The point (%d,%d) is in Fourth Quadrant",x,y);

}
else
{
System.out.print("The point is either at the x-axis, y-axis or at the Origion!");
}

}


}