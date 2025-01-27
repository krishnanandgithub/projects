//


class Rundog
{
public void bark()
{
System.out.println("Sheru...");
System.out.println("Bhow...Bhow...");
}
}
class Bulldog extends Rundog
{
public void growl()
{
System.out.println("Tuffy...");
System.out.println("Gurr...Gurr...");
}
}
class InDemo1
{
public static void main(String[]args)
{
Bulldog d=new Bulldog();
d.bark();
d.growl();
}

}
