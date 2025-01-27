/*
WAP to take full name as input and display short name.
*/

import java.util.Scanner;

class task2 {

public static void main(String[]args) {

Scanner s=new Scanner(System.in);
System.out.print("Enter your full name: ");
String name=s.nextLine();
String [] sn=name.split(" ");
System.out.print("Your short name: ");

for(int i=0;i<sn.length-1;i++) {

System.out.print(sn[i].charAt(0)+"."+" ");
}
System.out.print(sn[sn.length-1]);

}

}