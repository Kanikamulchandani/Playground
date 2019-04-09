import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner s=new Scanner(System.in);
      int base=s.nextInt();
      int ex=s.nextInt();
      int n=1;
      for(int i=1;i<=ex;i++)
      {
        n=n*base;
      }
      System.out.print(n);
    }
}