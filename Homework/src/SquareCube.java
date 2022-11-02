import java.util.Scanner;

public class SquareCube {
	public static void main(String[]args)
	{
		int num,i;
		int a[]=new int [10];
		Scanner scanner=new Scanner(System.in);
		num=scanner.nextInt();
		for(i=0;i<=num;i++)
		{
			a[i]=scanner.nextInt();
		}
		System.out.println(pattern(a));
	}
	public static int pattern(int a[])
	{
		int n1=0,n2=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				n1+=(a[i]*a[i]);
			}
			else
			{
				n2+=(a[i]*a[i]*a[i]);
			
			return n1+n2;
			}
		}
		return n2;
	}
	

}
