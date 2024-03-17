package week3.day1;

public class MethodOverriding extends MethodOverloading {

	public static void main(String[] args) {

		MethodOverriding mdoverriding = new MethodOverriding();

		mdoverriding.reportStep(" Called Sucessfully ");

	}

	@Override
	public void reportStep(String msg) {

		System.out.println("reportStep with 1 override parameter method " + msg);
	}

}
