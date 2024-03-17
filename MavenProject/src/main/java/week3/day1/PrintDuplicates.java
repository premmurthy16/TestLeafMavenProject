package week3.day1;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {

		int[] num = { 2, 5, 7, 7, 5, 9, 2, 3 };

		int len = num.length;
		Arrays.sort(num);

		for (int i = 0; i < len - 1; i++) {

			// System.out.println(num[i]);
			if (num[i] == num[i + 1]) {

				System.out.println("Duplicate " + num[i]);
			}

		}

	}

}
