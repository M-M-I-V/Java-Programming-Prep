import java.util.Scanner;

class OneWord {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a phrase: ");
		String phrase = input.nextLine();

		String[] words = phrase.replaceAll("[^a-zA-Z ]", "").split("\\s");

		for(String word : words) {
			if(!word.isEmpty()) {
				System.out.println(word);
			}
		}
	}
}
