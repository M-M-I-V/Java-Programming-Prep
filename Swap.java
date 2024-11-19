import java.io.*;

public class Swap {
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter number (1): ");
		int n1 = Integer.parseInt(read.readLine());

		System.out.print("Enter number (2): ");
		int n2 = Integer.parseInt(read.readLine());

		n1 = n2;
		System.out.println("number (1): " + n1);

		System.out.println("number (2): " + n2);
	}
}
