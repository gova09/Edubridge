import java.util.Scanner;

public class Checkeleigiblity {
	public static void eligible(int ten ,int twelv, int eng) {
		if(ten>=70)
		{
			if(twelv>=70)
			{
				System.out.println("Eligible");
			}
			else 
				System.out.println("Not Eligible");
		}
		
	}


public static void main(String[]args)
{
	int ten, twelv,eng;
	
	System.out.println("Enter the marks of ten,tweov, engg");
	Scanner scanner=new Scanner(System.in);
	ten=scanner.nextInt();
	twelv=scanner.nextInt();
	eng=scanner.nextInt();
	Checkeleigiblity(ten,twelv,eng);
	
	
}


private static void Checkeleigiblity(int ten, int twelv, int eng) {
	// TODO Auto-generated method stub
	
}
}
