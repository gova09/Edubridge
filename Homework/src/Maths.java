import java.util.Scanner;

public class Maths {
	public static void subNumber(int num1,int num2)
	{
		
		System.out.println(num1-num2);
	}
	public static void divideNumber(int num1,int num2)
	{
		System.out.println(num1/num2);
	}
	public static void multipleNumber(int num1,int num2, int num3)
	{
		System.out.println(num1*num2*num3);
	}
	public static void manin(String arge[])
	{
		int num1,num2,num3;
        Scanner scanner=new Scanner(System.in);
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		num3=scanner.nextInt();
		subNumber(num1,num2);
		divideNumber(num1,num2);
		multipleNumber(num1,num2,num3);
	}
}
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
	


