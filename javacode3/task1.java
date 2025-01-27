/*
WAP to take a decimal number as input. convert it into binary, octal, and hexa-decimal equivalent.
*/

import java.util.*;

class task1 {

public static void main(String[]args) {

Scanner s=new Scanner(System.in);
System.out.print("Enter a decimal number: ");
int n=s.nextInt();
System.out.println("Binary formate: "+Integer.toString(n,2));
System.out.println("Octal formate: "+Integer.toString(n,8));
System.out.println("Hexa-decimal formate: "+Integer.toString(n,16));
}
}