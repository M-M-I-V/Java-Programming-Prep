import java.util.Scanner;

public class TestScores {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] scores = {76, 89, 150, 135, 200, 76, 12, 100, 150, 28, 178, 189, 167, 200, 175, 150, 87, 99, 129, 149, 176, 200, 87, 35, 157, 189};
		int[] ranges = new int[8];

		for(int score : scores) {
			if(score >= 175) {
				ranges[7]++;
			} else if(score >= 150) {
				ranges[6]++;
			} else if(score >= 125) {
				ranges[5]++;
			} else if(score >= 100) {
				ranges[4]++;
			} else if(score >= 75) {
				ranges[3]++;
			} else if(score >= 50) {
				ranges[2]++;
			} else if(score >= 25) {
				ranges[1]++;
			} else {
				ranges[0]++;
			}
		}

		int sum = 0;

		for(int range : ranges) {
			sum += range;
		}

		System.out.println("\nRange\tFrequency");
		System.out.println("0-24\t" + ranges[0]);
		System.out.println("25-49\t" + ranges[1]);
		System.out.println("50-74\t" + ranges[2]);
		System.out.println("75-99\t" + ranges[3]);
		System.out.println("100-124\t" + ranges[4]);
		System.out.println("125-149\t" + ranges[5]);
		System.out.println("150-174\t" + ranges[6]);
		System.out.println("175-200\t" + ranges[7]);
		System.out.println("\nTotal:\t" + sum);
	}
}
