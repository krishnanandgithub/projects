/*
 ShowRoom problem.
*/

import java.util.Scanner;

class ShowRoom {

String name;
String mobno;
double cost;
double dis;
double amount;
Scanner s=new Scanner(System.in);

ShowRoom() { 

name="null";
mobno="null";
cost=0.0;
dis=0.0;
amount=0.0;

}

void input() { 

System.out.print("Enter your name: ");
name=s.nextLine();
System.out.print("Enter your mobile number: ");
mobno=s.nextLine();
System.out.print("Enter cost of product: ");
cost=s.nextDouble();

}

void calculate() {

if(cost<=10000) {
dis=0.05*cost;
amount=cost-dis;
}

else if(cost>10000 && cost<=20000) {
dis=0.1*cost;
amount=cost-dis;
}

else if(cost>20000 && cost<=35000) {
dis=0.15*cost;
amount=cost-dis;
}

else if(cost>35000) {
dis=0.2*cost;
amount=cost-dis;
}

else {
System.out.print("Invalid price");
}

}

void display() {

System.out.println("Customer name: "+name);
System.out.println("Mobile number: "+mobno);
System.out.println("Amount to be paid: "+amount);

}
 
}

class Show_Room {

public static void main(String[]args) {

ShowRoom sr=new ShowRoom();
sr.input();
sr.calculate();
sr.display();

}

}

