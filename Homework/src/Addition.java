import java.util.Scanner;

public class Addition {
	public static void addNumbers()
	{
		int num1,num2,res;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the num1");
		num1=scanner.nextInt();
		System.out.println("enter the num2");
		num2=scanner.nextInt();
	    res=num1+num2;
	    System.out.println("The result is" +res);
	    
	}
	public static void main(String[]args) {
		
		addNumbers();
		
		
		
	}
	


}
