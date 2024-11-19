import java.util.Scanner;

public class ReversedInteger {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scan.nextInt();

		int reversed = 0;

		while(number != 0) {
			int lastDigit = number % 10;
			reversed = reversed * 10 + lastDigit;
			number /= 10;
		}

		System.out.println("Reversed number: " + reversed);
	}
}
