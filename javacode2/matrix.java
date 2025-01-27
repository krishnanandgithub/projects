//WAP to take number as input in a matrix and print that matrix also.

import java.util.Scanner;

class matrix
{
public static void main(String [] args)
{
int i,j;
Scanner s=new Scanner(System.in);
int a[][]=new int[3][3];
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.printf("Input at (%d,%d): ",i,j);
a[i][j]=s.nextInt();
}
}
System.out.println("The Matrix is: ");

for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println("");
}

}
}