import java.util.Scanner;
import java.util.*;
 class Array7
{
     public static void main(String args[])
    {
        System.out.println("Enter any 10 numbers ");
        Scanner scan=new Scanner(System.in);
        Array7 obj= new Array7();
        int arr[] = {0,0,0,0,0,0,0,0,0,0};
        int z;
        for(z=0;z<10;z++)
             arr[z]=scan.nextInt();
             System.out.println("The given array is:" );
        int n = arr.length;
        obj.sortInArray7(arr, n);
        for ( int i : arr)
            System.out.print(i + " ");
    } 
     void swap(int arr[], int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
     void sortInArray7(int arr[], int n)
    {
        Arrays.sort(arr);
        for (int i=0; i<n-1; i += 2)
            swap(arr, i, i+1);
    }
}