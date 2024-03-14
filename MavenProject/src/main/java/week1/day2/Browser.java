package week1.day2;

public class Browser {
	
	public String  launchBrowser(String browserName) {
		
		//System.out.println(" Browser launched successfully");
		return browserName ;
		
		
	}
	
	public String  loadUrl() {
		
		return "Application url loaded successfully";
		
		
	}
	
	public static void main(String[] args) {
		
		Browser browerInfo=new Browser();
		
		
		String browserText=browerInfo.launchBrowser("Chrome");
		
		System.out.println(browserText);
		
		String app= browerInfo.loadUrl();
		
		System.out.println(app);
		
	}

}
