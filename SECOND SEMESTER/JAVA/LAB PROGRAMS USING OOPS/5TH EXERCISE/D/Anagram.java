import java.util.*;
import java.lang.*;
public class Anagram
{
	private String s1;
	private String s2;
	public Anagram(String x,String y)
	{
		this.s1=x;
		this.s2=y;
	}
	public boolean check()
	{
		String s1=this.s1;
		String s2=this.s2;
		char[] temp1=s1.toCharArray();
		char[] temp2=s2.toCharArray();
		int n1=temp1.length;
		int n2=temp2.length;
		if(n1!=n2)
		{
			return false;
		}
		Arrays.sort(temp1);
		Arrays.sort(temp2);
		for(int i=0;i<n1;i++)
		{
			if(temp1[i] != temp2[i])
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Strings: ");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		Anagram a=new Anagram(s1,s2);
		if(a.check()==true)
		{
			System.out.println("The given Strings are anagram");
		}
		else{System.out.println("the given Strings are not anagram");}
	}
}
