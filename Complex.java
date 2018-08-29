import java.util.*;
class Java1
{
private int real,image;
public void get(int r,int i)
{
real=r;
image=i;
}
public void show()
{
System.out.println("" + real + "+" +image +"i");
}
}
public class Complex
{
public static void main(String[] x)
{
Java1 obj=new Java1();
obj.get(2,5);
obj.show();
}
}