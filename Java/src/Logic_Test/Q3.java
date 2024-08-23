package Logic_Test;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] arr = { 1, 2, 3, 1, 4, 5, 6, 1, 2 };

		int[] newArr = remov(arr);

		System.out.println("Unique elements in the array:");
		for (int num : newArr) {
			System.out.print(num + " ");
		}
		scanner.close();
	}

	public static int[] remov(int[] array) {
		int n = array.length;
		int[] t = new int[n];
		int u = 0;

		for (int i = 0; i < n; i++) {
			boolean isDuplicate = false;

			for (int j = 0; j < u; j++) {
				if (array[i] == t[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				t[u++] = array[i];
			}
		}
		int[] result = new int[u];
		for (int i = 0; i < u; i++) {
			result[i] = t[i];
		}

		return result;
	}
}
