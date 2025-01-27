/*

*/

interface interface1 
{

void m1(); // public abstract void m1();
void m2(); // public abstract void m2();

}
class TestInterface implements interface1
{

public void m1() {

System.out.println("This msg from m1()");

}

public void m2() {

System.out.println("This msg from m2()");

}

public static void main(String[]args) {

TestInterface t=new TestInterface();

t.m1();
t.m2();

}

}