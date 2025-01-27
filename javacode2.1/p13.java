/* Input a name from user, now display name in upper case, in lower case and also find length.

*/

import java.util.*;

class p13
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
String name;
System.out.print("Enter name: ");
name=s.nextLine();
System.out.println("Name in upper case: "+name.toUpperCase());
System.out.println("Name in lower case: "+name.toLowerCase());
System.out.println("Length of your name: "+name.length());

}
}