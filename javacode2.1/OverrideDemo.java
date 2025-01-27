/*
WAP to demonstrate concept of method overriding.
*/

class A {

void m1() {


System.out.println("m1 of A");

}

void m2() {

System.out.println("m2 of A");

}

}

class B extends A {

void m1() {

super.m1();

System.out.println("m1 of B");

}

void m3() {

System.out.println("m3 of B");

}

}

class OverrideDemo {

public static void main(String[]args) {

A a=new A();
B b=new B();

a.m1();
a.m2();
b.m1();
b.m2();
b.m3();

}

}
