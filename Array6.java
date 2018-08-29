import java.util.*;
class Array
{
static int i;
int j;
static
{
i=10;
System.out.println("Static block");
}
Array()
{
System.out.println("constructore called");
}
}
public class Array6
{
public static void main(String[] x)
{
Array t=new Array();
}
}