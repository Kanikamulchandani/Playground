import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
      int c=num;
      int count=0;
      if(num==0)
        System.out.print(num);
      else
      {
      while(num>0)
      {
      	count++;
        num=num/10;
      }}
      num=c;
      int sum=0;
      int pow=1;
      while(num>0)
      {
      int rem=num%10;
      for(int i=1;i<=count;i++)
      pow=pow*rem;
        sum=sum+pow;
        pow=1;
        num=num/10;
      }
      if(sum==c)
        System.out.print("Armstrong Number");
      else
         System.out.print("Not a Armstrong Number");
        
	}
}