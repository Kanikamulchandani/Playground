import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here 
      Scanner scan = new Scanner(System.in);
    String str1 = scan.nextLine();
    String str2 = scan.nextLine();
        String str3 = scan.nextLine();
      StringBuilder sb1 = new StringBuilder(str1);
    StringBuilder sb2 = new StringBuilder(str2);
System.out.print(str1.replace(str2,str3));
    }
}