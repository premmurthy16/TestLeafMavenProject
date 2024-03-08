package week1.homework;

public class IsPrime {
	
	public void verifyPrimeOrNot(int num) {
		
		boolean flag=false;
		
		for(int i=2;i<=num/2;++i) {
			
			if(num % i==0) {
				
				flag=true;
				break;
			}
		}
		
		if(!flag) {
			
			System.out.println("Given Number " + num + " is Prime");
		}	
		else 
		{
			System.out.println("Given Number " + num + " is not Prime");
		
		
		}
		
		
		
	}

	public static void main(String[] args) {
		
		IsPrime verifyPrime=new IsPrime();
		
		verifyPrime.verifyPrimeOrNot(15);
		
	}
	
}
