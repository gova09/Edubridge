import java.util.Scanner;

public class Reverse {
	public static void main(String[] args)
	{
		int num, rev=0,rem;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		num=scanner.nextInt();
		while(num>0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		System.out.println("Reverse number is"+rev);
	}

}
