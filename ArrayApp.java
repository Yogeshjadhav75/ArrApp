import java.util.*;
public class ArrayApp
{
  public static void main(String x[])
  {
    int arr[],i;
    Scanner sc=new Scanner(System.in);
    arr=new int[5];
    System.out.println("enter array values");
    for(i=0;i<arr.length;i++)
    {
      arr[i]=sc.nextInt();
    }
    int max=arr[0];
    for(i=0;i<arr.length;i++)
    {
      if(max<arr[i])
       max=arr[i];
    }  
    System.out.println("max value from array is "+max);
  }
}