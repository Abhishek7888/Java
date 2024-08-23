package Logic_Test;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[4];
		System.out.println("Enter numbers :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		 int temp = arr[0];
	        arr[0] = arr[1];
	        arr[1] = temp;
	        
	        temp = arr[2];
	        arr[2] = arr[3];
	        arr[3] = temp;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
