import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
             Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int list[]=new int[n];
    for(int i=0;i<n;i++)
    {
      list[i]=s.nextInt();
    }
      int is_palin=0;
	 for(int i=0;i<(n/2-1);i++)
    {
      if(list[i+1]==list[n-2])
      {is_palin=1;
      }
    }
      if(is_palin==1)
        System.out.print("Yes");
      else
        System.out.print("No");

    }
}