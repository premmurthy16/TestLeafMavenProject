package week1.homework;

import org.testng.reporters.jq.Main;

public class Fibonacciseries {
	
	public void fiboSeries() {
		
		int a=0;
		int b=1;
		int c;
		int d;
		
		if(a==0 ) {
			
			System.out.print(" " + a);
		}
		if(b==1) {
			
			System.out.print(" " + b);
		}
		
		for(int i=1;i<=8;i++) {
			
			c=a+b;
			
			System.out.print(" "+ c);
			
			a=b;
			b=c;
			
		}
		
	
	}
	
	public static void main(String[] args) {
		
		Fibonacciseries fibo=new Fibonacciseries();
		
		fibo.fiboSeries();
		
	}
	
}




