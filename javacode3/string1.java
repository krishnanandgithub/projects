/*
WAP to print and count the words which starts with a vowel in a sentence.
e.g. An apple a day keeps the doctor away.
Results: An
         apple
         a
         away
no. of words = 4

*/

import java.util.*;
class string1 {
public static void main(String[]args) {
Scanner s=new Scanner(System.in);
System.out.print("Enter a sentence: ");
String str=s.nextLine();
int p=0;
str=str+" ";
for(int i=0;i<str.length();i++) 
{
if(str.charAt(i)==' ')
String str1=str.substring(p,i);
p=i+1;
char c=str1.charAt(i);
if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U' )


}

}

}