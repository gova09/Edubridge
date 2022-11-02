package Project;

import java.util.Scanner;

public class BankingApp {
	public static void main(String[] args)
	{
		BankAccount obj1= new BankAccount("Govarthana", "31201609");
        obj1.show();
	}
}
class BankAccount
{
	int balance;
	int previoustransaction;
	String customerName;
	String customerId;
	BankAccount(String cname, String cid)
	{
		customerName= cname;
		customerId=cid;
	}
	
	void deposit(int amount)
	{
		if(amount !=0)
		{
			balance= balance+amount;
			previoustransaction=amount;
		}
	}
	void withdraw(int amount)
	{
		if(amount !=0)
		{
			balance= balance-amount;
			previoustransaction=amount;
		}
	}
	void getPreviousTransaction()
	{
		if(previoustransaction >0)
		{
			System.out.println("Deposit"+previoustransaction);
		}
		else if(previoustransaction < 0)
		{
			System.out.println("withdraw :"+Math.abs(previoustransaction));
		}
		else
		{
			System.out.println("No transaction occured");
		}
	}
	void show()
	{
		char option='\0';
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome"+customerName);
		System.out.println("Your Id"+customerId);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B.  Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. PreviousTransaction");
		System.out.println("E.  Exit");
		
		do
		{
			System.out.println("==========================");
			System.out.println("Enter a option");
			System.out.println("=============================");
			option= scanner.next().charAt(0);
			System.out.println("\n");
			
			switch(option)
			{
			case 'A':
				System.out.println("----------------");
				System.out.println("Balance="+balance);
				System.out.println("-----------------");
				System.out.println("\n");
				break;
			case 'B':
				System.out.println("----------------");
				System.out.println("Enter am amount to deposit:");
				System.out.println("-----------------");
				int amount=scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("----------------");
				System.out.println("Enter am amount to withdraw:");
				System.out.println("-----------------");
				int amount2=scanner.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
			case 'D':
				System.out.println("----------------");
				getPreviousTransaction();
				System.out.println("-----------------");
				System.out.println("\n");
				break;
			case 'E':
				System.out.println("***************");
				break;
				default:
					System.out.println("Invalid option!! please enter again");
					break;
				
				
				
				
			}
		}while(option != 'E');
		System.out.println("Thank you");
	}
}
