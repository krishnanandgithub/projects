/*
WAP to create check() method to check the number of letter similar letter in a given word. And to find the all vowels in a given word.
*/

import java.util.Scanner;

class OverloadCheck {

void check (String str, char ch) {

int c=0;
for(int i=0;i<str.length();i++) {
if(str.charAt(i)==ch) {
c++;
}
}
System.out.println(ch+" present "+c+" times in "+str);
}
void check (String str) {
for(int i=0;i<str.length();i++) {
char c=str.charAt(i);
if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
System.out.print(c+" ");
}
}
System.out.println("");
}
public static void main(String[]args) {

Scanner s=new Scanner(System.in);

while(true) {
System.out.println("1. To count specific letter in a given word. ");
System.out.println("2. To find the total vowels in a word. ");
System.out.println("3. Exit. ");
System.out.print("Enter your choice: ");
int n=s.nextInt();
OverloadCheck o=new OverloadCheck();
switch(n) {

case 1: System.out.print("Enter a Word: ");
        String str=s.nextLine();
               str=s.nextLine();
        System.out.print("Enter a letter: ");
        char ch=s.next().charAt(0);
        o.check(str,ch);
break;

case 2: System.out.print("Enter a word: ");
        String st=s.nextLine();
               st=s.nextLine();
        o.check(st);
break;

case 3: System.exit(0);
break;

default: System.out.println("Invalid choice.!");
         System.out.println("Please enter valid choice....");


}
}
}
}