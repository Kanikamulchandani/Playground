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
    int max=list[0];
    int m=0;
    for(int i=0;i<n;i++)
    {
      if(max<list[i])
      {
        max=list[i];
        m=i;
      }
    }
    System.out.print(m);

  }
}