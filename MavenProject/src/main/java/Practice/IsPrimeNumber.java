package Practice;

public class IsPrimeNumber {
	
	
		public static int result;
		public static boolean isPrime1(int num) {
			
			for(int i=2;i< num; i++) {
				
				result =num%i;
						
				System.out.println("result " + result);
						
				//if(num%i==0) {
					
					
				}
			return false;
				
			
			
			
						
	}
		
		public static void main(String[] args) {
			
			IsPrimeNumber test=new IsPrimeNumber();
			
			test.isPrime1(25);
			
		}

}
