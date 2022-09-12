import java.util.*;
import java.lang.*;

class Palindrome
{
private int num;

public Palindrome(int a)
{
this.num=a;
}

public int palin(int temp)
{
int num=this.num;
int reverse=0;
int rem;
temp=num;
while(temp!=0)
{
rem=temp%10;
reverse=reverse*10+rem;
temp/=10;
}
if(num==reverse)
{
System.out.println(num+"is Palindrome");
}
else 
{
System.out.println(num+"is not a Palindrome");
}
return num;
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n=sc.nextInt();
Palindrome p=new Palindrome(n);
int s=p.palin(n);
System.out.println(p);
}
}


