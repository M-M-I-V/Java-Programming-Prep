import java.util.Scanner;

public class RhombusTwo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Input a number: ");
		int n = scan.nextInt();

		for(int i = 1; i <= n; i++) {
			printRhombus(n, i);
		}

		for(int i = n - 1; i >= 1; i--) {
			printRhombus(n, i);
		}

	}

	private static void printRhombus(int n, int i) {
		for(int j = 0; j < n - i; j++) {
			System.out.print(" ");
		}

		for(int j = i; j >= 1; j--) {
			System.out.print(j);
		}

		for(int j = 2; j <= i; j++) {
			System.out.print(j);
		}

		System.out.println();

	}

}
