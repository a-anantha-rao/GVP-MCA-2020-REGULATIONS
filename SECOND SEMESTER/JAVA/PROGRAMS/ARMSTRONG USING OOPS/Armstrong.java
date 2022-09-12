import java.lang.*;
import java.util.*;
class Armstrong
{
private int n;

public Armstrong(int x)
{
this.n=x;
}

public void arm(int n)
{
int temp=n;
int p=0;
while(n>0)
{
int rem=n%10;
p=p+(rem*rem*rem);
n=n/10;
}
if(temp==p)
{
System.out.println("The number is armstrong number");
}
else
{
System.out.println("The number is not armstrong");
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Nunber");
int a=sc.nextInt();
Armstrong A=new Armstrong(a);
A.arm(a);
}
}