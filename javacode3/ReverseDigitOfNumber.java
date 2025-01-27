// WAP to reverse the digits of a number.

import java.util.Scanner;

public class ReverseDigitOfNumber {

public static void main(String [] args){

Scanner s=new Scanner(System.in);
System.out.print("Enter a number: ");
int num=s.nextInt();
int rev=0;
for(int i=num;i>0;i=i/10){
rev=10*rev + i%10;
}
System.out.print("Reverse number is: "+rev);
}
}