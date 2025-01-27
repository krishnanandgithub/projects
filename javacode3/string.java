/*
WAP to print the short name withort using split method.
e.g. Java Developement Kit.
Result: J.D.K.
*/

import java.util.*;
class string {
public static void main(String[]args){

Scanner s=new Scanner(System.in);
System.out.print("Enter your full name: ");
String str=s.nextLine();
int p=0;
str=str+" ";
for(int i=0;i<str.length();i++) {

if(str.charAt(i)==' ') {

String w=str.substring(p,i);
System.out.print(w.charAt(0)+".");
p=i+1;

}

}


}


}