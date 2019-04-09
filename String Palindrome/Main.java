import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      int p=0,len=str.length();
      StringBuilder sb=new StringBuilder(str);
      StringBuilder sb1=new StringBuilder(str);
      for(int i=len-1;i>=0;i--)
      {
        char ch=str.charAt(i);
        sb.setCharAt(len-(1+i),ch);
    
      }
         for(int i=len-1;i>=0;i--)
         {    if(sb.charAt(i)==sb1.charAt(i))
          p=1;
         else
         p=0;}
      if(p==1)
        System.out.print("Yes");
      else
        System.out.print("No");
      

    } 
}