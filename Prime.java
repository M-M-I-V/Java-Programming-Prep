import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = scan.nextInt();

		boolean isPrime = true;

		if(num <= 1) {
			isPrime = false;
		} else {
			for(int i = 2; i <= Math.sqrt(num); i++) {
				if(num % i == 0) {
					isPrime = false;
				}
			}
		}

		if(isPrime) {
			System.out.println(num + " is prime");
		} else {
			System.out.println(num + " is not prime");
		}

	}
}
