import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		int num,i,sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		num=scanner.nextInt();
		for(i=1;i<=num;i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
		}
		System.out.println("sum of odd number"+num+"="+sum);
		
	}

}