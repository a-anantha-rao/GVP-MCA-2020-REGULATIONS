import java.util.*;
import java.lang.*;
public class Marks
{
private int maths;
private int hindi;
private int telugu;

public Marks(int x,int y,int z)
{
this.maths=x;
this.hindi=y;
this.telugu=z;
}
public double percent()
{
int m=this.maths;
int h=this.hindi;
int t=this.telugu;
int total=m+h+t;
double p=(total*100)/300;
return p;
}
public String div(double x)
{
if(x>=70)
{
return("Distinction");
}
else if(x>60 && x<70)
{
return("First Class");
}
if(x>=70)
{
return("Distinction");
}
else if (x>60 && x<70)
{
return("First Class");
}
else
{
return("Second Class");
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Maths Marks:");
int m=sc.nextInt();
System.out.println("Enter Hindi Marks");
int h=sc.nextInt();
System.out.println("Enter Telugu Marks:");
int t=sc.nextInt();
Marks stu=new Marks(m,h,t);
double per=stu.percent();
String div=stu.div(per);
System.out.println("Percantage of Student is"+ per);
System.out.println(div);
float f=(float)per;
System.out.println(f);
}
}

