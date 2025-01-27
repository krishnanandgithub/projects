// WAP to print pattern.

class pattern2
{
public static void main(String[]args)
{
for(int i=1;i<=4;i++)
{
for(int j=4;j>=i;j--)
{
if(j>i)
{
System.out.print("\t");
}
else
{
for(int k=1;k<=i;k++)
{
System.out.print("\t"+k);
}
}
}
System.out.println("");
}
}
}