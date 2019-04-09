//import required packages here
import java.util.Scanner;
class Item
{
  private int price;
  //create various method to return attribute value(s)
  public int pp(int n)
  {
    return n;
  }
}
   
class Customer
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
  public String pro(String name)
  {
    return name;
  }
  public int qua(int n)
  {
    return n;
  }
}

class Bill 
{
  //implement your logic to calculate total price
  public int bb(int n,int c)
  {
    return c*n;
  }
}
class Main
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    String name=s.nextLine();
    int n=s.nextInt();
    int no=s.nextInt();
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    System.out.print("Total Price is : "+obj.bb(n,no));
    //write the logic here
  }
}