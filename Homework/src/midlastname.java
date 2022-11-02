import java.util.Scanner;

public class midlastname {
	public static void name(String mname,String lname) {
		
		System.out.println("The name is" +mname+lname);
		
	}
	public static void main(String[] args) {
		String mname,lname;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter middlename and lastname");
		mname=scanner.nextLine();
		lname=scanner.nextLine();
		name(mname,lname);
		
	}

}
