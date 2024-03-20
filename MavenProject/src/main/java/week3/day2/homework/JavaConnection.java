package week3.day2.homework;

public class JavaConnection extends MySqlConnection {

	public static void main(String[] args) {

		JavaConnection connect = new JavaConnection();

		connect.connect();
		connect.disconnect();
		connect.executeQuery();
		connect.executeUpdate();
	}

	@Override
	public void connect() {
		System.out.println("impletmented connect method from the Interface DatabaseConnection");

	}

	@Override
	public void disconnect() {

		System.out.println("impletmented disconnect method from the Interface DatabaseConnection");

	}

	@Override
	public void executeUpdate() {

		System.out.println("impletmented executeUpdate method from the Interface DatabaseConnection");

	}
}
