package week3.day2;

public class Amazon extends CanaraBank {

	public static void main(String[] args) {

		Amazon amz = new Amazon();

		amz.recordPaymentDetails();
		amz.cardPayments();
		amz.cashOnDelivery();
		amz.internetBanking();
		amz.upiPayments();

	}

	@Override
	public void cardPayments() {
		// TODO Auto-generated method stub

		System.out.println("cardPayments -- > Implementd Method of Interface");

	}

	@Override
	public void cashOnDelivery() {
		// TODO Auto-generated method stub

		System.out.println("cashOnDelivery --> Implementd Method of Interface");

	}

	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub

		System.out.println("internetBanking --> Implementd Method of Interface");

	}

	@Override
	public void upiPayments() {
		// TODO Auto-generated method stub

		System.out.println("upiPayments --> Implementd Method of Interface");

	}

}
