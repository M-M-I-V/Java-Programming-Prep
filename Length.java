import java.util.Scanner;

public class Length {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a text: ");
		String input = scan.nextLine();


		char[] l = input.toCharArray();
		int length = 0;

		for(int i = 0; i <= l.length - 1; i++) {
			length++;
		}

		System.out.println("Length: " + length);
	}
}
