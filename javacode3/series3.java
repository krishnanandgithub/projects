/*

WAP to find the value of series x^1-x^2+x^3-x^4+......

*/

import java.util.Scanner;

class series3 {

void series(long x, long n) {

long s=0;

for(int i=1;i<=n;i++) {

if(i%2!=0)
s=s+(int)Math.pow(x,i);
else
s=s-(int)Math.pow(x,i);

}

System.out.print("The sum of series: "+s);

}

public static void main(String[]args) {

Scanner s=new Scanner(System.in);
System.out.print("Enter a number: ");
long x=s.nextInt();
System.out.print("Enter number of terms: ");
long n=s.nextInt();
series3 se=new series3();
se.series(x,n);

}

}