import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=s.nextInt();
      int val=s.nextInt();
      for(int i=0;i<n;i++)
      {
      for(int j=i+1;j<n;j++)
      {
      if((arr[i]+arr[j])==val)
      {
        System.out.print(arr[i]+", "+arr[j]+" ");
        System.out.println();
      }
    }}

    }
}