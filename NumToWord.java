import java.util.Scanner;

public class NumToWord {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Input a number (1-1000): ");
		int num = scan.nexxtInt();

		if(num < 0 || num > 1000) {
			System.out.println("Invalid input");
			return;
		} else {
			String convertedWord = toWord(num);
			System.out.println("Word: " + convertedWord);
		}
	}

	private static String toWord(int num) {
		String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven"}
	}
}
