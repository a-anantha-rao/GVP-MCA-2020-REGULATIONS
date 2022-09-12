import java.util.*;
import java.lang.*;
class Sum
{
protected int x;
protected int y;

public Sum(int a,int b)
{
this.x=a;
this.y=b;
}
}
class Child2 extends Sum
{
public Child2(int a,int b)
{
super(a,b);
}
public int method()
{
int x=this.x;
int y=this.y;
return(x+y);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter first Value");
int x=sc.nextInt();
System.out.println("Enter second Value");
int y=sc.nextInt();
Child2 s=new Child2(x,y);
int w=s.method();
System.out.println("Addition:"+w);
}
}