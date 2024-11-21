import java.util.Scanner;

public class Tribonacci {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter value a: ");
		int a = scan.nextInt();

		System.out.print("Enter value b: ");
		int b = scan.nextInt();

		System.out.print("Enter value c: ");
		int c = scan.nextInt();

		printSequence(a, b, c);
	}

	private static void printSequence(int a, int b, int c) {
		int[] sequence = new int[12];

		sequence[0] = a;
		sequence[1] = b;
		sequence[2] = c;

		for(int i = 3; i <= sequence.length - 1; i++) {
			sequence[i] = sequence[i - 1] + sequence[i - 2] + sequence[i - 3];
		}

		for(int value : sequence) {
			System.out.print(value + "  ");
		}

		System.out.println();
	}
}
