import java.util.Scanner;

public class Jagged {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("How many rows? ");
		int row = scan.nextInt();

		System.out.print("How many columns for first row? ");
		int col1 = scan.nextInt();

		System.out.print("How many columns for second row? ");
		int col2 = scan.nextInt();

		System.out.print("How many columns for third row? ");
		int col3 = scan.nextInt();

		int[][] jagged = new int[row][];

		jagged[0] = new int[col1];
		jagged[1] = new int[col2];
		jagged[2] = new int[col3];

		int sum = 0;

		for(int i = 0; i < jagged.length; i++) {
			for(int j = 0; j < jagged[i].length; j++) {
				System.out.print("Input value (" + (i) + ", " + (j) + "): ");
				jagged[i][j] = scan.nextInt();

				sum += jagged[i][j];
			}
		}
		System.out.println("The sum of all numbers is: " + sum);
	}
}
