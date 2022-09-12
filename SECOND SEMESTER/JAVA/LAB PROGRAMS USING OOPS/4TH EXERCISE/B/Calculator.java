import java.lang.*;
import java.util.*;
class Calculator
{
	private int n;
	private static int count=0;
	private double num;
	public Calculator()
	{
		this.n=1;
		Calculator.count+=1;
	}
	public Calculator(int x)
	{
		this.n=x;
		Calculator.count+=1;
	}
	public Calculator(double x)
	{
		this.num=x;
		Calculator.count+=1;
	}
	public static Calculator powerInt(Calculator obj1,Calculator obj2)
	{
		Calculator temp=new Calculator();
		for(int i=0;i<obj2.n;i++)
		{
			temp.n=temp.n*obj1.n;
		}
		return temp;
	}
	public void display()
	{
		System.out.println(this.n);
	}
	public static Calculator powerDouble(Calculator obj4,Calculator obj5)
	{
		Calculator temp=new Calculator(0);
		temp.num=Math.pow(obj4.num,obj5.num);
		return temp;
	}
	public void show()
	{
		System.out.println(this.num);
		System.out.println("Number of Objects are:"+Calculator.count);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Calculator obj1,obj2,obj3,obj4,obj5,obj6;
		System.out.print("Enter:");
		int a=sc.nextInt();
		obj1=new Calculator(a);
		System.out.print("Enter:");
		int b=sc.nextInt();
		obj2=new Calculator(b);
		obj3=Calculator.powerInt(obj1,obj2);
		System.out.print("After Powering result in Integer:");
		obj3.display();
		double x=a;
		double y=b;
		obj4=new Calculator(x);
		obj5=new Calculator(y);
		obj6=Calculator.powerDouble(obj4,obj5);
		System.out.print("After Powering result in Double:");
		obj6.show();
				
	}
}
		