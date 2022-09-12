import java.util.*;
import java.lang.*;
public class AltString
{
	private int n;
	public AltString(int x)
	{
		this.n=x;
	}
	public String[] input()
	{
		int n= this.n;
		String[] arr=new String[n];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextLine();
		}
		return arr;
	}
	public String reverse(String[] arr)
	{
		String main="";
		for(int i=0;i<arr.length;i++)
		{
			String sub="";
			for(int j=0;j<arr[i].length();j=j+2)
			{
				char ch=arr[i].charAt(j+1);
				char ch1=arr[i].charAt(j);
				sub+=Character.toString(ch);
				sub+=Character.toString(ch1);
			}
			main+=sub;
		}
		return main;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.of Strings: ");
		int x=sc.nextInt();
		AltString r=new AltString(x);
		System.out.println("Enter the strings: ");
		String[] arr=r.input();
		System.out.println("The resulted string is: "+r.reverse(arr));
	}
}
