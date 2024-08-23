package Logic_Test;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number X:");
		int x = scanner.nextInt();

		System.out.println("Enter the base number Y:");
		int y = scanner.nextInt();

		if (isPowerOf(x, y)) {
			System.out.println(x + " is a power of " + y);
		} else {
			System.out.println(x + " is not a power of " + y);
		}
		scanner.close();
	}

	public static boolean isPowerOf(int x, int y) {

		if (y <= 1) {
			return x == 1;
		}
		while (x > 1) {
			if (x % y != 0) {
				return false;
			}
			x /= y;
		}

		return x == 1;
	}
}
