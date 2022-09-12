import java.util.*;
import java.lang.*;
public class LexStr
{
	private int num;
	private String s;
	public LexStr(int x,String y)
	{
		this.num=x;
		this.s=y;
	}
	public String[] sub()
	{
		int n=this.num;
		String s=this.s;
		int x=s.length()/n;
		int l=0;
		int temp=n;
		String [] arr=new String[x];
		for(int i=0;i<x;i++)
		{
			arr[i]=s.substring(l,n);
			l+=temp;
			n+=temp;
		}
		Arrays.sort(arr);
		return arr;
	}
	public void output(String[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int x=sc.nextInt();
		System.out.println("enter String: ");
		sc.nextLine();
		String y=sc.nextLine();
		LexStr s=new LexStr(x,y);
		String arr[]=s.sub();
		System.out.println("Lexographical order of substrings of length "+x+" are: ");
		s.output(arr);
	}
}
