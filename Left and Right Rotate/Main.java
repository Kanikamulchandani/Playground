import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
  
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=s.nextInt();
    }
    int rot=s.nextInt();
    for(int i=1;i<=rot;i++)
    {
      int temp=arr[n-1];
      int k=0;
      if(n%2==0)
      {
        k=arr[n-2];
        for(int j=n-2;j>=2;j=j-2)
      {
        arr[j]=arr[j-2];
      } 
      }
      else
      {k=arr[n-1];
       for(int j=n-1;j>=2;j=j-2)
      {
        arr[j]=arr[j-2];
      } }
      arr[0]=k;
      temp=arr[1];
      k=0;
      for(int j=1;j<n-2;j=j+2)
      {
        arr[j]=arr[j+2];
        k=j+2;
      }
      arr[k]=temp;
    }
     for(int i=0;i<n;i++)
    {
      System.out.print(arr[i]+" ");
    }
    
  	}
}