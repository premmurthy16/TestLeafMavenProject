package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindLastWordLengh {

	public static void main(String[] args) {

		String inputStr = "   fly me   to   the moon  ";

		System.out.println("Given input String " + inputStr);

		String triminputtext = inputStr.trim();

		// System.out.println("Given input String " + triminputtext);

		String[] splittedStrg = triminputtext.split(" ");

		List<String> list = new ArrayList<>();

		for (int i = 0; i <= splittedStrg.length - 1; i++) {

			String listofString = splittedStrg[i];

			// System.out.println("listofString " + listofString);
			list.add(listofString);

		}

		int listLengh = list.size() - 1;

		System.out.println("Size of the List Array " + listLengh);

		System.out.println("The Last word of the given String " + list.get(listLengh));

		System.out.println("The length of the Last word in the Given String is " + list.get(listLengh).length());

	}

}
