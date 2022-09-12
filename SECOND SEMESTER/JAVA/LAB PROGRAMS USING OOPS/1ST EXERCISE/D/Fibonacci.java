import java.util.*;
import java.lang.*;
public class Fibonacci
{
private int num;
public Fibonacci(int x)
{
this.num=x;
}
public int rec(int x)
{
int n=this.num;
if(x==0)
{
return 0;
}
if(x==1||x==2)
{
return 1;
}
else
{
return rec(x-1)+rec(x-2);
}
}
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter:");
int n=sc.nextInt();
Fibonacci f=new Fibonacci(n);
for(int i=0;i<n;i++)
{
System.out.print(f.rec(i)+"");
}
System.out.print("\n");
}
}