import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int last=n%10;
      int first=0,sum=0;
      while(n>=10)
      {
        n=n/10;
        
      }
      first=n;
      sum=first+last;
       System.out.println(sum);
	}
}