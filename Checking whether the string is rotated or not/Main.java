import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner scan = new Scanner(System.in);
    String str1 = scan.nextLine();
    String str2 = scan.nextLine();
      StringBuilder sb1 = new StringBuilder(str1);
    StringBuilder sb2 = new StringBuilder(str2);
int len1 = sb1.length();
int len2 = sb2.length();
     if(str1.contains(str2.substring(0,2)))
       System.out.print("Yes");
      else
         System.out.print("No");
    }
}