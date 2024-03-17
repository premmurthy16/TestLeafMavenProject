package week3.day1;

public class BMW extends Car {

	public void name3() {
		System.out.println("BMW --name3");
	}

	
	public static void main(String[] args) {
		
		BMW bm=new BMW();
		
		bm.name1();
		bm.name2();
		bm.name3();
	}
}
