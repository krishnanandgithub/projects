
/*
RailwayTicket.
*/

import java.util.Scanner;

class RailwayTicket {

String name;
String coach;
long mobno;
int amt;
int totalamt;
Scanner s=new Scanner(System.in);

void accept() {

System.out.print("Enter your name: ");
name=s.nextLine();
//System.out.print("Enter coach type(1st_AC, 2nd_AC, 3rd_AC, Sleeper): ");
//coach=s.nextLine();
System.out.print("Enter your mobile number: ");
mobno=s.nextLong();
System.out.print("Enter basic amount: ");
amt=s.nextInt();

}

void update() {

Scanner s=new Scanner(System.in);
//System.out.println("Enter your coach preference: ");
System.out.println("1. First AC ");
System.out.println("2. Second AC ");
System.out.println("3. Third AC ");
System.out.println("4. Sleeper  ");
System.out.print("Enter a number b/w (1 to 4) according to your preference: ");
int ch=s.nextInt();
switch(ch) {

case 1: totalamt=amt+700;
break;

case 2: totalamt=amt+500;
break;

case 3: totalamt=amt+250;
break;

case 4: totalamt=amt+0;
break;

default: System.out.println("Invalid choice!");
}

/*
String str1="1st_AC";
String str2="2nd_AC";
String str3="3rd_AC";
String str4="Sleeper";


if(coach.equalsIgnoreCase(str1)) {

totalamt=amt+700;

}

else if(coach.equalsIgnoreCase(str2)) {

totalamt=amt+500;

}

else if(coach.equalsIgnoreCase(str3)) {

totalamt=amt+250;

}

else if(coach.equalsIgnoreCase(str4)) {

totalamt=amt+0;

}

else {

System.out.println("Invalid Choice of coach...!");

}

*/

}


void display() {

System.out.println("Details...");
System.out.println("Name: "+name);
System.out.println("Coach type: "+coach);
System.out.println("Mobile number: "+mobno);
System.out.println("Total amount: "+totalamt);

}

}

class Railway {

public static void main(String[]args) {

RailwayTicket rt=new RailwayTicket();
rt.accept();
rt.update();
rt.display();

}

}