package week3.day2.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumberusingList {

	public static void main(String[] args) {

		int[] inputValue = { 3, 2, 11, 4, 6, 7 };

		int x;

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i <= inputValue.length - 1; i++) {

			int input = inputValue[i];
			list.add(input);

			// System.out.println(list);

		}

		// sort the added List

		Collections.sort(list);

		System.out.println("Sorted List " + list);

		// list.get(1);

		// Get the 2nd Largest number from sorted List
		System.out.println("Second Largerst integer in the List Array is " + list.get(1));

	}

}
