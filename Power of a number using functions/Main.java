import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int b=s.nextInt();
    int ex=s.nextInt();
    int c=pow(b,ex);
    System.out.print(c);
  }
  public static int pow(int b,int e)
  {
    int a=1;
  	for(int i=1;i<=e;i++)
    {
      a=a*b;
    }
    return a;
    
  }
}