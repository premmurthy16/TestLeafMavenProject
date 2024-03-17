package week3.day1;

public class CharOccurence {

	public static int i;
	public static int j;

	public static boolean flag;

	public static void main(String[] args) throws InterruptedException {

		String str = "rotator123";

		char[] ch;

		char revch;

		ch = str.toCharArray();
		int len = ch.length;
		// System.out.println(str.toCharArray());

		for (i = 0; i <= len - 1; i++) {

			System.out.println(ch[i]);
		}

		for (j = len - 1; j > 0; j--) {

			System.out.println(ch[j]);

		}

		if (ch[i] == ch[j]) {

			flag = true;

		}

		if (flag) {

			System.out.println("Equal char");
		} else {

			System.out.println("Not Equal char");
		}
	}
}
