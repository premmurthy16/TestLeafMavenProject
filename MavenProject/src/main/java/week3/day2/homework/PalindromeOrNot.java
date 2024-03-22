package week3.day2.homework;

import java.util.ArrayList;
import java.util.List;

public class PalindromeOrNot {

	public static void main(String[] args) {

		boolean flag = false;

		String input = "A man, a plan, a canal: Panama";

		// String input = "cars";

		// String input = "race a car";

		String withOutspace = input.replaceAll("\\W", "");

		System.out.println("withOutspace " + withOutspace);

		String intoLowercase = withOutspace.toLowerCase();

		System.out.println("intoLowercase " + intoLowercase);

		int len = intoLowercase.length() - 1;

		List<Character> forward = new ArrayList<>();
		List<Character> backward = new ArrayList<>();

		for (int i = 0; i <= len; i++) {

			char forwardText = intoLowercase.charAt(i);

			// System.out.println("forwardText " + forwardText);

			forward.add(forwardText);

			System.out.println(forward.add(forwardText));

		}

		for (int j = intoLowercase.length() - 1; j >= 0; j--) {

			char backwardText = intoLowercase.charAt(j);

			// System.out.println("backwardText " + backwardText);

			backward.add(backwardText);

			System.out.println(backward.add(backwardText));

		}

		for (int k = 0; k <= forward.size() - 1; k++) {

			// System.out.println(forward.get(k));

			// forward.get(k).charValue();

			// System.out.println(forward.get(k).charValue());

			// System.out.println(backward.get(k));

			// System.out.println(backward.get(k).charValue());

			if ((forward.get(k) != backward.get(k))) {

				flag = false;

			}
		}

		if (flag) {

			System.out.println("Palindrome");
		}

		else {

			System.out.println("Not Palindrome");
		}

	}

}
