import java.util.Scanner;

public class Factorial {
	public static void main(String[] args)
	{
		int num,fact=1,i;
		System.out.println("Enter the number");
		Scanner scanner=new Scanner(System.in);
		num=scanner.nextInt();
		for(i=1;i<=num;i++) {
			fact=fact*i;
			System.out.println("The number is"+fact);
		}
	}

}
