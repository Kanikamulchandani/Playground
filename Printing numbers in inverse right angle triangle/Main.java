import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
        Scanner in  = new Scanner(System.in);
        // Get the n value
	    int n = in.nextInt();
      int v=n;
      for(int i=1;i<=n;i++)
      {
      for(int j=v;j>=1;j--)
      {
      System.out.print(j);}
      v--;
      System.out.println();}
	}
}