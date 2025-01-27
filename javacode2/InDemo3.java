//


class X
{
void showX()
{
System.out.println("This msg from class X");
}
}
class Y extends X
{
void showY()
{
System.out.println("This msg from class Y");
}
}
class Z extends Y
{
void showZ()
{
System.out.println("This msg from class Z");
}
}
class InDemo3
{
public static void main(String[]args)
{
Z z =new Z();
z.showX();
z.showY();
z.showZ();
}
}