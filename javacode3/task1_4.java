/* WAP to find the total number of years, months and days from given number of days.
   Take number of days as input from the users.
*/


import java.util.Scanner;

class task1_4
{

public static void main(String[] args)

{
  Scanner s=new Scanner(System.in);

  System.out.print("Enter total number of days:");
  
  int n=s.nextInt();

  int y=n/365;
  int w=(n%365)/7;
   int d=(n%365)%7;

  System.out.printf("%d Years %d Weeks and %d Days. ",y,w,d);
  
  
}


}





