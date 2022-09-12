import java.util.*;
import java.lang.*;
public class TwoD
{
	private int rows;
	private int cols;
	public TwoD(int x,int y)
	{
		this.rows=x;
		this.cols=y;
	}
	public int[][] input()
	{
		int m=this.rows;
		int n=this.cols;
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
	}
	public int[] analyze(int arr[][])
	{
		int max=arr[0][0];
		int m=this.rows;
		int n=this.cols;
		int[] ar=new int[2];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if (arr[i][j]>max)
				{
					max=arr[i][j];
					ar[0]=i+1;
					ar[1]=j+1;
				}
			}
		}
		return ar;
	}
	public void output(int[] ar)
	{
		System.out.println("Max demand is in "+ar[0]+"rd year");
		System.out.println("Max demand is for "+ar[1]+"rd Id");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Financial years: ");
		int x=sc.nextInt();
		System.out.println("Enter no of Id's: ");
		int y=sc.nextInt();
		TwoD d=new TwoD(x,y);
		System.out.println("Enter the items sold for the items in that particular year");
		int[][] arr=d.input();
		int [] ar=d.analyze(arr);
		d.output(ar);
	}
}
