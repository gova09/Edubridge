import java.util.Scanner;

public class Account {
	String accname,accno;
	double amount;
	public void depositamount()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Account name,Account number ");
		accname=scanner.next();
		accno=scanner.next();
		System.out.println("Enter the deposit amount");
		double depamount=scanner.nextInt();
		amount=depamount+amount;
	}
	public void withdrawamount()
	{
		
		
		
	}

}
