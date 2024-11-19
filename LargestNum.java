import java.util.*;

public class LargestNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] nums = new int[3];
		for(int i = 0; i <= 2; i++) {
			System.out.print("Enter number (" + (i + 1) + "): ");
			nums[i] = scan.nextInt();
		}

		int max = Arrays.stream(nums).max().getAsInt();
		System.out.println("Largest number: " + max);
	}	
}
