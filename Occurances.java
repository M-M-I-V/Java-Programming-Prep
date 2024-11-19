import java.util.Scanner;

public class Occurances {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a text: ");
		String text = scan.nextLine().toLowerCase();

		System.out.print("Enter a character: ");
		char charac = scan.nextLine().charAt(0);
		
		char charL = Character.toLowerCase(charac);
		char[] letters = text.toCharArray();
		int occu = 0;

		for(char letter : letters) {
			if(letter == charL) {
				occu++;
			}
		}

		System.out.println("Occurances: " + occu);
	}
}
