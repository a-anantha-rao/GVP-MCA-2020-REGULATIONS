import java.util.*;
import java.lang.*;

class Factorial
{
private int num;

public Factorial(int x)
{
this.num=x;
}
public int rec(int x)
{
int n=this.num;
if(x==0)
return 1;
else
{
return x*rec(x-1);
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number to find Fctorial");
int n=sc.nextInt();
Factorial f=new Factorial(n);
int s=f.rec(n);
System.out.println(s);
}
}

