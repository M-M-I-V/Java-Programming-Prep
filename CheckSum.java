import java.util.Scanner;

public class CheckSum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter student number: ");
		String studentNum = scan.nextLine();

		if(studentNum.length() != 6 || !studentNum.matches("\\d{6}")) {
			System.out.println("Invalid input.");
			return;
		} else {
			int checkSum = calculateCheckSum(studentNum);
			System.out.println("Checksum: " + checkSum);

			char letter = getLetter(checkSum);
			System.out.println("Corresponding letter: " + letter);
		}
	}

	private static int calculateCheckSum(String num) {
		int sum = 0;

		for(char n : num.toCharArray()) {
			sum += Character.getNumericValue(n);
		}

		while(sum >= 10) {
			int tempSum = 0;

			while(sum > 0) {
				tempSum += sum % 10;
				sum /= 10;
			}

			sum = tempSum;
		}

		return sum;
	}

	private static char getLetter(int checkSum) {
		return (char) ('A' + checkSum - 1);
	}
}
