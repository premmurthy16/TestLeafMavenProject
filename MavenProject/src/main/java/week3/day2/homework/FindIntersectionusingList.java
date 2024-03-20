package week3.day2.homework;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionusingList {

	public static boolean flag;

	public static void main(String[] args) {

		int[] listX = { 3, 2, 11, 4, 6, 7 };

		int[] listY = { 1, 2, 4, 8, 9, 7 };

		// len of the array index listX
		int lenXArray = listX.length - 1;

		//// len of the array index listY
		int lenYArray = listY.length - 1;

//declare List Array array
		List<Integer> listXArray = new ArrayList<>();

		List<Integer> listYArray = new ArrayList<>();

		List<Integer> commonValueInArray = new ArrayList<>();

		// iterate array listX

		for (int i = 0; i <= lenXArray; i++) {

			listXArray.add(listX[i]);

			// System.out.println("listXArray " + listXArray);

			// iterate array listy

			for (int j = 0; j <= lenYArray; j++) {

				listYArray.add(listY[j]);

				// System.out.println("listYArray.get(j) " + listYArray.get(j));
				// System.out.println("listXArray.get(i) " + listXArray.get(i));

				// compare array listX and listY

				if (listYArray.get(j) == listXArray.get(i)) {

					flag = true;

					commonValueInArray.add(listYArray.get(j));

				}

			}

		}
//print common numbers in the 2 array list
		if (flag) {

			System.out.println("The common Value between the two Array List are " + commonValueInArray);

		}

	}
}
