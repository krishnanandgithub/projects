/*

WAP to merge two array in a single a

*/

import java.util.Scanner;

class mergeArray {

public static void main(String[]args) {

Scanner s=new Scanner(System.in);
System.out.print("Enter size of first array: ");
int n1=s.nextInt();
int arr1[]=new int[n1];
System.out.println("Enter "+n1+" elements in first array: ");

for(int i=0;i<n1;i++) {

arr1[i]=s.nextInt();

}

System.out.print("Enter size of second array: ");
int n2=s.nextInt();
int arr2[]=new int[n2];
System.out.println("Enter "+n2+" elements in second array: ");

for(int i=0;i<n2;i++) {

arr2[i]=s.nextInt();

}

int c=0;
int arr3[]=new int[n1+n2];

for(int i=0;i<(n1+n2);i++) {

if(i<n1) {

arr3[i]=arr1[i];

}
else {

arr3[i]=arr2[c];
c++;
}

}

System.out.println("After merging these two array: ");

for(int i=0;i<(n1+n2);i++) {

System.out.println(arr3[i]);

}

}

}