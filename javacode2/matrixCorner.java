//WAP to take numbers as input in a matrix and print only the corner elements of matrix.

import java.util.Scanner;

class matrixCorner
{
public static void main(String [] args)
{
int i,j;
Scanner s=new Scanner(System.in);

System.out.print("Enter size of matrix: ");
int n=s.nextInt();
int a[][]=new int[n][n];

for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.printf("Input at (%d,%d): ",i,j);
a[i][j]=s.nextInt();
}
}

System.out.println("Matrix: ");

for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{ 
System.out.print(a[i][j]+"  ");
}
System.out.println("");
}

System.out.println("Boundaries: ");


for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{ 
if( (i==0 && j==0) || (i==n-1 && j==n-1) || (i==0 && j==n-1 ) || ( i==n-1 && j==0) )
{
System.out.print(a[i][j]+"  ");
}
else
{
System.out.print("   ");
}
}
System.out.println("");
}


}
}