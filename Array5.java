import java.util.Scanner;
public class Array5
{
public static void main(String[] x)
{


System.out.println("enter elements in array:-");
Scanner sc=new Scanner(System.in);

int arr[]={0,0,0,0,0,0,0,0,0,0};
int largest=arr[0];
int secondlargest=arr[0];
for(int i=0;i<10;i++)
arr[i]=sc.nextInt();
System.out.println("array;-");
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+"\t");
}
for(int i=0;i<arr.length;i++)
{
if(arr[i]>largest)
{
secondlargest=largest;
largest=arr[i];
}
else if(arr[i]>secondlargest)
{
secondlargest=arr[i];
}
}
System.out.println("secondlargest number;-" + secondlargest);
}
}