import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a text: ");
		String input = scan.nextLine();

		char[] letters = input.toCharArray();

		System.out.print("Reversed string: ");
		for(int i = letters.length - 1; i >= 0; i--) {
			System.out.print(letters[i]);
		}
		System.out.println();
	}
}
