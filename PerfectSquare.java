import java.util.Scanner;

public class PerfectSquare {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean exit = false;

		while(!exit) {
			System.out.print("Input a perfect square number: ");
			int num = scan.nextInt();

			int square = 0, root = 0;

			while(square < num) {
				root++;
				square = root * root;
			}

			if(num == square) {
				System.out.println("The square root of " + num + " is " + root);
			} else {
				System.out.println(num + " is not a perfect square number");
			}

			scan.nextLine();

			System.out.print("Try another number (y/n)? ");
			String ans = scan.nextLine().toLowerCase();

			if(ans.equals("n")) {
				System.out.println("Thank you...");
				exit = true;
			}
		}
	}
}
