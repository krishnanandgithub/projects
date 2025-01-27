// WAP to make a reverse counter to print numbers from 10 to 1.

class p9
{
public static void main(String[] args) throws InterruptedException //Exception handling because of Thread.sleep(100).
{
int c=10;
do 
{
System.out.println(c);
Thread.sleep(1000);  // used for sleep or take a break ,(it take value in mili second)
c--;
}
while(c>0);
}


}