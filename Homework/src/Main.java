
import java.util.Scanner;

public class Main {

	private static void printPattern1(int rows) {
		for (int i = 1; i <= rows; i++) {
			
			int numberOfWhiteSpaces = rows - i;
			printString(" ", numberOfWhiteSpaces);
			printString(i + " ", i);
            System.out.println("");
		}
	}

	
	private static void printString(String s, int times) {
		for (int j = 0; j < times; j++) {
			System.out.print(s);
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		System.out.println("Please enter the row 2 to print:");
		int rows2 = scanner.nextInt();
		System.out.println("Please enter the row 3 to print:");
		int rows3 = scanner.nextInt();
		// System.out.println("Rows = "+rows);
		scanner.close();

		System.out.println("Printing Pattern \n");
		printPattern1(rows);
		printPattern1(rows2);
		printPattern1(rows3);

	}

}