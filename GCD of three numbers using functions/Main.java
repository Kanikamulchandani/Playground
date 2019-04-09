import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      int n2=s.nextInt();
      int n3=s.nextInt();
      int c=gcd(n1,n2);
      System.out.print(gcd(c,n3));
	}
  public static int gcd(int a,int b)
  {
    int min,gc=1;
    if(a>b)
      min=b;
    else
      min=a;
    while(min>=1)
    {
      if((a%min==0)&&(b%min==0))
      {
        gc=min;
        break;
      }
      min--;
    }
    return gc;
    
  }
}