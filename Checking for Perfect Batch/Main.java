import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int list[]=new int[n];
    for(int i=0;i<n;i++)
    {
      list[i]=s.nextInt();
    }
    int a=0,flag=0,b=0;
     a=list[0]+list[1]+list[2];
    for(int i=3;i<n;i=i+3)
    {
    
      b=list[i]+list[i+1]+list[i+2];
     if(a!=b)
     {
       flag=1;
       break;
     }
      
     
    }
    if(flag==0)
    {
    System.out.print("Perfect Batch");}
    else
      System.out.print("Not a Perfect Batch");
  }
}