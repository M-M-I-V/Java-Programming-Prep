import java.util.Scanner;

public class JaggedTwo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("How many rows? ");
		int rows = scan.nextInt();

		int[][] jagged = new int[rows][];

		int sum = 0;
		int numOfElements = 0;
		int average = 0;

		for(int i = 0; i < rows; i++) {
			System.out.print("How many columns for row " + (i + 1) + "? ");
			int columns = scan.nextInt();

			jagged[i] = new int[columns];

			numOfElements += jagged[i].length;
		}

		for(int i = 0; i < jagged.length; i++) {
			for(int j = 0; j < jagged[i].length; j++) {
				System.out.print("Input value for row " + (i + 1) + ", column " + (j + 1) + ": ");
				jagged[i][j] = scan.nextInt();

				sum += jagged[i][j];
			}
		}

		System.out.println("\nSum: " + sum);

		average = sum / numOfElements;
		System.out.println("Average: " + average);

		scan.close();
	}
}
