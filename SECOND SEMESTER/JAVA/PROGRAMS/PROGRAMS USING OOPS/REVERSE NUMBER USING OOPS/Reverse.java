import java.lang.*;
import java.util.*;

class Reverse
{
private int num;

public Reverse(int n)
{
this.num=n;
}
public int rev(int num)
{
int r=this.num;
int reverse=0;
int rem;
while(num!=0)
{
rem=num%10;
reverse=reverse*10+rem;
num/=10;
}
System.out.println("Reversed Number:"+reverse);
return num;
}


public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number");
int r=sc.nextInt();
Reverse p=new Reverse(r);
int s=p.rev(r);
System.out.println(s);
}
}