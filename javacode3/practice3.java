// WAP to create a class calculator and in calculator class create add(), sub(), mul(), div() and mod() method in calculator class.

import java.util.Scanner;
class calculator {
 int a, b;
int add(int a, int b) {
return a+b;
}
int sub(int a, int b) {
return a-b;
}
int mul(int a, int b) {
return a*b;
}
int div(int a, int b) {
return a/b;
}
int mod(int a, int b) {
return a%b;
}
}
class practice3 {
public static void main(String[]args) {
Scanner s=new Scanner(System.in);
System.out.print("Enter first no: ");
int n1=s.nextInt();
System.out.print("Enter second no: ");
int n2=s.nextInt();
calculator c=new calculator();
System.out.println("Sum: "+c.add(n1,n2));
System.out.println("Difference: "+c.sub(n1,n2));
System.out.println("Mul: "+c.mul(n1,n2));
System.out.println("Div: "+c.div(n1,n2));
System.out.println("Mod: "+c.mod(n1,n2));
}
} 