/*

WAP to find the sum of series.

1!+2!+3!+4!+....up to n term.

*/


import java.util.Scanner;

class series1 {

void series(int n) {

int s=0;

for(int i=1;i<=n;i++) {
int m=1;
for(int j=1;j<=i;j++) {
m=(m*j);
}
s=s+m;
}

System.out.println(s);

}

public static void main(String[]args) {

Scanner s=new Scanner(System.in);
System.out.print("Enter no. of terms: ");
int n=s.nextInt();

series1 se=new series1();
se.series(n);

}

}