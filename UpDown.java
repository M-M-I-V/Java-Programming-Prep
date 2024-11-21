import java.util.Scanner;

public class UpDown {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] num = new int[3];
		boolean exit = false;

		while(!exit) {
			System.out.print("Input first number: ");
			num[0] = scan.nextInt();

			System.out.print("Input second number: ");
			num[1] = scan.nextInt();

			System.out.print("Input third number: ");
			num[2] = scan.nextInt();

			if(num[0] > num[1] && num[0] > num[2]) {
				System.out.println("Decreasing order");
			} else if(num[0] < num[1] && num[0] < num[2]) {
				System.out.println("Increasing order");
			} else if(num[0] == num[1] || num[0] == num[2]) {
				System.out.println("Ooops! with repeating number");
			} else {
				System.out.println("Neither");
			}

			scan.nextLine();

			System.out.print("Try again: y/n? ");
			String response = scan.nextLine();

			if(response.equals("n")) {
				exit = true;
			}
		}
	}
}
