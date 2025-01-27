/*
WAP to print numbers from 1 to 100 with the delay of 1-1 second.
*/

class ExDemo {

public static void main(String[]args) throws InterruptedException

{

for(int i=1;i<=100;i++) {

System.out.print(i+" ");
Thread.sleep(100);

}
}
}