import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = scan.nextInt();

		int factorial = 1;

		if(n == 0) {
			factorial = 1;
		} else if(n >= 1) {
			for(int i = n; i >= 1; i--) {
				factorial *= i;
			}
		} else {
			System.out.println("Please input a positive number");
			return;
		}

		System.out.println("Factorial: " + factorial);
	}
}
