import java.util.*;
import java.lang.*;
public class VowCons
{
	private int num;
	public VowCons(int x)
	{
		this.num=x;
	}
	public String[] input()
	{
		int n= this.num;
		String[] arr=new String[n];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextLine();
		}
		return arr;
	}
	public int[] count(String[] arr)
	{
		char[] vowels={'A','a','e','E','I','i','O','o','U','u'};
		int[] vcCount=new int[(arr.length)*2];
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			char[]tempArray=arr[i].toCharArray();
			int v=0;
			int c=0;
			for(int j=0;j<tempArray.length;j++)
			{
				for(int k=0;k<vowels.length;k++)
				{
					if(tempArray[j]==vowels[k])
					{
						v+=1;
					}
				}
			}
			vcCount[count]=v;
			vcCount[count+1]=arr[i].length()-v;
			count+=2;
			System.out.println(count);
		}
		return vcCount;
	}
	public void output(int[] vcCount)
	{
		System.out.println("V\tC");
		for(int i=1;i<vcCount.length;i=i+2)
		{
			System.out.print(vcCount[i-1]+"\t"+vcCount[i]+"\n");
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of strings: ");
		int x=sc.nextInt();
		VowCons s=new VowCons(x);
		System.out.println("Enter Strings: ");
		String arr[]=s.input();
		int[] vcCount=s.count(arr);
		s.output(vcCount);
	}
}
