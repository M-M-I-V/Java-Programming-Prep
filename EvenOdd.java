import java.io.*;

public class EvenOdd {
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter a number: ");
		int num = Integer.parseInt(read.readLine());

		if(num % 2 == 0) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}
	}
}
