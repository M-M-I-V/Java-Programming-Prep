import java.util.Scanner;

public class RotateArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[][] nums = new int[3][3];

		System.out.println("Elements: ");
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				nums[i][j] = scan.nextInt();
			}
		}

		System.out.println("Rotated array: ");
		int[][] rotatedArray = rotateArray(nums);

		for(int[] num : rotatedArray) {
			for(int n : num) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

	}

	private static int[][] rotateArray(int[][] nums) {
		int l = nums.length;
		int[][] result = new int[l][l];

		for(int i = 0; i < l; i++) {
			for(int j = 0; j < l; j++) {
				result[j][l - i - 1] = nums[i][j];
			}
		}
		return result;
	}
}
