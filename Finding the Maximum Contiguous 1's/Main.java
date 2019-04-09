import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      
       Scanner sc = new Scanner(System.in);
       
int arr_size = sc.nextInt();
       int arr[] = new int[arr_size];
       for(int index = 0; index < arr_size; index++)
       {
           arr[index] = sc.nextInt();
       }
       int max=0;
       for(int index = 0; index < arr_size; index++)
       {
           if(arr[index] ==1)
           {
              max++;
           }
         else 
           break;
       }
       System.out.print(max);
    }
}