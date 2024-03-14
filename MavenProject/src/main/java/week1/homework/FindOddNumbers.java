package week1.homework;

public class FindOddNumbers {
public void findOddNum() {
		
		System.out.print("Odd Numbers are ");
		
		
		for(int i=1;i<=10;i++) {
					
			if(i%2!=0) {
				
				System.out.print(" " + i);
				continue;
				
			}
			
			
		}				
		System.out.println();
		}
		
		public void findEvenNum() {
			
			System.out.print("Even Numbers are ");
			
			
			for(int i=1;i<=10;i++) {
						
				if(i%2==0) {
					
					System.out.print(" " + i);
					continue;
					
				}
						
				
			}
		
		
	}
public static void main(String[] args) {
	
	FindOddNumbers oddAndEven=new FindOddNumbers();
	
	oddAndEven.findOddNum();
	oddAndEven.findEvenNum();
	
}
}
