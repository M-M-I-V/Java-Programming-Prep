import java.util.Scanner;
import java.util.Arrays;

public class Seats {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int passenger = 0;

		String[][] seats = new String[13][6];

		for(String[] seat : seats) {
			Arrays.fill(seat, "*");
		}

		System.out.println("Airplane Seating Arrangement\n");

		while(passenger <= 78) {
			try {
				System.out.print("Which class? Type 1 for first class, and 0 for economy class: ");
				int seatClass = scan.nextInt();

				if(seatClass == 1) {
					System.out.print("Select row: 1 or 2? ");
					int row = scan.nextInt();

					System.out.print("Select seat number (1-6): ");
					int seat = scan.nextInt();

					passenger++;
					printSeats(row, seat, seats);

				} else if(seatClass == 0) {
					System.out.print("Smoking or non-smoking area? Type 1 for smoking, and 0 for non-smoking: ");
					int smoking = scan.nextInt();

					if(smoking == 1) {
						System.out.print("Select row (8-13): ");
						int row = scan.nextInt();

						System.out.print("Select seat number (1-6): ");
						int seat = scan.nextInt();

						passenger++;
						printSeats(row, seat, seats);

					} else if(smoking == 0) {
						System.out.print("Select row (3-7): ");
						int row = scan.nextInt();

						System.out.print("Select seat number (1-6): ");
						int seat = scan.nextInt();

						passenger++;
						printSeats(row, seat, seats);

					} else {
						throw new IllegalArgumentException("Please input a valid choice");
					}

				} else {
					throw new IllegalArgumentException("Please input a valid choice");
				}

			} catch(IllegalArgumentException e) {
				System.out.println(e);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static void printSeats(int row, int seat, String[][] seats) {
		seats[row - 1][seat - 1] = "X";

		for(String[] se : seats) {
			for(String s : se) {
				System.out.print(s);
			}
		System.out.println();
		}
	}
}
