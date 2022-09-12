import java.util.*;
import java.lang.*;
class DataTypes
{
private int x;
public DataTypes(int x)
{
this.x=x;
}
public String[] pdt(long x)
{
String[]ans=new String[4];
int count=0;
if(x>=-128 && x<=127)
{
ans[count]="BYTE";
count++;
}
if(x>=-32768 && x<=32767)
{
ans[count]="SHORT";
count++;
}
if(x>=-Math.pow(2,31) && x<=Math.pow(2,31))
{
ans[count]="INT";
count++;
}
if(x>=-Math.pow(2,63) && x<=Math.pow(2,63))
{
ans[count]="LONG";
count++;
}
return ans;
}
public void print(String arr[])
{
for(int i=0;i<arr.length;i++)
{
if(arr[i]!=null)
{
System.out.println(arr[i]);
}
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number of elements in array");
int n=sc.nextInt();
DataTypes d=new DataTypes(n);
for(int i=0;i<n;i++)
{
System.out.println("enter integer");
long e=sc.nextLong();
String[] s=d.pdt(e);
d.print(s);
}
}
}