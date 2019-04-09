import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int list[]=new int[n];
      int m=s.nextInt();
    for(int i=0;i<n;i++)
    {
      list[i]=s.nextInt();
    }
      int c=0,count=0;
    for(int k=1;k<=m;k++)
    {
    for(int i=0;i<n;i++)
    {
      if(k==list[i])
       {
          c++;
        count++;
         
      }
      
    }
       if(count==c||k==m)
      { System.out.println(k+" "+c);}
      c=0;
      count=0;
   }
   /*for(int i=0;i<n;i++)
    { System.out.println(list[i]);
    }*/

    }
}