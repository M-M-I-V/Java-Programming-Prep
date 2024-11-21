import java.util.Scanner;

public class ReversedInt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = scan.nextInt();

		int reversed = 0;

		while(num != 0) {
			int lastDigit = num % 10;
			reversed = reversed * 10 + lastDigit;
			num /= 10;
		}
		System.out.println("Reversed: " + reversed);
	}
}
