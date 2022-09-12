import java.util.*;
import java.lang.*;
public class StringConcat
{
private String s1;
private String s2;

public StringConcat(String s1,String s2)
{
this.s1=s1;
this.s2=s2;
}
public String con()
{
String s1=this.s1;
String s2=this.s2;
String s3=s1.concat("and");
s3=s3.concat(s2);
return s3;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter string1:");
String s1=sc.nextLine();
System.out.println("Enter string2:");
String s2=sc.nextLine();
StringConcat c=new StringConcat(s1,s2);
String s=c.con();
System.out.println(s);
}
}
