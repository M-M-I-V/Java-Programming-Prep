import java.util.Scanner;
import java.util.HashSet;

public class GuessingGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashSet<Integer> guesses = new HashSet<>();

		int secretNum = 8;
		int attempts = 0;

		System.out.println("Guessing Game: Guess the number");

		while(true) {
			System.out.print("Input guess: ");
			int guess = scan.nextInt();

			if(!guesses.contains(guess)) {
				guesses.add(guess);
				attempts++;
			}

			if(guess == secretNum) {
				System.out.println("Congrats!");
				break;
			} else if(guess > secretNum) {
				System.out.println("Ooops! Too large.");
			} else if(guess < secretNum) {
				System.out.println("Ooops! Too small.");
			} else {
				System.out.println("Please input a valid number.");
			}
		}

		System.out.println("Number of attempts: " + attempts);
	}
}
