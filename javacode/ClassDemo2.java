// WAP to understand concept of variable and methods of a class. 

class Employee {
int empid;
String empname;
double salary;
void setValue(int eid, String ename, double sal) {
empid=eid;
empname=ename;
salary=sal;
}
void display() {
System.out.println("Employee Id: "+empid);
System.out.println("Employee Name: "+empname);
System.out.println("Employee Salary: "+salary);
}
}
class ClassDemo2 {
public static void main(String[]args) {
Employee e1=new Employee();
e1.display();
e1.setValue(1001,"Brijesh Mishra",50000);
e1.display();
Employee e2=new Employee();
e2.display();
e2.setValue(1002,"Krishnanand Mishra",100000);
e2.display();
}
}