/* WAP to check the given number is even or odd.
   Take the value as input from the user.
*/

import java.util.Scanner;

class task2_1
{
public static void main(String[] args)
{
System.out.println("Enter a number:");
int a=new Scanner(System.in).nextInt();
if(a%2==0)
{
System.out.println(a+" is an Even number.");
}
else
{
System.out.println(a+" is an Odd number.");
}

}

}