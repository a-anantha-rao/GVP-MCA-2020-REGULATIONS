import java.util.*;
import java.lang.*;
public class NSquare
{
	private int num;
	public NSquare(int x)
	{
		this.num=x;
	}
	public int[][] input()
	{
		int m=this.num;
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[m][m];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
	}
	public int diagDiff(int arr[][])
	{
		int sum1=0;
		int sum2=0;
		int left=0;
		int m=this.num;
		int right=m-1;
		for(int i=0;i<m;i++)
		{
			left=i;
			sum1+=arr[i][left];
			sum2+=arr[i][right];
			right-=1;
		}
		if(sum1>sum2)
		{
			return sum1-sum2;
		}
		else
		{
			return sum2-sum1;
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.of rows: ");
		int x=sc.nextInt();
		NSquare s=new NSquare(x);
		System.out.println("Enter the elements: ");
		int arr[][]=s.input();
		System.out.println("The absloute difference of the sum of diagonals is :"+s.diagDiff(arr));
	}
}		
