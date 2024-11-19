import java.util.Scanner;

public class SumOfEven {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] nums = new int[5];
		int sum = 0;

		for(int i = 0; i <= nums.length - 1; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			nums[i] = scan.nextInt();

			if(nums[i] % 2 == 0) {
				sum += nums[i];
			}
		}

		System.out.println("Sum: " + sum);
	}
}
