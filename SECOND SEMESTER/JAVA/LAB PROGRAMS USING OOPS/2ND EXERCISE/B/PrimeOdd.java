import java.util.*;
import java.lang.*;
class PrimeOdd
{
private int n;
public PrimeOdd(int x)
{
this.n=x;
}
public int[] Input()
{
Scanner sc=new Scanner(System.in);
int index=0;
int n=this.n;
int arr[]=new int[20];
for(int i=0;i<n;i++)
{
System.out.println("Enter Number");
int a=sc.nextInt();
arr[index]=a;
index+=1;
}
return arr;
}
public void podd(int arr[])
{ 
int i,j,count;
int a;
for(i=0;i<arr.length;i++)
{
count=0;
for(j=1;j<arr[i]+1;j++)
{
if(arr[i]%j==0 && arr[i]%2==1)
count+=1;
}
if(count==2)
{
if(arr[i]>0)
System.out.println(arr[i]);
}
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter How Many?");
int num=sc.nextInt();
PrimeOdd obj=new PrimeOdd(num);
int arr[]=obj.Input();
obj.podd(arr);
}
}