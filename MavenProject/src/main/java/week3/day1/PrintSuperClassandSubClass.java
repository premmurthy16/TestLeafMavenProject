package week3.day1;

public class PrintSuperClassandSubClass extends Chrome {

	public static void main(String[] args) {

		PrintSuperClassandSubClass print = new PrintSuperClassandSubClass();

		print.allMethod();
		print.openURL();
		print.navigateBack();
		print.openIncognito();
		print.clearCache();
		print.closeBrowser();
		print.browserName = "test";

	}

	public void allMethod() {

		System.out.println("Print all info of Super Class and SubClass");
	}

}
