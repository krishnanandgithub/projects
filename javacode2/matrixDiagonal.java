//WAP to take number as input in a matrix and print only the diagonals of matrix.

import java.util.Scanner;

class matrixDiagonal
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

System.out.println("The Diagnols: ");

for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{ 
if(i==j || (i+j)== n-1 )
{
System.out.print(a[i][j]+"  ");
}
else
{
System.out.print("  ");
}
}
System.out.println("");
}

}
}