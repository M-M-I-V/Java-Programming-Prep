import java.util.Scanner;

public class RhombusOne {
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

	private static void printRhombus(int n, int j) {
		int space = (n - j) / 2;

		for(int i = 0; i < space; i++) {
			System.out.print(" ");
		}

		for(int i = 0; i < j; i++) {
			System.out.print(j);
		}

		System.out.println();
 	}

}
