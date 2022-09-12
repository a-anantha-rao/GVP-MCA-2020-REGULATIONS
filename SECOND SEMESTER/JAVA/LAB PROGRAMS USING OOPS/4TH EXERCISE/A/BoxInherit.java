import java.lang.*;
import java.util.*;
class Rectangle
{
int width,height,depth;
public Rectangle(int x,int y,int z)
{
this.width=x;
this.height=y;
this.depth=z;
}
}
class BoxInherit extends Rectangle
{
public BoxInherit(int x,int y,int z)
{
super(x,y,z);
}
int volume()
{
return (width*height*depth);
}
public static void main(String args[])
{
BoxInherit b=new BoxInherit(15,20,10);
int result=b.volume();
System.out.println(result);
}
}
