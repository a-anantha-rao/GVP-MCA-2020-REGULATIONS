import java.util.*;
import java.lang.*;
class Game
{
public int[] input(int n)
{
Scanner sc=new Scanner(System.in);
int[] arr=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
return arr;
}
public int[] scores(int[]arr1,int[]arr2)
{
int s1=0;
int s2=0;
int arr[]=new int[10];
for(int i=0;i<arr1.length;i++)
{
if(arr[i]==arr2[i])
{
continue;
}
if(arr1[i]>arr2[i])
{
s1++;
}
else
{
s2++;
}
}
arr[0]=s1;
arr[1]=s2;
return arr;
}
public static void main(String args[])
{
Game g=new Game();
Scanner sc=new Scanner(System.in);
System.out.println("how many games");
int n=sc.nextInt();
System.out.println("enter player 1 scores");
int arr1[]=g.input(n);
System.out.println("enter player 2 scores");
int arr2[]=g.input(n);
int[] arr=g.scores(arr1,arr2);
System.out.println("Games won by player1 are"+arr[0]);
System.out.println("Games won by player 2 are"+arr[1]);
}
}
