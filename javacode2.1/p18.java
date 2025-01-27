// WAP to find greatest no. in two no. by using user defined method.
 
import java.util.Scanner;
class p18
{
static int greatest(int x, int y) // user defined static method
{
int g=(x>y)?x:y;
return g;
}

public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.print("Enter first no: ");
int a=s.nextInt();
System.out.print("Enter second no: ");
int b=s.nextInt();
System.out.print("Geatest no is: "+greatest(a,b));

}
}
