import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      int n2=s.nextInt();
      int n3=s.nextInt();
      int c=great(n1,n2);
      int g=great(c,n3);
      System.out.print(g);
      
	}
  public static int great(int a,int b)
  {
    if(a>b)
      return a;
    else 
      return b;
  }
}