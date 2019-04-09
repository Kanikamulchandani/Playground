//import required packages
import java.util.Scanner;
class Faculty
{
  int sala;
  public void salary(int sal)
  {
    //write your Faculty class statements
    this.sala=sal;
  
  }
 
}
class CSE extends Faculty
{
  public void salary(int n)
  {
    //write your CSE class statements
     super.salary(n);
    this.sala=sala+3000;
     System.out.println("CSE Faculty: "+this.sala);
  }
}
class IT extends Faculty
{
  public void salary(int n)
  {
    //write your IT class statements
     super.salary(n);
    this.sala=sala+5000;
    System.out.println("IT Faculty: "+this.sala);
  }
}
class ECE extends Faculty
{
  public void salary(int n)
  {
    //write your ECE class statements
     super.salary(n);
    this.sala=sala+4500;
    System.out.println("ECE Faculty: "+sala);
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    System.out.println("Base Salary: "+n);
    CSE obj = new CSE();
    obj.salary(n);
    IT obj1 = new IT();
    obj1.salary(n);
    ECE obj2 = new ECE();
    obj2.salary(n);
    //implement your required concept here
  }
}
