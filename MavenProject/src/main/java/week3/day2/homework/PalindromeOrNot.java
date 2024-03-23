package week3.day2.homework;

import java.util.ArrayList;
import java.util.List;

public class PalindromeOrNot {

	static boolean flag;

	public static void main(String[] args) {

		String input = "A man, a plan, a canal: Panama";

		// String input = "cars";

		// String input = "race a car";

		String withOutspace = input.replaceAll("\\W", "");

		System.out.println("withOutspace " + withOutspace);

		String intoLowercase = withOutspace.toLowerCase();

		System.out.println("input Text String " + intoLowercase);

		int len = intoLowercase.length() - 1;

		System.out.println("Charactor Length of Given String is : " + len);

		List<Character> forward = new ArrayList<>();
		List<Character> backward = new ArrayList<>();

		// adding the char to the list from left to right

		for (int i = 0; i <= len; i++) {

			forward.add(intoLowercase.charAt(i));

			System.out.println(intoLowercase.charAt(i));

		}

		System.out.println(forward.size());

		System.out.println("forward text in Array" + forward);

		int forwardlistSize = forward.size() - 1;

		System.out.println("forward Text listSize " + forwardlistSize);

		// adding the char to the list from left to right

		for (int j = intoLowercase.length() - 1; j >= 0;) {

			backward.add(intoLowercase.charAt(j));

			System.out.println(intoLowercase.charAt(j));

			--j;

		}

		System.out.println("backward text in Array" + backward);

		int backwardlistSize = forward.size() - 1;

		System.out.println("backward Text listSize " + backwardlistSize);

		for (int k = 0; k <= forward.size() - 1; k++) {

			if (forward.get(k) != backward.get(k)) {

				flag = false;

			}

		}

		if (!flag) {

			System.out.println("Given text is not a Palindrome");

		}

		else {

			System.out.println("Given text is Palindrome");

		}

	}

}
