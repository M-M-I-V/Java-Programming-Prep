import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a text: ");
		String text = scan.nextLine();
		
		int length = text.length();
		char[] letters = text.toCharArray();
		boolean isPalindrome = true;

		for(int i = 0; i <= length / 2; i++) {
			if(letters[i] != letters[length - i - 1]) {
				isPalindrome = false;
			}
		}

		System.out.println("Palindrome: " + isPalindrome);
	}
}
