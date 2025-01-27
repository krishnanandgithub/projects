/*

WAP to print the following series upto n term.

| || ||| ||||.....upto n term. 

*/


import java.util.Scanner;

class series2 {

void series(int n) {

for(int i=0;i<=n;i++) {

for(int j=0;j<i;j++) {

System.out.print("|");

}
System.out.print(" "+" ");
}

}
public static void main(String[]args) {

Scanner s=new Scanner(System.in);
System.out.print("Enter the number of terms: ");
int n=s.nextInt();
series2 se=new series2();
se.series(n);
}


}
