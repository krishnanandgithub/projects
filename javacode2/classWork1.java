/* WAP to input elements in an array of size 'n' and perform the following.

   1. print array.
   2. find largest element of array
   3. find shortest element of array

*/
import java.util.*;
class classWork1
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.print("Enter size of array: ");
int n=s.nextInt();
int [] arr=new int[n];
for(int i=0;i<n;i++)
{
System.out.print("index "+i+": ");
arr[i]=s.nextInt();
}

System.out.println("ARRAY ELEMENT...");

for(int i=0;i<n;i++)
{
System.out.println(arr[i]);
}

int l=arr[0];
int m=arr[0];

for(int i=1;i<n;i++)
{
if(arr[i]>l)
l=arr[i];
else if(arr[i]<m)
m=arr[i];
}

System.out.println("Shortest element: "+m);
System.out.println("Largest element: "+l);

Arrays.sort(arr);

System.out.println("SHORTED ARRAY ELEMENT...");

for(int i=0;i<n;i++)
{
System.out.println(arr[i]);
}

System.out.println("Shortest element: "+arr[0]);
System.out.println("Largest element: "+arr[n-1]);


}
}