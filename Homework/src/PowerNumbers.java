import java.util.Scanner;

public class PowerNumbers {
	static int power(int base, int exponent)
	{
		int power=1;
		for(int i=1;i<=exponent;i++)
			power=power*base;
		return power;
	}
	public static void main(String[] args)
	{
		int base, exponent;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the base");
		base=scanner.nextInt();
		System.out.println("Enter the exponent");
		exponent=scanner.nextInt();
		int pow;
		pow=power(base,exponent);
		System.out.println(base+"to the power "+exponent+"is"+pow);
		
		
	}

}
