import java.util.*;
import java.lang.*;
public class Diagmat
{
	private int num;
	public Diagmat(int x)
	{
		this.num=x;
	}
	public int[] input()
	{
		int n=this.num;
		int x=n*n;
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[x];
		for(int i=0;i<x;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public int[] diag(int n,int[] arr)
	{
		int ar[]=new int[n];
		int count=0;
		for(int i=0;i<arr.length;i+=(n+1))
		{
			ar[count]=arr[i];
			count+=1;
		}
		return ar;
	}
	public void output(int[] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+"\t");
		}
	}		
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.of rows in a matrix");
		int n=sc.nextInt();
		Diagmat d=new Diagmat(n);
		System.out.println("enter elements into the array: ");
		int arr[]=d.input();
		int ar[]=d.diag(n,arr);
		d.output(ar);
	}
}
			