import java.util.Scanner;
import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] arrayA = new int[5];
		int[] arrayB = new int[5];

		inputValues(arrayA, "A");
		inputValues(arrayB, "B");

		int[] arrayAB = mergeArrays(arrayA, arrayB);

		sortArray(arrayAB);
	}

	private static void inputValues(int[] array, String name) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Array " + name);

		for(int i = 0; i <= array.length - 1; i++) {
			System.out.print("Input number " + (i + 1) + ": ");
			array[i] = scan.nextInt();
		}

		System.out.println();
	}

	private static int[] mergeArrays(int[] arrayA, int[] arrayB) {
		int[] arrayAB = new int[arrayA.length + arrayB.length];

		System.arraycopy(arrayA, 0, arrayAB, 0, arrayA.length);
		System.arraycopy(arrayB, 0, arrayAB, arrayA.length, arrayB.length);

		return arrayAB;
	}

	private static void sortArray(int[] arrayAB) {
		Arrays.sort(arrayAB);

		System.out.println("Sorted values");
		for(int array : arrayAB) {
			System.out.print(array + "  ");
		}
		System.out.println();
	}
}

