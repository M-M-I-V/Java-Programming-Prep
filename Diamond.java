import java.util.Scanner;

public class Diamond {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = 0;
		boolean validNum = false;

		while(!validNum) {
			try {
				System.out.print("Enter an odd number: ");
				num = scan.nextInt();

				if(num % 2 == 0) {
					throw new RuntimeException("Please enter an odd number (e.g., 5)");
				} else {
					validNum = true;
				}

			} catch(RuntimeException e) {
				System.out.println(e);
			}
		}

		for(int i = 1; i <= num; i += 2) {
			printStars(num, i);
		}

		for(int i = num - 2; i >= 1; i -= 2) {
			printStars(num, i);
		}
	}

	public static void printStars(int n, int stars) {
		int spaces = (n - stars) / 2;

		for(int i = 0; i < spaces; i++) {
			System.out.print(" ");
		}

		for(int i = 0; i < stars; i++) {
			System.out.print("*");
		}

		System.out.println();
	}
}
