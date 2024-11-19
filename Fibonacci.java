import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = scan.nextInt();

		int fibo = calcuFibo(n);
		System.out.println("Fibonacci: " + fibo);

	}

	private static int calcuFibo(int n) {
		int a = 0, b = 1, fibo = 0;

		for(int i = 2; i <= n; i++) {
			fibo = a + b;
			a = b;
			b = fibo;
		}
		return fibo;
	}

}
