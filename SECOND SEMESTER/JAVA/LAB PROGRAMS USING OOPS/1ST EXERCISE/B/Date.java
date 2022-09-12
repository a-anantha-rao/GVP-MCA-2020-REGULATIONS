import java.util.*;
import java.lang.*;
 class Date
{
private int hh;
private int mm;
private int ss;
private String ist;

public Date(int w,int x,int y,String z)
{
this.hh=w;
this.mm=x;
this.ss=y;
this.ist=z;
}
public String tformat()
{
int hh=this.hh;
int mm=this.mm;
int ss=this.ss;
String ist=this.ist;
if(ist.equals("AM")&&hh<12)
{
return(hh+":"+mm+":"+ss);
}
else if(ist.equals("AM")&&hh==12)
{
return("00:"+mm+":"+ss);
}
else if(ist.equals("PM")&&hh<12)
{
return(hh+12+":"+mm+":"+ss);
}
else if(ist.equals("AM")&& hh==12)
{
return("00:"+mm+":"+ss);
}
else if(ist.equals("PM")&& hh<12)
{
return(hh+12+":"+mm+":"+ss);
}
else
{
return "0";
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the time in 12hrs Format:");
System.out.println("Enter hours at hh:");
int hh=sc.nextInt();
System.out.println("Enter the minutes at mm:");
int mm=sc.nextInt();
System.out.println("Enter the seconds at ss:");
int ss=sc.nextInt();
System.out.println("Enter AM/PM:");
sc.nextLine();
String ist=sc.nextLine();
Date d=new Date(hh,mm,ss,ist);
String s=d.tformat();
System.out.println("24 hours format of given time:"+ s);
}
}