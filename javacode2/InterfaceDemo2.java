
// first meeting

interface School
{
public abstract void registration();
public abstract void feeSubmission();
public abstract void batchAllotment();
}

// second meeting

abstract class Test1 implements School
{
public void registration() 
{
System.out.println("Business logic for registration.");
}
}

// third meeting

abstract class Test2 extends Test1
{
public void feeSubmission()
{
System.out.println("Business logic for feeSubmission.");
}
}

// fourth meeting

class Test3 extends Test2
{
public void batchAllotment()
{
System.out.println("Business logic for batchAllotment.");
}
}

class InterfaceDemo2
{
public static void main(String[]args)
{
Test3 t=new Test3();
t.registration();
t.feeSubmission();
t.batchAllotment();

}
}