import java.util.Scanner;
import java.util.Arrays;
import java.text.DecimalFormat;

public class Judges {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,##0.00");

		double[] judges = new double[8];

		for(int i = 0; i < judges.length; i++) {
			System.out.print("Judge " + (i + 1) + " => ");
			judges[i] = scan.nextDouble();
		}

		Arrays.sort(judges);

		double sum = 0;

		System.out.println("\nJudges Final Score: ");
		for(int i = 1; i < judges.length - 1; i++) {
			sum += judges[i];
			System.out.print(judges[i] + "  ");
		}

		System.out.println("\n\nFINAL SCORE: " + df.format(sum));
	}
}
