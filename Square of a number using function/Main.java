import java.util.Scanner;
class Main
{
	
    public static int sq(int a)
      {
        int sq =a*a;
        return sq;
      }
	public static void main (String[] args)
    {
	 // Type your code here
       Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      System.out.print(sq(n));
      
    
	} 
}