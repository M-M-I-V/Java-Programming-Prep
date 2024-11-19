import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a text: ");
		String input = scan.nextLine().toLowerCase();

		char[] letters = input.toCharArray();
		int vowels = 0;

		for(char letter : letters) {
			if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
				vowels++;
			}
		}

		System.out.println("Vowels: " + vowels);
	}
}
