import java.util.Scanner;

public class Customerdetails {
	String customername,address;
	int customerid;
	long mobileno;
	public void ReadData()
	{
		System.out.println("Enter the Customer Details");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the customer Name");
		customername=scanner.next();
		System.out.println("Enter the customer id");
		customerid=scanner.nextInt();
		System.out.println("Enter the customer phoneno");
		mobileno=scanner.nextLong();
		System.out.println("Enter the address");
		address=scanner.next();
	}
	public void PrintData()
	{
		System.out.println("Customer name"+customername);
		System.out.println("customer id"+customerid);
		System.out.println("customer phoneno"+mobileno);
		System.out.println("customer address"+address);
	}
	public static void main(String[] arg)
	{
		Customerdetails customer=new Customerdetails();
		customer.ReadData();
		customer.PrintData();
		System.out.println(customer.customername);
		System.out.println(customer.customerid);
		System.out.println(customer.mobileno);
		System.out.println(customer.address);
		
		
		
		
		
		
		
	}
}
