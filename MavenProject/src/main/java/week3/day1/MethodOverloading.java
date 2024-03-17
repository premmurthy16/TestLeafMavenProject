package week3.day1;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading methodoverload = new MethodOverloading();

		methodoverload.reportStep("Browser Launched", " Sucess");
		methodoverload.reportStep("Browser Launched", " Sucess ", true);

	}

	public void reportStep(String msg) {

		System.out.println("reportStep with 1 parameter method ");

	}

	public void reportStep(String msg, String status) {

		System.out.println("reportStep with 2 parameter method " + msg + status);

	}

	public void reportStep(String msg, String status, boolean flag) {
		System.out.println("reportStep with 3 parameter method " + msg + status + flag);

	}
}
