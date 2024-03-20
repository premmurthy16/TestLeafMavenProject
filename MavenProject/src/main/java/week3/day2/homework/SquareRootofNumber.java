package week3.day2.homework;

public class SquareRootofNumber {

	public static void main(String[] args) {

		int input = 81;
		int counter = 0;
		int inputvalue = input;
		for (int i = 1; i <= inputvalue; i++) {
			if (i % 2 != 0) {
				// System.out.println(i);
				inputvalue = inputvalue - i;
				counter = counter + 1;
				if (inputvalue == 0) {
					System.out.println("couter " + counter);
				}

			}
		}
		System.out.println("SqRoot of " + input + " is " + counter);
	}
}