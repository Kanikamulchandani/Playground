public class Main {
	public static void main(String[] args) {
		//write the logic for the main function
      Customers cus1=new Customers();
      cus1.details(1001,"Saakshi",9000000000L,"Bangalore","16-Jul-1990",'F',"Lakme Kajal, Salwar");
      Customers cus2=new Customers();
    cus2.details(1008,"Rahul",9000000001L,"Chennai","27-Jan-1992",'M',"T-Shirt, Jeans");
      Suppliers s1=new Suppliers();
s1.detail(7901,"ABC Traders",8000000000L,"Mumbai",10,"Paid",4.75f);
      Suppliers s2=new Suppliers();
      s2.detail(7972,"XYZ Enterprises",8000000900L,"Kolkata",7,"Unpaid",4.35f);
      cus1.editAddress("Coimbatore");
      s1.editAddress("Delhi");
      cus1.placeOrder();
      s1.increaseStockLevel(5);
      s2.increaseStockLevel(10);
}
}

class Users {
		//write the logic for the class Users	
  int id;
 String name;
  long mob;
 String addr;
   String dob;
   char gender;
  String history;
  int items;
  String status;
  float rating;
  public void details(int i,String n,long m,String a,String d,char gen,String hist)
  {
    this.id=i;
    this.name=n;
    this.mob=m;
    this.addr=a;
    this.dob=d;
    this.gender=gen;
    this.history=hist;
    System.out.println(this.name+", "+this.mob);
  }
  public void detail(int i,String n,long m,String a,int it,String p,float ra)
  {
    this.id=i;
    this.name=n;
    this.mob=m;
    this.addr=a;
    this.items=it;
    this.rating=ra;
    this.status=p;
    System.out.println(this.name+", "+this.mob);
  }
  
  
  
}

class Customers extends Users{
		//write the logic for the class Customers	
  public void editAddress(String add)
  {
  System.out.println(this.name+", "+this.addr);
  this.addr=add;
   System.out.println(this.name+", "+this.addr);}
  public void placeOrder()
  {System.out.println("Order placed successfully!");}
  public void diplayProfileDetails(Users u)
  {}
  
}

class Suppliers extends Users {
		//write the logic for the class Suppliers
  public void editAddress(String add)
  { System.out.println(this.name+", "+this.addr);
  this.addr=add;
   System.out.println(this.name+", "+this.addr);}
  public void increaseStockLevel(int stock)
  {
  this.items=items+stock;
  System.out.println(this.name+", "+this.items);}
  public void diplayProfileDetails(Users u)
  {}
}